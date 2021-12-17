
public class TestGrafo {

    public static void main(String[] args) {
        Grafo<String> g = new Grafo<String>();
        g = g.fillIn();
        System.out.println(g.Dijkstra("La Union", "Arequipa"));
        System.out.println(g.Dijkstra("La Union", "Castilla"));
        System.out.println(g.Dijkstra("La Union", "Camana"));
        System.out.println(g.Dijkstra("La Union", "Islay"));
        System.out.println(g.Dijkstra("La Union", "Condesuyos"));
    }
}
