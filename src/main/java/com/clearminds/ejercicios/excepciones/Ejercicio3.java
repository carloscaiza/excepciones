package com.clearminds.ejercicios.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("archivo1.txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		System.out.println("La vida sigue"); 
	}

}
