
import java.util.*;

public class Grafo<E> {

    protected ListEnlazada<Vertice<E>> listVert;

    public Grafo() {
        listVert = new ListEnlazada<Vertice<E>>();
    }

    public void insertVert(E data) {
        Vertice<E> nuevo = new Vertice<E>(data);
        if (this.listVert.contiene(nuevo) != null) {
            System.out.println("Vertice ya insertado");
            return;
        }
        this.listVert.agregar(nuevo);
    }

    public void insertArista(E verOrig, E verDest, boolean dirig) {
        insertArista(verOrig, verDest, -1, dirig);
    }

    public void insertArista(E verOrig, E verDest, int weight, boolean dirig) {
        Vertice<E> refOrig = this.listVert.contiene(new Vertice<E>(verOrig)).valor;
        Vertice<E> refDest = this.listVert.contiene(new Vertice<E>(verDest)).valor;

        if (refOrig == null || refDest == null) {
            System.out.println("Vertice origen / dest no existe");
            return;
        }
        if (refOrig.listArt.contiene(new Arista<E>(refDest)) != null) {
            System.out.println("Arista ya insertada");
            return;
        }
        if (dirig) { //si el enlace sera dirigido o no
            refOrig.listArt.agregar(new Arista<E>(refDest, weight));
        } else {
            refOrig.listArt.agregar(new Arista<E>(refDest, weight));
            refDest.listArt.agregar(new Arista<E>(refOrig, weight));
        }
    }

    public int Dijkstra(E info, E destiny) {
        PriorityQueue<Vertice<E>> q = new PriorityQueue<Vertice<E>>();

        Vertice<E> u = this.listVert.contiene(new Vertice<E>(info)).valor;

        Enlace<Vertice<E>> aux = this.listVert.cabeza();
        for (; aux != null; aux = aux.siguiente) {
            if (aux.valor == u) {
                aux.valor.dist = 0;
            } else {
                aux.valor.dist = 9999;
            }
            aux.valor.path = null;
            aux.valor.label = 0;
            q.add(aux.valor);
        }

        while (!q.isEmpty()) {
            u = q.poll();
            u.label = 1;
            Enlace<Arista<E>> e = u.listArt.cabeza();
            for (; e != null; e = e.siguiente) {
                Vertice<E> z = e.valor.refDest;
                if (z.label == 0) {
                    if (z.dist > (u.dist + e.valor.weight)) {
                        z.dist = u.dist + e.valor.weight;
                        z.path = u;
                    }
                }
            }
        }
        printDijkstra();
        System.out.println("salida unica");
        return distance(destiny);
    }

    public void printDijkstra() {
        Enlace<Vertice<E>> aux = this.listVert.cabeza();
        System.out.println("\nVertex\t\tDistance(km)\tPath");
        for (; aux != null; aux = aux.siguiente) {
            Vertice<E> ver = aux.valor;
            if (ver.path != null) {
                System.out.println(ver.data + "\t\t" + ver.dist + "\t\t" + ver.path.data);
            } else {
                System.out.println(ver.data + "\t\t" + ver.dist + "\t\t --");
            }
        }
    }

    public int distance(E destiny){
        Enlace<Vertice<E>> aux = this.listVert.cabeza();
        int dist = 0;
        for (; aux != null; aux = aux.siguiente) {
            Vertice<E> ver = aux.valor;
            if (ver.data == destiny) {
                System.out.println(ver.data + "\t\t" + ver.dist);
                dist = ver.dist;
                break;
            }
        }
        return dist;
    }

    public String toString() {
        return this.listVert.toString();
    }

    // Agregando metodo fillIn
    public static Grafo<String> fillIn(){
        Grafo<String> g = new Grafo<String>();

        //TEST DIJKSTRA 
        g.insertVert("Arequipa");
        g.insertVert("Camana  ");
        g.insertVert("Caraveli");
        g.insertVert("Castilla");
        g.insertVert("Caylloma");
        g.insertVert("Condesuyos");
        g.insertVert("Islay   ");
        g.insertVert("La Union");
        String[] ciudades 
                = {"Arequipa","Camana  "
                  ,"Caraveli","Castilla"
                  ,"Caylloma","Condesuyos"
                  ,"Islay   ","La Union",};
        
        int[][] caminos 
            = {{999,175,383,177,167,227,124,369},
            {177,999,209,123,296,173,112,315},
            {385,210,999,331,503,380,320,360},
            {179,123,331,999,297,50,213,192},
            {163,295,503,297,999,347,277,400},
            {228,173,380,50,347,999,262,142},
            {125,112,320,213,275,262,999,405},
            {371,315,523,192,400,142,405,999},};
        
        for(int i = 0; i < caminos.length ; i++)
            for(int j = 0; j < caminos[0].length; j++)
                g.insertArista(ciudades[i]
                        , ciudades[j]
                        , caminos[i][j]
                        ,true);
        return g;
    }
}
