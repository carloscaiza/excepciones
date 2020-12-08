package com.clearminds.ejercicios.excepciones;

import java.sql.SQLException;

public class Ejercicio9 {
	public void salir(boolean tienePermiso) throws ToxicaException{
		if(!tienePermiso){
			throw new ToxicaException("Con que permiso???");
		}else{
			System.out.println("Puede salir");
		}
	}
	public void salirconAmigos(boolean tienePermiso){
		if(!tienePermiso){
			throw new BabyException("Con un besito se me quita el enojo");
		}else{
			System.out.println("Puede salir");
		}
	}
	public void salir2(boolean tienePermiso) throws ToxicaException, SQLException{
		if(!tienePermiso){
			throw new ToxicaException("Con que permiso???");
		}else{
			System.out.println("Puede salir");
		}
	}
}
