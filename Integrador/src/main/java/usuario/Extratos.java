package usuario;

import java.util.ArrayList;
import java.util.List;

import interfaces.Itens;

public class Extratos implements Itens {

	private String id;
	private List <Recarga> extratos = new ArrayList<>();

	public Extratos() {
		super();
	}

	public Extratos(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void adicionarExtrato(Recarga recarga) {
		extratos.add(recarga);
	}

	@Override
	public String exibirItens() {
		StringBuilder sb = new StringBuilder();
		
		for (Recarga recarga : extratos) {
			sb.append("\t").append(recarga.getData()).append("\n");
			sb.append("\t").append(recarga.getHorario()).append("\tValor: ").append(recarga.getValor()).append("\n");
		}
		
		return sb.toString();
	}
}
