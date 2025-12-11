package mainpack;

import java.util.Scanner;

import usuario.Passagem;
import usuario.Passe;
import usuario.Usuario;

public class ControleGeral {
	
	Scanner input = new Scanner(System.in);
	
	public String resumoGeral(Usuario usuario) {
		StringBuilder sb = new StringBuilder();
		sb.append("===============================================").append("\n");
		sb.append("\t\tTela Inicial").append("\n");
		sb.append("===============================================").append("\n");
		sb.append("    Olá ").append(usuario.getNomeCompleto()).append(", seja bem-vindo(a)").append("\n");
		sb.append("-----------------------------------------------").append("\n");
		sb.append("\t   Passagens").append("\t    ").append("Recargas").append("\n");
		sb.append("\t-------------------------------").append("\n");
		
		for (Passe passe : usuario.getPasses()) {
			sb.append("\t\t\t").append(passe.getId()).append("\n");
			for (Passagem passagem : passe.getPassagens()) {
				sb.append("\t").append(passagem.getData()).append("\n");
				sb.append("\t").append(passagem.getHorario()).append("\tValor: ").append(passagem.getValor()).append("\n");
			}
		}
		
		sb.append("===============================================").append("\n");
		sb.append("     ").append("Aperte 1 para acessar o menu de opções").append("\n");
		return sb.toString();
	}
	
	public String acessoRapido(Usuario usuario) {
		StringBuilder sb = new StringBuilder();
		sb.append(usuario.getNomeCompleto()).append("\n");
		sb.append("-----------------------------------------------").append("\n");
		sb.append("1).......................................Início").append("\n");
		sb.append("2).......................................Passes").append("\n");
		sb.append("3).........................Métodos de Pagamento").append("\n");
		return sb.toString();
	}
	
	public String menuAcesso() {
		StringBuilder sb = new StringBuilder();
		
		return sb.toString();
	}
	
}
