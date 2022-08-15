import banking.Conta;
import banking.ContaCorrente;
import banking.ContaPoupanca;
import personal.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente wagner = new Cliente();
		wagner.setNome("Wagner");
		
		Conta cc = new ContaCorrente(wagner);
		Conta poupanca = new ContaPoupanca(wagner);

		cc.depositar(700);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		System.out.println("*-*-*-*-*-*-*-*");
		poupanca.imprimirExtrato();
		
		System.out.println();
	}

}
