
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Grafico extends JFrame implements ActionListener{
  // materiales usados en le frame
  JMenuBar bar; // barra de menus
  JMenu acerca; //  menu
  JMenuItem proyect; // items del menu
  JLabel image, content; 
  JPanel panel;
  ImageIcon aqp; // imagen de aqp
  // seleccionadores de las cuidades
  JComboBox origin;
  JComboBox destiny;

  public Grafico() {
    setSize(1060, 3600); // size del frame
    setLayout(null);
    setTitle("Interface Proyecto final ADA"); // estableciendo el titulo
    setDefaultCloseOperation(EXIT_ON_CLOSE); // la opcion de cerrado mediante un 'X' en la parte superior derecha
    createContent();
    setVisible(true); // para que pueda ser visible

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
    image.setBounds(100,150,350,226); // estableciendo posicion
    add(image); // agregando la imagen
    panel = new JPanel();
    panel.setBounds(600, 100, 350, 400);
    panel.setBackground(new Color(0,0,0));
    //add(panel);

    // comboBox para la sellecion de la cuidad de origen y la cuidad destino
    String [] cities = {"Arequipa","Camana","Caraveli","Castilla","Caylloma","Condesuyos","Islay","La Union"};
    origin = new JComboBox<>(cities);
    origin.setBounds(640, 100, 320, 30);
    add(origin);

    destiny = new JComboBox<>(cities);
    destiny.setBounds(640, 300, 320, 30);
    add(destiny);


  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == proyect){
      JOptionPane.showMessageDialog(null, "El siguientre trabajo es un proyecto colabarotivo entre:\n" + 
          "- Chavez Caceres, Samir Diego\n" +
          "- Hincho Jove, Angel Eduardo\n" +
          "- Neira Carraco, Darwin Jesus\n" +
          "El codigo puede ser visualizado en el siguiente enlace https://github.com/ahincho/ADA_PyFinal.git");
    }

  }
  public static void main (String[]args){
    new Grafico();

  }
}

