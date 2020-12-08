package com.clearminds.ejercicios.excepciones;

public class BabyException extends RuntimeException{// Todas son unchecked
	public BabyException(String manejo){
		super(manejo);
	}
}
