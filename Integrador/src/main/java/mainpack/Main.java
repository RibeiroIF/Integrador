package mainpack;

import java.time.LocalDate;
import java.util.Scanner;

import enums.EBandeiraCartao;
import enums.ETipoCartao;
import enums.ETipoPasse;
import exceptions.PasseRegistradoException;
import usuario.Cartao;
import usuario.Passagem;
import usuario.Passe;
import usuario.Recarga;
import usuario.Usuario;

public class Main {

	public static void main(String[] args) {
		
		ControleGeral controle = new ControleGeral();
		Scanner input = new Scanner(System.in);
		
		Usuario usuario = new Usuario("Gabriel Ribeiro", "07847044900");
		
		Passe passe1 = new Passe("1", "Passe Principal 1");
		passe1.setTipoPasse(ETipoPasse.CIDADAO);
		try {
			usuario.adicionarPasse(passe1);
		} catch (PasseRegistradoException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		
		Cartao cartao1 = new Cartao("1112-2222-3333-4444", "GABRIEL R DE SOUZA", LocalDate.ofYearDay(2028, 10));
		cartao1.setTipoCartao(ETipoCartao.CREDITO);
		cartao1.setBandeiraCartao(EBandeiraCartao.MASTERCARD);
		usuario.adicionarMetodo(cartao1);
		
		passe1.registrarRecarga(new Recarga(10, LocalDate.of(2025, 10, 10), LocalDate.now()));
		passe1.registrarPassagem(new Passagem(5, LocalDate.of(2025, 07, 25), LocalDate.now()));
		
		System.out.println(controle.resumoGeral(usuario));
		int confirmacao = input.nextInt();
		
		while (confirmacao != 1) {
			System.out.println("Aperte 1 para acessar o menu de opções");
			confirmacao = input.nextInt();
		}
		
		System.out.println(controle.acessoRapido(usuario));
		confirmacao = input.nextInt();
		
		while (confirmacao < 1 || confirmacao > 4) {
			System.out.println("Opção inválida, favor selecionar entre 1 e 4");
			confirmacao = input.nextInt();
		}
		
		switch(confirmacao) {
			case 1:
				System.out.println(controle.resumoGeral(usuario));
				break;
			case 2:
				System.out.println(passe1.exibirItens());
				break;
			case 3:
				System.out.println(cartao1.exibirItens());
				break;
				
		}
		
		input.close();
	}

}
