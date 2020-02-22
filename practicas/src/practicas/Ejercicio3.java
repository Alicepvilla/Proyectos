package practicas;

import java.util.Scanner;

public class Ejercicio3 {
	
	//ejemplo de arreglo con bucle for
	
public static void main(String[] args) {
	
	
	
	Scanner entrada = new Scanner (System.in);
	System.out.println("Dime de qué largo te gustaría ");
	int largo=entrada.nextInt();
	
	

		//lleno con valores el arreglo
		int [] arreglo = new int [largo];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo [i]=i+1;
		}
		//muestro los valores del arreglo
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print("[" + arreglo[i] + "]");
		}
		
	}

}
