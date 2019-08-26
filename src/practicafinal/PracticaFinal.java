/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinal;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Susana Santamaria
 */
public class PracticaFinal {

    public ClubLeon unClub[] = new ClubLeon[5];
//    private int num = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClubLeon club = new ClubLeon();
        
        unClub = club.SolicitarClub();
        
    }

    /**
     * Metodo para Guardar el Club
     *
     * @param nombre del club
     * @return un ClubLeon
     */
    public ClubLeon guardarClub(String nombre) {

        ClubLeon cl = new ClubLeon();
        cl.Nombre = nombre;
        return cl;

    }

    public static String asignarDato() {
        String respuesta = JOptionPane.showInputDialog(null, "Digite el nombre del Club");
        return respuesta;
    }

    public static void mostarDato(String dato) {
        JOptionPane.showMessageDialog(null, dato);
    }

    /**
     * Metodo ejemplo no se usa.
     */
    public void auxiliares() {
        String respuesta = JOptionPane.showInputDialog(null, "Escribe tu nombre");

        String[] carreras = {
            "Ingeniería en sistemas computacionales",
            "Ingeniería industrial",
            "Ingeniería en mecatrónica",
            "Ingeniería en informatica",
            "Ingeniería petroquímica"
        };
        //MyIcon icon = new MyIcon();
        String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera", JOptionPane.DEFAULT_OPTION, null, carreras, carreras[0]);

        int resps = JOptionPane.showConfirmDialog(null, "¿Está seguro?");

        int respa = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
    }

}
