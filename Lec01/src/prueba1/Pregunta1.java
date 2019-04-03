package prueba1;

import javax.swing.JOptionPane;


public class Pregunta1 {

    /**
    * Pueblito requiere un programa que permita leer el peso de 10 niños de un aula,
    * ingresando los datos por JOptionPane, determine:
    *  Cuántos niños pesan entre 20.00 y 30.00 kg.
    *  Cuántos pesan entre 30.00 y 50.00 kg.
    *  Cuántos pesan más de 50.00 kg. 
    */
    public String Pregunta(){
        String dato = (String)JOptionPane.showInputDialog(null, "Digite el dato del Ninio");        
        return dato;
        
    }
    
    
}
