package usuario;

import java.time.LocalDate;

import enums.EBandeiraCartao;
import enums.ETipoCartao;
import interfaces.Itens;

public class Cartao implements Itens {

	private String numeroCartao, nomeProprietario;
	private LocalDate dataValidade;
	private ETipoCartao tipoCartao;
	private EBandeiraCartao bandeiraCartao;
	
	public Cartao() {
		super();
	}

	public Cartao(String numeroCartao, String nomeProprietario, LocalDate dataValidade) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeProprietario = nomeProprietario;
		this.dataValidade = dataValidade;
	}

	public Cartao(String numeroCartao, String nomeProprietario, LocalDate dataValidade, ETipoCartao tipoCartao,
			EBandeiraCartao bandeiraCartao) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeProprietario = nomeProprietario;
		this.dataValidade = dataValidade;
		this.tipoCartao = tipoCartao;
		this.bandeiraCartao = bandeiraCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

	public ETipoCartao getTipoCartao() {
		return tipoCartao;
	}

	public EBandeiraCartao getBandeiraCartao() {
		return bandeiraCartao;
	}

	public void setTipoCartao(ETipoCartao tipoCartao) {
		this.tipoCartao = tipoCartao;
	}

	public void setBandeiraCartao(EBandeiraCartao bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}

	@Override
	public String exibirItens() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.getNomeProprietario()).append("\n");
		sb.append(this.getBandeiraCartao()).append("\n");
		sb.append(this.getTipoCartao()).append("\n");
		sb.append("---------------------------------------").append("\n");
		
		return sb.toString();
	}
	
}
