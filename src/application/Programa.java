package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta minhaConta = new Conta();
		
		minhaConta.titular = "Raissa yope";
		minhaConta.numero = 102930;
		minhaConta.saldo = 200;
		
		System.out.println("saldo atual: "+ minhaConta.saldo);
		
		// TODO: adicionar mensagem caso o cliente  não consiga sacar; ou uma 
		// mensagem de sucesso!
		
		if(minhaConta.sacar(2001)) {
			System.out.println("Operação efetuada com sucesso");
		}else {
			System.out.println("erro... voce é pobre consiga dinheiro para fazer isso");
		}
		
		minhaConta.sacar(234.50);
		
		System.out.println("saldo depois de sacar: "+ minhaConta.saldo);
		
		minhaConta.depositar(100);
		
		System.out.println("saldo depois de depositar:" + minhaConta.saldo);
		
		
	}
	


}
