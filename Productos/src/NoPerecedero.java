
public class NoPerecedero extends Productos {

	public NoPerecedero(String Producto, int Precio) {
		super(Producto, Precio);
	}

	private String tipo;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int calcular() {
		return getCantidad() * getPrecio();
		
	}

	@Override
	public String toString() {
		return "NoPerecedero [tipo=" + tipo + "]";
	}
	
	
}
