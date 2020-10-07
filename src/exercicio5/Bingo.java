package exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bingo {
	Random rand = new Random();
	
	private List<Integer> numerosBingo = new ArrayList<Integer>();
	private int rodadas = 1;
	
	public int getRodadas() {
		return rodadas;
	}

	public void setRodadas(int rodadas) {
		this.rodadas = rodadas;
	}

	public List<Integer> getNumerosBingo() {
		return numerosBingo;
	}

	public void setNumerosBingo(List<Integer> numerosBingo) {
		this.numerosBingo = numerosBingo;
	}
	
	
	
	public void populaNumerosBingo() {
		for(int i = 1; i < 76; i++) {
			numerosBingo.add(i);
		}
	}
		
	public int sorteiaNumero() {
		rodadas += 1;
		if(numerosBingo.size() < 1) {
			System.out.println("Algo deu errado");
			return -1;
		}else {
		int numeroSorteado = numerosBingo.get(rand.nextInt(numerosBingo.size()));
		int indexExcluir = numerosBingo.indexOf(numeroSorteado);
		numerosBingo.remove(indexExcluir);
		return numeroSorteado;
		}
	}

}
