import java.util.Scanner ;


public class ingresodatos {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	
	String name = sc.nextLine();
	char gender = sc.next().charAt(0);
	int age = sc.nextInt();
    long mobileNo = sc.nextLong();
    double average = sc.nextDouble();
    
    
    System.out.println("Nombre: "+name);
    System.out.println("G�nero: "+gender);
    System.out.println("Edad: "+age);
    System.out.println("Tel�fono: "+mobileNo);
    System.out.println("Promedio: "+average);
    
	
	
}	
	
}		

