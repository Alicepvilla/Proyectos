package practicas;

import java.util.Scanner;

public class Ejercicio4 {
	//arreglo con numeros ingresados por usuarios para ordenarlos despues.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Llena un arreglo con n�meros ingresados por el usuario (el primer valor corresponde al largo 
	 * del arreglo) y mu�stralo.  Luego ordenalo de menor a mayor y muestra el resultado.
	 * 
	 */
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Dime de qu� largo te gustar�a ");
		int largo=entrada.nextInt();
			
		int[] paraOrdenar = new int [largo];
		
		//lleno el arreglo con valores ingresados por el usuario
		for (int i = 0; i < paraOrdenar.length; i++) {
			System.out.println("Ingresa n�mero");
			paraOrdenar[i] = entrada.nextInt();
		}
		//imprimo el arreglo original
		for (int i=0; i <paraOrdenar.length; i++) {
			System.out.print("[" + paraOrdenar[i] + "]");
		}	
		//metodo burbuja. (para ordenar nuestro arreglo)
		int auxiliar = 0;
			for (int i = 0; i < paraOrdenar.length; i++) {
			for (int j = (i+1); j < paraOrdenar.length; j++) {
				if (paraOrdenar[i]>paraOrdenar[j]) {
					auxiliar = paraOrdenar[i];
					paraOrdenar[i] = paraOrdenar[j];
					paraOrdenar[j] = auxiliar; 
					
				}
			}
		}	
		
			System.out.println("");
			
			//imprimo el arreglo ordenado
			for (int i=0; i < paraOrdenar.length; i++) {
				System.out.print("[" + paraOrdenar[i] + "]");
			}
		
		
				
	}

}
