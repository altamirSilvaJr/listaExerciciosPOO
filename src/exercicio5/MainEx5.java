package exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainEx5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bingo bingo = new Bingo();
		Cartela cartela = new Cartela();
		
		bingo.populaNumerosBingo();
		cartela.populaCartela(bingo.getNumerosBingo());
		bingo.getNumerosBingo().clear();
		bingo.populaNumerosBingo();
		System.out.println("Cartela do jogador: " + cartela.getCartelaJogador());
		
		while(cartela.getNumerosMarcados() < 24) {
		System.out.println("Rodada: " + bingo.getRodadas());
		int numeroSorteado = bingo.sorteiaNumero();
		System.out.println("Sorteado: " + numeroSorteado);
		cartela.confereCartela(numeroSorteado);
		cartela.gritaBingo();
		System.out.println("Números que faltam para completar a cartela: " + cartela.getCartelaJogador());
		System.out.println("Aperte enter para continuar...");
		sc.nextLine();
		}
		
		System.out.println("Total de rodadas: " + bingo.getRodadas());
		
	}
}
