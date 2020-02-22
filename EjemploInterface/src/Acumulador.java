
public class Acumulador implements Actualizacion {

	private int valor;
	int incremento;
	
	
	public Acumulador (int i){
		this.valor=i;
		} 
	
	
	public int daValor () {
		return this.valor;
		} 
	
	
	public void incremento (int a) {
		this.valor +=a;
	}
}