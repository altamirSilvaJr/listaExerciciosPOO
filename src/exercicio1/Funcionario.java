package exercicio1;

import java.time.LocalDate;

public class Funcionario {
	
	public int idFunc;
	public String nomeFunc;
	public String departamento;
	public LocalDate dataContratacao;
	public double salario;
	public String documento;
	public boolean ativo;
	
		public int getIdFunc() {
		return idFunc;
	}

	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void aumentarSalario(double aumento) {
		if(aumento < 0 ) {
			System.out.println("O valor de aumento deve ser positivo!");
		}else {
			salario += aumento;
		}
		
	}
	
	public void demiteFuncionario() {
		if(!ativo) {
		ativo = false;
		}else {
			System.out.println("Funcion�rio inativo no sistema.");
		}
	}
	
	public void imprimir() {
		System.out.println("ID Funcion�rio: " + idFunc);
		System.out.println("Nome do Funcion�rio: " + nomeFunc);
		System.out.println("Departamento: " + departamento);
		System.out.println("Data de admiss�o: " + dataContratacao);
		System.out.println("Sal�rio: R$ " + salario);
		System.out.println("Documento: " + documento);
		System.out.println("Situa��o: " + ativo);
		
	}

	
	
	

}
