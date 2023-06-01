package Exercicio_1;

public class Bola {

	// Atributos
	private String cor;
	private double circunferencia;
	private String material;

	// trocar a cor da bola
	public void trocaCor(String novaCor) {
		cor = novaCor;
	}

	// mostrar a cor atual da bola
	public String mostraCor() {
		return cor;
	}

	public Bola(String cor, double circunferencia, String material) {
		this.cor = cor;
		this.circunferencia = circunferencia;
		this.material = material;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}

