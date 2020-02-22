
public class Profesor extends Persona{
			
	private String IdProfesor;
	
	public Profesor (String nombre, int edad) {
		super(nombre,edad);
	}
	
	public void setIdProfesor (String IdProfesor) {
		this.IdProfesor=IdProfesor;
	}
	
	public String getIdProfesor() {
		return IdProfesor;
	}
	
	public void mostrarNombre() {
		System.out.println("Nombre Profesor:  "+getNombre());
		System.out.println("Edad:  "+getEdad());
	}
	
}


