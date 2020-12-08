package com.clearminds.ejercicios.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio4 {

	public void test() throws IOException{
		
		File f = new File("archivo1.txt");
		f.createNewFile();
		
	}
	
	public void test1(){
		try {
			test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
