package practicas;

import javax.swing.*;

public class Arreglos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] paises=new String[8];
		
		/*paises[0]="Chile";
		paises[1]="Espa�a";
		paises[2]="Colombia";		
		paises[3]="Peru";
		paises[4]="Argentina";
		paises[5]="Inglaterra";
		paises[6]="Irlanda";
		paises[7]="Panam�";
		
		//UNA FORMA DE HACERLO:
		/*for (int i=0; i<paises.length; i++) {
		System.out.println("Pais " + (i+1) + " = " + paises[i]);	*/
		
		//es una variable de tipo string y  le llamamos elemento. De este modo no tengo que saber donde empieza o termina mi arreglo//
		
		for (String elemento:paises) {
			System.out.println(elemento);
					
			
		}
		
		
	}

}
