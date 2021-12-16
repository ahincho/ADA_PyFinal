
public class TestGrafo {

    public static void main(String[] args) {
        Grafo<String> g = new Grafo<String>();
        g = g.fillIn();

        /*TEST DIJKSTRA 
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
                        ,true);*/

        g.Dijkstra("La Union", "Arequipa");
    }
}
