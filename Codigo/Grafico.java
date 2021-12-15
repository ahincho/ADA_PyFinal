
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Grafico extends JFrame implements ActionListener{
  public Grafico() {
    setSize(1060, 3600); // size del frame
    setTitle("Interface Proyecto final ADA"); // estableciendo el titulo
    setDefaultCloseOperation(EXIT_ON_CLOSE); // la opcion de cerrado mediante un 'X' en la parte superior derecha
    setVisible(true); // para que pueda ser visible

  }
  public void actionPerformed(ActionEvent e){

  }
  public static void main (String[]args){
    new Grafico();

  }
}

