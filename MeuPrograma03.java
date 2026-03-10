package meuProjeto;

public class MeuPrograma03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta contaCorrente = new Conta();
		contaCorrente.dono = "Alexandre";
		contaCorrente.limite = 20000.0;
		contaCorrente.numero = 1234;
		contaCorrente.saldo = 4000.0;
		
		System.out.println("É a conta do(a) " + contaCorrente.dono);
		System.out.println("Meu saldo é " + contaCorrente.saldo);
		
		contaCorrente.sacar(1500.0);
		
		System.out.println("Meu saldo após saque é de " + contaCorrente.saldo);
	}

}
