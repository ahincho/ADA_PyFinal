
public class TestGrafo {

    public static void main(String[] args) {
        Grafo<String> g = new Grafo<String>();
        Grafo<String> g1 = new Grafo<String>();

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

        g.Dijkstra("La Union");

        /*
        g.insertVert("lima");
        g.insertVert("aqp");
        g.insertVert("cusco");
        g.insertVert("piura");
        g.insertVert("tarap");
        g.insertVert("puno");
        g.insertVert("tacna");

        g.insertArista("lima", "aqp", 3,false);
        g.insertArista("cusco", "aqp", 2,false);
        g.insertArista("piura", "lima", 1,false);
        g.insertArista("cusco", "lima", 6,false);
        g.insertArista("piura", "tarap", 10,false);
        g.insertArista("puno", "tacna", 8,false);

        System.out.println("Grafo ciudades:\n"+g);

        g1.insertVert("lima");
        g1.insertVert("aqp");
        g1.insertVert("piura");
        g1.insertVert("puno");
        g1.insertVert("tacna");

        g1.insertArista("lima", "aqp", 3,false); //si e
        g1.insertArista("piura", "lima", 1,false);
        g1.insertArista("puno", "tacna", 8,false);
        System.out.println("Grafo ciudades 2:\n"+g1);
         */
        /*
        g.insertVert("a");
        g.insertVert("b");
        g.insertVert("c");
        g.insertVert("d");
        g.insertVert("e");
        g.insertVert("f");
        g.insertVert("g");
        g.insertVert("h");
        g.insertVert("i");
        g.insertVert("j");

        g.insertArista("b", "c",3, true); //1
        g.insertArista("a", "d",7, true); //2
        g.insertArista("c", "g",8, true); //3
        g.insertArista("e", "d",10, true);
        g.insertArista("e", "h",2, true);
        g.insertArista("i", "j",1, true);
        g.insertArista("g", "a",2, true);
        g.insertArista("b", "e",6, true);
        g.insertArista("a", "j",3, true);
        g.insertArista("h", "d",7, true);
        g.insertArista("c", "d",9, true);
        g.insertArista("d", "j",6, true);
        g.insertArista("b", "f",4, true);
        g.insertArista("g", "h",5, true);
        g.insertArista("i", "d",4, true);
        g.insertArista("h", "f",3, true);
        g.insertArista("e", "f",5, true);
        g.insertArista("c", "e",1, true);
         */
        //System.out.println("Grafo ciudades:\n"+g);
    }
}
