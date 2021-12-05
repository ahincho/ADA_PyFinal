package ADA_PyFinal.Codigo;


import ADA_PyFinal.Codigo.Grafo;

public class TestGrafo {

    public static void main(String[] args) {
        Grafo<String> g = new Grafo<String>();
        Grafo<String> g1 = new Grafo<String>();

        //TEST DIJKSTRA 
        g.insertVert("V0");
        g.insertVert("V1");
        g.insertVert("V2");
        g.insertVert("V3");
        g.insertVert("V4");
        g.insertVert("V5");
        g.insertVert("V6");
        g.insertVert("V7");

        g.insertArista("V0", "V1", 4, true);
        g.insertArista("V0", "V4", 2, true);
        g.insertArista("V1", "V2", 1, true);
        g.insertArista("V2", "V4", 3, true);
        g.insertArista("V2", "V3", 5, true);
        g.insertArista("V3", "V6", 2, true);
        g.insertArista("V3", "V7", 1, true);
        g.insertArista("V4", "V1", 1, true);
        g.insertArista("V4", "V5", 2, true);
        g.insertArista("V5", "V2", 6, true);
        g.insertArista("V5", "V6", 3, true);
        g.insertArista("V5", "V3", 3, true);
        g.insertArista("V6", "V7", 7, true);

        g.Dijkstra("V0");
        System.out.println("\n"+g);

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
