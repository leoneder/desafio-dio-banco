
public class Main {
	public static void main(String[] args) {
		Cliente geraldo = new Cliente();
		geraldo.setNome("geraldo");
		
		Conta cc = new ContaCorrente(geraldo);
		Conta poupan�a = new ContaPoupan�a(geraldo);
		
		cc.depositar(100);
		cc.transferir(10, poupan�a);
		
		cc.imprimirExtrato();
		poupan�a.imprimirExtrato();
	}
}
