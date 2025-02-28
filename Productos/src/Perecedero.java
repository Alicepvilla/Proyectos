
public class Perecedero extends Productos {

	private int diasACaducar;
	
	public Perecedero (int diasACaducar, String Producto, int Precio) { 
		super(Producto, Precio);
		this.diasACaducar=diasACaducar;
	}
	public int getDiasCad() {
		return diasACaducar;
	}
	
	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}
	
	public int reducirPrecio(int diasACaducar) {
		
		if (diasACaducar == 1) {
			return super.getPrecio() / 4;
			
		}
		
		if (diasACaducar == 2) {
			return super.getPrecio() / 3;
			
		}
		
		if (diasACaducar == 3) {
			return super.getPrecio() / 2;
			
		}else {
			return super.getPrecio();
		}
		
	}
	
	@Override
	public int calcular() {
		return super.getCantidad()* reducirPrecio(diasACaducar);
	}
	@Override
	public String toString() {
		return "Perecedero [diasACaducar=" + diasACaducar + "]";
	}
		
}
