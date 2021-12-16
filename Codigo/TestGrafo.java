
public class TestGrafo {

    public static void main(String[] args) {
        Grafo<String> g = new Grafo<String>();
        g = g.fillIn();
        System.out.println(g.Dijkstra("La Union", "Arequipa"));
    }
}
