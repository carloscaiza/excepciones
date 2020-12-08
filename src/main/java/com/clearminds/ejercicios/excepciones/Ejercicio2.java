package com.clearminds.ejercicios.excepciones;

import java.io.File;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("archivo1.txt");
		f.createNewFile(); // EL MÉTODO CREATE NEW FILE PODRÍA ARROJAR  IOException. es CHECKED
		
		
	}

}
