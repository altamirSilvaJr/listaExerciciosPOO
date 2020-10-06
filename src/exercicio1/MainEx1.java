package exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
		System.out.printf("Digite o id do Funcion�rio: ");
		func.setIdFunc(sc.nextInt());
		sc.nextLine();
		
		System.out.printf("Difite o nome do funcion�rio: ");
		func.setNomeFunc(sc.nextLine());
		
		System.out.printf("Digite o departamento do funcion�rio: ");
		func.setDepartamento(sc.nextLine());
		
		System.out.printf("Digite a data de contrata��o(dd/mm/aaaa): ");
		String dataContratacao = sc.nextLine();
		LocalDate dataFunc = LocalDate.parse(dataContratacao, formatter);
		func.setDataContratacao(dataFunc);
		
		System.out.printf("Digite o sal�rio do funcion�rio: R$ ");
		func.setSalario(sc.nextDouble());
		sc.nextLine();
		
		System.out.printf("Digite o n�mero do documento do funcion�rio: ");
		func.setDocumento(sc.nextLine());
		func.setAtivo(true);
		
		System.out.printf("Digite o valor a ser acrescentado ao sal�rio: ");
		double aumento = sc.nextDouble();
		func.aumentarSalario(aumento);
		
		func.imprimir();
		
		func.demiteFuncionario();
		
		func.imprimir();
		sc.close();
	}

}
