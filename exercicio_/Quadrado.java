package exercicio_;

public class Quadrado {
	
	private double lado;

	// mudar o valor do lado do quadrado
	public void mudarLado(double novoLado) {
		lado = novoLado;
	}

	//  retornar o valor do lado do quadrado
	public double retornarLado() {
		return lado;
	}

	//  calcular a area do quadrado
	public double calcularArea() {
		return lado * lado;
	}

	// 
	public Quadrado(double lado) {
		this.lado = lado;
	}

	// 
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
}
