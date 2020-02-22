
public abstract class Productos {

	private String Producto;
	private int Precio;
	private int Cantidad;
	
	public Productos (String Producto, int Precio) {
	this.Producto=Producto; this.Precio=Precio;  
	}
	public String getProducto() {
		return Producto;
	}
	public void setProducto(String producto) {
		Producto = producto;
	}	
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public int getPrecio() {
		return Precio;
	}	
	public void setPrecio(int precio) {
		Precio = precio;
	}
	public String toString() {
		return Producto + "= " + Precio;
	}
	public abstract int calcular( );
}
