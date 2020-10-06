package exercicio3;

public class Porta {
	private boolean aberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getDimensaoX() {
		return dimensaoX;
	}
	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}
	public double getDimensaoY() {
		return dimensaoY;
	}
	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}
	public double getDimensaoZ() {
		return dimensaoZ;
	}
	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}
	
	
	
	public Porta(boolean aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
		this.aberta = aberta;
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}
	public void abre() {
		if(aberta == true) {
			System.out.println("A porta já está aberta!");
		}else {
			aberta = true;
			System.out.println("Porta aberta!");
		}
	}
	
	public void fecha() {
		if(aberta == true) {
			aberta = false;
			System.out.println("Porta fechada!");
		}else {
			System.out.println("A porta já está fechada!");
		}
	}
	
	public void pinta(String s) {
		cor = s;
	}
	
	public boolean estaAberta() {
		return aberta;
	}
	@Override
	public String toString() {
		String estado;
		if(aberta == true) {
			estado = "A porta está berta!";
		}else {
			estado = "A porta está fechada!";
		}
		return estado + "\n"
			   + "Cor: " + cor + "\n"
		       + "Largura: " + dimensaoX + "\n"
		       + "Altura: " + dimensaoY + "\n"
		       + "Profundidade: " + dimensaoZ + "\n";
	}
	
	
	
}
