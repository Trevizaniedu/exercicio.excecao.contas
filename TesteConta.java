package exercicio.excecao.contas;

public class TesteConta {

	public static void main(String[] args) {
		try {
			ContaBancaria conta = new ContaBancaria(300, 200);

			System.out.println("Saldo inicial: R$ " + conta.getSaldo());
			System.out.println("Limite: R$ " + conta.getLimite());
			System.out.println("Saldo total (com limite): R$ " + conta.getSaldoComLimite());

			conta.depositar(500);
			System.out.println("\nDepósito de R$500 realizado. Saldo atual: R$ " + conta.getSaldo());

			conta.sacar(400);
			System.out.println("Saque de R$400 realizado. Saldo atual: R$ " + conta.getSaldo());

			conta.sacar(600);

		} catch (ContaException e) {
			System.out.println("\n" + e.getMessage());
		}

		try {

			ContaBancaria conta2 = new ContaBancaria(100, 100);
			conta2.depositar(1500);
		} catch (ContaException e) {
			System.out.println(e.getMessage());
		}
	}
}
