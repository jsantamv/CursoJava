package lec01;

import javax.swing.JOptionPane;
import prueba1.Articulos;



public class Lec01 {

    public static void main(String[] args) {
        
        Articulos[] misArticulos = new Articulos[1];
        String eti = "NO";
        for (int i = 0; i < misArticulos.length; i++) {
            
            int contador = i+1;
            Articulos miArticulo = new Articulos();            
            miArticulo.Nombre = (String)JOptionPane.showInputDialog(null,"Articulo No: "+ contador);
            miArticulo.Cantidad =  Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad: "+ contador));
            miArticulo.Precio = Double.parseDouble(JOptionPane.showInputDialog(null,"Precio: "+ contador));
            
            String etiqueta = (String)(JOptionPane.showInputDialog(null,"Etiquita Roca (S/N)"+ contador));
            
            if (etiqueta.toUpperCase().equals("S"))
            {
                miArticulo.EtiquetaRoja = true;  
                eti = "SI";
            }
             
            misArticulos[i] = miArticulo;
        }
        
        for (int i = 0; i < misArticulos.length; i++) {
            
            System.out.println("Articulo:"+misArticulos[i].Nombre +" Cantidad: "+misArticulos[i].Cantidad+" Precio: "+misArticulos[i].Precio +" Etiqueta Roja "+ eti);
        }
        
    }
    
    

    

}
