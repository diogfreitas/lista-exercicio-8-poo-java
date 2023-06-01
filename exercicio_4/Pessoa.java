package exercicio_4;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	private double altura;

	public Pessoa(String nome, int idade, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public void envelhecer() {
		idade++;
		if (idade < 21) {
			crescer(0.5);
		}
	}

	public void engordar(double peso) {
		this.peso += peso;
	}

	public void emagrecer(double peso) {
		this.peso -= peso;
	}

	public void crescer(double altura) {
		this.altura += altura;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}
}
