package banking;
import personal.Cliente;

public class ContaCorrente extends Conta {
	private double taxaDeOperacao=0.5;
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	
	private void calcularTaxa(){
        super.sacar(taxaDeOperacao);
    }
	
	@Override
	public void sacar(double valor) {
		super.sacar(valor);	
		calcularTaxa();
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*-*-*-*-  Extrato Conta Corrente *-*-*-*- ");
		super.imprimirExtratoConta();
	}
	
}