package exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cartela {
	Random rand = new Random();
	private List<Integer> cartelaJogador = new ArrayList<Integer>();
	private int numerosMarcados = 0;
	

	public List<Integer> getCartelaJogador() {
		return cartelaJogador;
	}

	public void setCartelaJogador(List<Integer> cartelaJogador) {
		this.cartelaJogador = cartelaJogador;
	}
	
	public int getNumerosMarcados() {
		return numerosMarcados;
	}

	public void setNumerosMarcados(int numerosMarcados) {
		this.numerosMarcados = numerosMarcados;
	}

	public void populaCartela(List<Integer> cartelaBingo) {
		List<Integer> cartelaSorteio = cartelaBingo;
		for(int i = 0; i < 24; i++) {
			int numeroAcrescentar = cartelaSorteio.get(rand.nextInt(cartelaSorteio.size()));
			cartelaJogador.add(numeroAcrescentar);
			int numeroExcluir = cartelaSorteio.indexOf(numeroAcrescentar);
			cartelaSorteio.remove(numeroExcluir);
		}
	}
	
	public void confereCartela(int numeroSorteado) {
		if(cartelaJogador.contains(numeroSorteado)) {
			System.out.println("Marquei!");
			int remover = cartelaJogador.indexOf(numeroSorteado);
			cartelaJogador.remove(remover);
			System.out.println("Faltam " + cartelaJogador.size());
			numerosMarcados += 1;
		}
	}
	
	public void gritaBingo() {
		if(numerosMarcados >= 24) {
			System.out.println("BINGO!!!");
		}else {
			System.out.println("Próxima rodada!");
		}
	}
	

}
