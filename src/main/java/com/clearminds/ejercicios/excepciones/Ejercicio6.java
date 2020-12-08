package com.clearminds.ejercicios.excepciones;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		try {
			a.substring(1);
			System.out.println(a.substring(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("Entra al finally");
		}
		System.out.println("Fin del programa");
		
	}

}
