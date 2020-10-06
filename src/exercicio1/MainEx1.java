package exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
		System.out.printf("Digite o id do Funcionário: ");
		func.setIdFunc(sc.nextInt());
		sc.nextLine();
		
		System.out.printf("Difite o nome do funcionário: ");
		func.setNomeFunc(sc.nextLine());
		
		System.out.printf("Digite o departamento do funcionário: ");
		func.setDepartamento(sc.nextLine());
		
		System.out.printf("Digite a data de contratação(dd/mm/aaaa): ");
		String dataContratacao = sc.nextLine();
		LocalDate dataFunc = LocalDate.parse(dataContratacao, formatter);
		func.setDataContratacao(dataFunc);
		
		System.out.printf("Digite o salário do funcionário: R$ ");
		func.setSalario(sc.nextDouble());
		sc.nextLine();
		
		System.out.printf("Digite o número do documento do funcionário: ");
		func.setDocumento(sc.nextLine());
		func.setAtivo(true);
		
		System.out.printf("Digite o valor a ser acrescentado ao salário: ");
		double aumento = sc.nextDouble();
		func.aumentarSalario(aumento);
		
		func.imprimir();
		
		func.demiteFuncionario();
		
		func.imprimir();
		sc.close();
	}

}
