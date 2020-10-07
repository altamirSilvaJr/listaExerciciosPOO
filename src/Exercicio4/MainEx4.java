package exercicio4;

import java.util.Scanner;

import exercicio3.Porta;

public class MainEx4 {

	public static void main(String[] args) {
		int op = 1;
		Scanner sc = new Scanner(System.in);
		Porta porta1 = new Porta(false, "branca", 1.5, 2.4, 0.3);
		Porta porta2 = new Porta(false, "amarela", 1.5, 2.4, 0.3);
		Porta porta3 = new Porta(false, "vermelha", 1.5, 2.4, 0.3);
		Casa casa = new Casa("Azul", porta1, porta2, porta3);
		
		while(op != 0) {
			System.out.println("1 - Exibir características da casa");
			System.out.println("2 - Abrir ou fechar porta 1");
			System.out.println("3 - Abrir ou fechar porta 2");
			System.out.println("4 - Abrir ou fechar porta 3");
			System.out.println("5 - Pintar casa");
			System.out.println("6 - Verificar quantas portas estão abertas");
			System.out.println("0 - Encerrar programa");
			
			System.out.printf("Escolha a opção desejada: ");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				System.out.println(casa);
				break;
			case 2:
				if(porta1.estaAberta()) {
					porta1.fecha();
				}else {
					porta1.abre();
				}
				break;
			case 3:
				if(porta2.estaAberta()) {
					porta2.fecha();
				}else {
					porta2.abre();
				}
				break;
			case 4:
				if(porta3.estaAberta()) {
					porta3.fecha();
				}else {
					porta3.abre();
				}
				break;
			case 5:
				System.out.printf("Digite a nova cor para a casa: ");
				sc.nextLine();
				String novaCor = sc.nextLine();
				casa.pinta(novaCor);
				break;
			case 6:

				System.out.println("Estão abertas " + casa.quantasPortasAbertas() + " portas.");

				break;
			case 0:
				System.out.println("Encerrando programa...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
	sc.close();	
	}
	

}
