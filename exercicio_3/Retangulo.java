package exercicio_3;


import java.util.Scanner;

public class Retangulo {
	private double ladoA;
	private double ladoB;

	//  mudar o valor dos lados 
	public void mudarLados(double novoLadoA, double novoLadoB) {
		ladoA = novoLadoA;
		ladoB = novoLadoB;
	}

	// retornar o valor do lado A 
	public double retornarLadoA() {
		return ladoA;
	}

	//  retornar o valor do lado B 
	public double retornarLadoB() {
		return ladoB;
	}

	//  para calcular a area 
	public double calcularArea() {
		return ladoA * ladoB;
	}

	//  calcular o permetro 
	public double calcularPerimetro() {
		return 2 * (ladoA + ladoB);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe as medidas do local:");
		System.out.print("Lado A: ");
		double ladoA = scanner.nextDouble();

		System.out.print("Lado B: ");
		double ladoB = scanner.nextDouble();

		Retangulo local = new Retangulo();
		local.mudarLados(ladoA, ladoB);

		double area = local.calcularArea();
		double perimetro = local.calcularPerimetro();

		double quantidadePisos = area / 0.29; 
		double quantidadeRodapes = perimetro / 0.15; 

		System.out.println("Quantidade de pisos necessários: " + quantidadePisos);
		System.out.println("Quantidade de rodapés necessários: " + quantidadeRodapes);

		scanner.close();
	}
}
