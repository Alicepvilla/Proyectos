
package prueba;

import java.util.Scanner;

public class prueba {

		private static int[] vect;

		Scanner lector = new Scanner(System.in);
		int num2 = lector.nextInt();
		new int [10];
		
		void insertar (num2) {
		modificar (num,num2);		
		
		mostrarTodo();
}
		private static void insertar(int num){
		   for(int i=0;i<vect.length;i++){
		     vect[i]=num+i;
		   }


		}
		private static void editar(int indice, int num){
		  if(indice>vect.length-1||indice<0)
		    System.out.println("indice invalido");
		  else
		    vect[indice]=num;   
		}
		private static void mostrarTodo(){
		  for(int i=0; i<vect.length;i++)
		     System.out.println(vect[i]);	
		
		
		
	}

}
