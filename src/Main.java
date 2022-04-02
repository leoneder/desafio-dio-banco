
public class Main {
	public static void main(String[] args) {
		Cliente geraldo = new Cliente();
		geraldo.setNome("geraldo");
		
		Conta cc = new ContaCorrente(geraldo);
		Conta poupança = new ContaPoupança(geraldo);
		
		cc.depositar(100);
		cc.transferir(10, poupança);
		
		cc.imprimirExtrato();
		poupança.imprimirExtrato();
	}
}
