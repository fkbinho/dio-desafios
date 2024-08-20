package Aplication;

import Model.iPhone;

public class Main {

	public static void main(String[] args) {

		iPhone meuIphone = new iPhone();
		
		meuIphone.selecionarMusica("Imagine - John Lennon");
		meuIphone.tocar();
		meuIphone.pausar();
		
		meuIphone.ligar("123-456-789");
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();

		meuIphone.exibirPagina("https://web.dio.me/home");
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();

	}

}
