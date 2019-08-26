/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Susana Santamaria
 */
public class ClubLeon {

    String Nombre;
    float Recolecta;

    /**
     * Constructor inicaliza vacio
     */
    public ClubLeon() {

        this.Recolecta = 0;
        this.Nombre = "";
    }

    /**
     * Constructor sobrecargado para inicializar los datos que se le pasan por
     * paramtro
     *
     * @param recolecta
     * @param nombre
     */
    public ClubLeon(int recolecta, String nombre) {
        this.Recolecta = recolecta;
        this.Nombre = nombre;
    }

    public ClubLeon[] SolicitarClub() {
        ClubLeon[] miclub = new ClubLeon[5];
        
        for (ClubLeon miclub1 : miclub) {
            miclub1.Nombre = asignarDato();
        }
        
        return miclub;
    }
    
    private String asignarDato() {
        String respuesta = JOptionPane.showInputDialog("Digite el nombre del Club");
        return respuesta;
    }

}
