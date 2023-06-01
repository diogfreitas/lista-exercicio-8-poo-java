package exercicio_5;

public class ContaCorrente {

	private int numeroConta;
	private String nomeCorrentista;
	private double saldo;

	public ContaCorrente(int numeroConta, String nomeCorrentista) {
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = 0.0;
	}

	
	public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}

	//  para alterar o nome 
	public void alterarNome(String novoNome) {
		nomeCorrentista = novoNome;
	}

	//  para realizar um depósito 
	public void deposito(double valor) {
		saldo += valor;
	}

	// realizar um saque da conta 
	public void saque(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente para realizar o saque.");
		}
	}

	// retornar os valores dos atributos
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public double getSaldo() {
		return saldo;
	}
}
