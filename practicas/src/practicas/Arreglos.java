package practicas;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] mi_matriz=new int [5];ESTA ES UNA FORMA DE DECLARAR
		
		//mi_matriz[0]=13; // ESTA ES UNA FORMA DE ASIGNAR VALORES
		//mi_matriz[1]=27;
		//mi_matriz[2]=100;
		//mi_matriz[3]=127;		
		//mi_matriz[4]=117;
		
		//ESTA ES OTRA FORMA: DECLARACION Y ASIGNAR VALORES EN UNA MISMA LINEA
		int[]mi_matriz= {13, 27, 100, 127, 117, 45, 33, 16, 14, 50, 47, 55, 137, 1005, 1040};
		
			//	PARA IMPRIMIR UN INDICE EN PARTICULAR
	//System.out.println(mi_matriz[3]);
	
		//PARA IMPRIMIR EL ARREGLO COMPLETO USAMOS LA INSTRUCCION FOR. (CUANDO SABEMOS CUANTOS ELEMENTOS TENEMOS).
		//for (int i=0; i<5; i++) {
		
		//PARA IMPRIMIR EL ARREGLO COMPLETO SI NO SABEMOS SU LARGO
		for (int i=0; i<mi_matriz.length; i++){
		
		System.out.println("Valor del indice " + i + " = " + mi_matriz[i]);
			
		}
		
	}

}
