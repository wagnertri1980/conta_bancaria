package banking;
import personal.Cliente;

public class ContaPoupanca extends Conta {
	private double limite=500.0;
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	private void calcularTaxa(){
        super.sacar(limite);
    }
	
	@Override
	public void sacar(double valor) {
		if((limite+consultaSaldo()>= valor)) {
			super.sacar(valor);
			System.err.println("consultasaldo="+ consultaSaldo());
		}
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*-*-*-*-  Extrato Conta Poupança *-*-*-*- ");
		super.imprimirExtratoConta();
	}
	
}