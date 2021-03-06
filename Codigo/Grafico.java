
import java.awt.event.*;
import javax.swing.*;
public class Grafico extends JFrame implements ActionListener{
  // materiales usados en le frame
  JMenuBar bar; // barra de menus
  JMenu acerca; //  menu
  JMenuItem proyect; // items del menu
  JLabel image, selectOrigin, selectDestiny; 
  ImageIcon aqp; // imagen de aqp
  // seleccionadores de las cuidades
  JComboBox origin;
  JComboBox destiny;
  JButton search; // creacion de boton
  static Grafo<String> g = new Grafo<String>();

  public Grafico() {
    g = g.fillIn();
    setSize(860, 560); // size del frame
    setLayout(null);
    setTitle("Interface Proyecto final ADA"); // estableciendo el titulo
    setDefaultCloseOperation(EXIT_ON_CLOSE); // la opcion de cerrado mediante un 'X' en la parte superior derecha
    createContent();
    setVisible(true); // para que pueda ser visible
    setLocationRelativeTo(null); // para que aparesca al centro de la pantalla

  }

  public void createContent(){
    bar = new JMenuBar();
    setJMenuBar(bar); // estableciendo la barra de menu
    acerca = new JMenu("Acerca de"); // estableciendo nombre que se visualizara en el frame
    proyect = new JMenuItem("Proyecto");
    proyect.addActionListener(this); // al precionar sonbre proyect se desatara un event
    acerca.add(proyect); //agregando el item al menu
    bar.add(acerca); // agregando el menu a la barra de menus

    // imagen de arequipa con sus provincias
    aqp = new ImageIcon("../Image/aqp.jpg"); // imagen de arequipa
    image = new JLabel(aqp); 
    image.setBounds(50,100,350,226); // estableciendo posicion
    add(image); // agregando la imagen

    //texto para identificar el comboBox
    selectOrigin = new JLabel("Selecciona el lugar de partida");
    selectOrigin.setBounds(480, 70, 320, 20);
    add(selectOrigin);
    // comboBox para la sellecion de la cuidad de origen y la cuidad destino
    String [] cities = {"Arequipa","Camana","Caraveli","Castilla","Caylloma","Condesuyos","Islay","La Union"};
    origin = new JComboBox<>(cities);
    origin.setBounds(480, 100, 320, 30);
    origin.addActionListener(this);
    add(origin);

    //texto para identificar el comboBox
    selectDestiny = new JLabel("Selecciona el lugar de llegada");
    selectDestiny.setBounds(480, 170, 320, 20);
    add(selectDestiny);

    destiny = new JComboBox<>(cities);
    destiny.setBounds(480, 200, 320, 30);
    destiny.addActionListener(this);
    add(destiny);

    // boton para validadr los datos
    search = new JButton("Buscar menor ruta");
    search.setBounds(480,300, 320, 30);
    search.addActionListener(this);
    add(search);

  }
  public void actionPerformed(ActionEvent e){
    // Contribuidores al proyecto
    if(e.getSource() == proyect){
      JOptionPane.showMessageDialog(null, "El siguientre trabajo es un proyecto colabarotivo entre:\n" + 
          "- Chavez Caceres, Samir Diego\n" +
          "- Hincho Jove, Angel Eduardo\n" +
          "- Neira Carraco, Darwin Jesus\n" +
          "El codigo puede ser visualizado en el siguiente enlace https://github.com/ahincho/ADA_PyFinal.git");
    }
    if(e.getSource() == search){
      if(origin.getSelectedIndex() == destiny.getSelectedIndex()){ // evitamos que sean el mismo
        System.out.println("No pueden ser el mismo"); // mensaje para hacer notar al usuario
        JOptionPane.showMessageDialog(null, "NO puede ser la misma cuidad");
      }
      else {
        System.out.println("Aceptado"); // encaso se valido
        // aplicamos el algorimo
        //System.out.println( g.Dijkstra((String)origin.getSelectedItem(), (String)destiny.getSelectedItem()) );
        int x = g.Dijkstra((String)origin.getSelectedItem(), (String)destiny.getSelectedItem());
        JOptionPane.showMessageDialog(null, x + " km sera la distancia recorrida en auto");
      }
    }

  }
  public static void main (String[]args){
    new Grafico();

  }
}

