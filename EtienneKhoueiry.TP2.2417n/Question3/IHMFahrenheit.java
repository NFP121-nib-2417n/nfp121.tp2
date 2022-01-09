package Question3;


import Question1.*;
import Question2.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  private JButton  boutonDeConversion = new JButton( "convertir" );
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * méthode déclenchée lorsque le bouton de conversion est appuyé. 
   * remarquer que le champs de droite (les degrés Celsius) n'est pas éditable.
   * @param ae l'événement transmis
   */
  public void actionPerformed( ActionEvent ae ){
    try{
      String valueEntered = entree.getText();
      int value = Integer.parseInt(valueEntered);
      double valueCalculated = Question2.FahrenheitCelsius.fahrenheitEnCelsius(value);
      sortie.setText( Double.toString(valueCalculated));
    }catch(NumberFormatException nfe){
      sortie.setText("error ! ");
    }
  }
  
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
}
