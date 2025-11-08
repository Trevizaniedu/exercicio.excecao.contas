package exercicio.excecao.contas;

public class ContaBancaria {

	private double saldo;
	private double limite;

	public ContaBancaria(double valorSaldo, double valorLimite) {
		this.saldo = valorSaldo;
		this.limite = valorLimite;
	}

	public double getSaldo() {
		return saldo;
	}

	protected double getLimite() {
		return limite;
	}

	public double getSaldoComLimite() {
		return saldo + limite;
	}

	public boolean sacar(double valor) throws ContaException {
		if (valor > 500) {
			throw new ContaException("Erro: Saques acima de R$ 500,00 não são permitidos.");
		}

		if (saldo - valor < -limite) {
			throw new ContaException("Erro: Saldo insuficiente considerando o limite disponível.");
		}

		saldo -= valor;
		return true;
	}

	public void depositar(double valor) throws ContaException {
		if (valor > 1000) {
			throw new ContaException("Erro: Depósitos acima de R$ 1.000,00 não são permitidos.");
		}

		saldo += valor;
	}
}
