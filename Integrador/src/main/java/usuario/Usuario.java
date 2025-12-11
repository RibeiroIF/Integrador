package usuario;

import java.util.ArrayList;
import java.util.List;

import enums.ESituacaoPasse;
import exceptions.PasseRegistradoException;

public class Usuario {

	private String login, senha, nomeCompleto, cpf, email, telefonePrincipal;
	private List<Passe> passes = new ArrayList<Passe>();
	private List<Cartao> cartoes = new ArrayList<Cartao>();
	private List<Extratos> extratos = new ArrayList<Extratos>();
	private Passe passe;
	private Cartao cartao;
	private Extratos extrato;

	public Usuario() {
		super();
	}

	public Usuario(String nomeCompleto, String cpf) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.extrato = new Extratos();
		
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefonePrincipal() {
		return telefonePrincipal;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefonePrincipal(String telefonePrincipal) {
		this.telefonePrincipal = telefonePrincipal;
	}
	
	public List<Passe> getPasses() {
		return passes;
	}

	public List<Cartao> getCartoes() {
		return cartoes;
	}

	public void setPasses(List<Passe> passes) {
		this.passes = passes;
	}

	public void setCartoes(List<Cartao> cartoes) {
		this.cartoes = cartoes;
	}

	public List<Extratos> getExtratos() {
		return extratos;
	}

	public void setExtratos(List<Extratos> extratos) {
		this.extratos = extratos;
	}

	public Extratos getExtrato() {
		return extrato;
	}

	public void setExtrato(Extratos extrato) {
		this.extrato = extrato;
	}

	public Passe getPasse() {
		return passe;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setPasse(Passe passe) {
		this.passe = passe;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public void adicionarPasse(Passe passe) throws PasseRegistradoException {
		if (passe.getSituacaoPasse() == ESituacaoPasse.REGISTRADO) {
			throw new PasseRegistradoException("Solicitação enviada para o proprietário");
		}
		else {
			this.passes.add(passe);
			passe.setSituacaoPasse(ESituacaoPasse.REGISTRADO);
		}
	}
	
	public void removerPasse(Passe passe) {
		this.passes.remove(passe);
		passe.setSituacaoPasse(ESituacaoPasse.LIVRE);
	}
	
	public void adicionarMetodo(Cartao cartao) {
		this.cartoes.add(cartao);
	}
	
	public void removerMetodo(Cartao cartao) {
		this.cartoes.remove(cartao);
	}

}
