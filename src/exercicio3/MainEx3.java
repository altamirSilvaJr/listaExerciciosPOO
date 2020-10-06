package exercicio3;

import java.util.Scanner;

public class MainEx3 {

	public static void main(String[] args) {
		int op = 1;
		Scanner sc = new Scanner(System.in);
		Porta porta = new Porta(false, "branca", 1.5, 2.4, 0.3);
		
		
		while(op != 0) {
			System.out.println("1 - Exibir características da porta");
			System.out.println("2 - Abrir a porta");
			System.out.println("3 - Fechar a porta");
			System.out.println("4 - pintar a porta");
			System.out.println("5 - Verificar se porta está aberta");
			System.out.println("0 - Encerrar programa");
			
			System.out.printf("Escolha a opção desejada: ");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				System.out.println(porta);
				break;
			case 2:
				porta.abre();
				break;
			case 3:
				porta.fecha();
				break;
			case 4:
				System.out.printf("Digite a nova cor para a porta: ");
				sc.nextLine();
				String novaCor = sc.nextLine();
				porta.pinta(novaCor);
				System.out.println("Porta pinta de " + novaCor);
				break;
			case 5:
				if(porta.estaAberta() == true) {
					System.out.println("A porta está aberta!");
				}else {
					System.out.println("A porta está fechada");
				}
				break;
			case 0:
				System.out.println("Encerrando programa...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}

	}

}
