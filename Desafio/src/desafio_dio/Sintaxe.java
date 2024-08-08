package desafio_dio;

import java.util.Scanner;

public class Sintaxe {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Agência:");
		String agencia = scan.nextLine();
		
		System.out.println("Por favor, digite o número da Conta:");
		int numero = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Por favor, digite o nome do Cliente:");
		String nomeCliente = scan.nextLine();
		
		System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scan.nextDouble();
		
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

		System.out.println(mensagem);

		scan.close();
	}

}
