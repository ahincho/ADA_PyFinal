package ADA_PyFinal.Codigo;

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

    public void Dijkstra(E info) {
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
    }

    public void printDijkstra() {
        Enlace<Vertice<E>> aux = this.listVert.cabeza();
        System.out.println("\nVertex\t\tDistance\tPath");
        for (; aux != null; aux = aux.siguiente) {
            Vertice<E> ver = aux.valor;
            if (ver.path != null) {
                System.out.println(ver.data + "\t\t" + ver.dist + "\t\t" + ver.path.data);
            } else {
                System.out.println(ver.data + "\t\t" + ver.dist + "\t\t --");
            }
        }
    }

    public String toString() {
        return this.listVert.toString();
    }
}
