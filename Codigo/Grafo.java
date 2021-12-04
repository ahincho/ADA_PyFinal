
import java.util.LinkedList;

//Representacion de un Grafo mediante una Lista de Adyacencia

public class Grafo<T> {
	
	// Atributos de la clase Grafo
	
	protected LinkedList<Vertice<T>> listaVertices;
	
	// Constructor de la clase Grafo
	
	public Grafo() {
		
		setVertices();
		
	}
	
	// Setters y getters de la clase Grafo
	
	public LinkedList<Vertice<T>> getVertices() {
		
		return this.listaVertices;
		
	}
	
	public void setVertices() {
		
		this.listaVertices = new LinkedList<Vertice<T>>();
		
	}
	
	// Metodos de la clase Grafo
	
	// Metodo para insertar Vertices en el Grafo
	
	public void insertarVertice(T data) {
		
		Vertice<T> nuevo = new Vertice<T>(data);
		
		if(getVertices().contains(nuevo)) {
			
			System.out.println("El Vertice ya existe ...");
			return;
			
		} else {
			
			getVertices().addLast(nuevo);
			
		}
	}
	
	// Metodo para insertar Aristas en el Grafo
	
	public void insertarArista(T origen, T destino) {
		
		insertarArista(origen, destino, -1);
		
	}
	
	// Metodo auxiliar para insertar Aristas en el Grafo
	
	public void insertarArista(T origen, T destino, int peso) {
		
		Vertice<T> o = new Vertice<T>(origen);
		Vertice<T> d = new Vertice<T>(destino);
		
		// Buscar si existen los Vertices que se quieren unir
		
		int indexOrigen = getVertices().indexOf(o);
		int indexDestino = getVertices().indexOf(d);
		
		// En caso de no existir alguno de los dos Vertices mandar un mensaje
		if(indexOrigen == -1 || indexDestino == -1) {
			
			System.out.println("El Vertice de origen y/o destino no existen ...");
			return;
			
		}
		
		Vertice<T> refOrigen = getVertices().get(indexOrigen);
		Vertice<T> refDestino = getVertices().get(indexDestino);
		
		// Buscar si existe una Arista ya registrada entre los dos Vertices
		if(refOrigen.getLista().contains(new Arista<T>(refDestino))) {
			
			System.out.println("Ya existe una Arista entre los Vertices ...");
			return;
			
		}
		
		// En otro caso, valido, insertar la Arista entre los Vertices
		refOrigen.getLista().addLast(new Arista<T>(refDestino));
		refDestino.getLista().addLast(new Arista<T>(refOrigen));
		
	}
	
	// Metodo toString que devuelve el contenido del Grafo
	
	@Override
	public String toString() {
		
		return "Contenido del Grafo:\n" + getVertices();
		
	}
	
}