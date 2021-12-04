
import java.util.LinkedList;

public class Vertice<T> {
	
	// Atributos de la clase Vertice
	
	protected T data;
	protected LinkedList<Arista<T>> listaAdyacencia;
	protected int label; // 0 => Sin explorar, 1 => Explorada
	
	// Constructor de la clase Vertice
	
	public Vertice(T data) {
		
		setData(data);
		setLista();
		
	}
	
	// Setters y getters de la clase Vertice
	
	public T getData() {
		
		return this.data;
		
	}
	
	public void setData(T data) {
		
		this.data = data;
		
	}
	
	public LinkedList<Arista<T>> getLista(){
		
		return this.listaAdyacencia;
		
	}
	
	public void setLista() {
		
		this.listaAdyacencia = new LinkedList<Arista<T>>();
		
	}
	
	public int getLabel() {
		
		return this.label;
		
	}
	
	public void setLabel(int label) {
		
		this.label = label;
		
	}
	
	// Metodos de la clase Vertice
	
	@SuppressWarnings("unchecked")
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Vertice<?>) {
			
			Vertice<T> vertice = (Vertice<T>) obj;
			return getData().equals(vertice.getData());
			
		}
		
		return false;
	}
	
	// Metodo toString, devuelve el contenido del Vertice
	
	@Override
	public String toString() {
		
		return getData() + " ==> " + getLista() + "\n";
		
	}
	
}
