package br.com.bytebank.modelo;

public class InsufficientBalanceException extends RuntimeException {

	public InsufficientBalanceException(String msg) {
		super(msg);
	}
	
}
