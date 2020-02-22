package practicas;

public class Ejercicio5_1 {

	//arreglo bidimensional para matrices no cuadradas.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] matriz = new int [8] [6]	;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = i+j;
					
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("[" + matriz[i][j] + "]");
					
			}
			System.out.println("");
			
		}
		
		
		
	}

}

		
		

