package abstracta;

public abstract class Producto {

	private int precio;
	
	public int getPrecio() {
		return this.precio;
	}

	public Producto (int precio) {
	
		this.precio=precio;
				
	}
	
	public abstract String getNombre();
	
}
