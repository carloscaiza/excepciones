package com.clearminds.ejercicios.excepciones;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = null;
		String b = "abc";
		String c = null;
		try {
			c = b.toUpperCase();
			b.toUpperCase();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			b.substring(7);
			System.out.println("Se acabó");
			
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
