
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Grafico extends JFrame implements ActionListener{
  // materiales usados en le frame
  JMenuBar bar; // barra de menus
  JMenu acerca; //  menu
  JMenuItem proyect; // items del menu

  public Grafico() {
    setSize(1060, 3600); // size del frame
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

  }
  public void actionPerformed(ActionEvent e){

  }
  public static void main (String[]args){
    new Grafico();

  }
}

