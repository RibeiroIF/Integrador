package usuario;

import java.util.ArrayList;
import java.util.List;

import enums.ESituacaoPasse;
import enums.ETipoPasse;
import interfaces.Itens;

public class Passe implements Itens{

	private String id, titulo;
	private double saldo;
	private Recarga recarga;
	private Passagem passagem;
	private ETipoPasse tipoPasse;
	private ESituacaoPasse situacaoPasse;
	private Extratos extratos;
	private List<Recarga> recargas = new ArrayList<Recarga>();
	private List<Passagem> passagens = new ArrayList<Passagem>();
	
	public Passe() {
		super();
		this.saldo = 0;
		this.extratos = new Extratos();
	}

	public Passe(String id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.saldo = 0;
		this.extratos = new Extratos();
	}

	public String getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Recarga getRecarga() {
		return recarga;
	}

	public Passagem getPassagem() {
		return passagem;
	}

	public ETipoPasse getTipoPasse() {
		return tipoPasse;
	}

	public ESituacaoPasse getSituacaoPasse() {
		return situacaoPasse;
	}

	public void setTipoPasse(ETipoPasse tipoPasse) {
		this.tipoPasse = tipoPasse;
	}

	public void setSituacaoPasse(ESituacaoPasse situacaoPasse) {
		this.situacaoPasse = situacaoPasse;
	}

	public Extratos getExtratos() {
		return extratos;
	}
	
	public List<Recarga> getRecargas() {
		return recargas;
	}

	public List<Passagem> getPassagens() {
		return passagens;
	}

	public void setExtratos(Extratos extratos) {
		this.extratos = extratos;
	}

	public void setRecargas(List<Recarga> recargas) {
		this.recargas = recargas;
	}

	public void setPassagens(List<Passagem> passagens) {
		this.passagens = passagens;
	}

	public void registrarRecarga(Recarga recarga) {
		this.saldo += recarga.getValor();
		this.recargas.add(recarga);
		this.extratos.adicionarExtrato(recarga);
	}
	
	public void registrarPassagem(Passagem passagem) {
		this.saldo -= passagem.getValor();
		this.passagens.add(passagem);
	}

	@Override
	public String exibirItens() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.getId()).append("\n");
		sb.append(this.getTitulo()).append("\n");
		sb.append("R$: ").append(this.getSaldo()).append("\n");
		sb.append("-----------------------------------------------").append("\n");

		return sb.toString();
	}
	
}
