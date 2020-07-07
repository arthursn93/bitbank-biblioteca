package br.com.alura.bitbank;

import br.com.bitbank.banco.modelo.*;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123,123123);
		c.depositar(2000);
		
		System.out.println(c.getSaldo());
	}

}
