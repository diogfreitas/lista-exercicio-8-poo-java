package exercicio_7;

public class BichinhoVirtual {
	private String nome;
	private int fome;
	private int saude;
	private int idade;

	
	public BichinhoVirtual(String nome) {
		this.nome = nome;
		this.fome = 0;
		this.saude = 100;
		this.idade = 0;
	}

	//  alterar os atributos 
	public void alterarNome(String novoNome) {
		this.nome = novoNome;
	}

	public void alterarFome(int novaFome) {
		this.fome = novaFome;
	}

	public void alterarSaude(int novaSaude) {
		this.saude = novaSaude;
	}

	public void alterarIdade(int novaIdade) {
		this.idade = novaIdade;
	}

	// retornar os atributos 
	public String retornarNome() {
		return nome;
	}

	public int retornarFome() {
		return fome;
	}

	public int retornarSaude() {
		return saude;
	}

	public int retornarIdade() {
		return idade;
	}

	//  calcular o humor do bichinho 
	public String retornarHumor() {
		if (fome > 70 && saude < 30) {
			return "Triste";
		} else if (fome > 70 || saude < 30) {
			return "Pouco feliz";
		} else if (fome < 30 && saude > 70) {
			return "Feliz";
		} else {
			return "Muito feliz";
		}
	}
}
