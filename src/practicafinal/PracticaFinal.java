/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinal;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Susana Santamaria
 */
public class PracticaFinal {

    /* Varables Globales */
    static Integer MAX_CLUB = 2;
    static List<ClubLeon> clubList = new ArrayList();

    public static void main(String[] args) {
        clubLeones();

    }

    //region Programa para CLUBES
    public static void clubLeones() {
        /*PASO 1 CREAMOS LOS CLUBS */
        for (int i = 0; i < MAX_CLUB; i++) {
            ClubLeon miClub = new ClubLeon();
            miClub.Nombre = asignarDato();            
            clubList.add(miClub);
        }

        //PASO 2 RECOLECTAMOS LOS DINEROS
        recolectarDinero(clubList);

//        //PASO 3 IMPRIMIMOS LOS RESULTADOS
//        imprimirResultados(clubList);
    }

    private static String asignarDato() {
        String respuesta = JOptionPane.showInputDialog("Digite el nombre del Club");
        return respuesta;
    }

    private static String selecionarClub(List<ClubLeon> _club) {
        String[] clubs = new String[_club.size()];
        for (int i = 0; i < _club.size(); i++) {
            clubs[i] = _club.get(i).Nombre;
        }

        String resp = (String) JOptionPane.showInputDialog(null, "Selecione el Club para Recolecta", "Club de Leon", JOptionPane.DEFAULT_OPTION, null, clubs, clubs[0]);
        return resp;
    }

    /**
     * RECOLECTAMOS LOS DINEROS
     *
     * @param _club
     */
    private static void recolectarDinero(List<ClubLeon> _club) {
        ClubLeon nuevoClub = new ClubLeon();
        
        //Seleciono el club         
        String miclub = selecionarClub(_club);
        
        
        Integer posClub = 0;
        String salida = "X";
        String recuado = "";
        int resp = 1;  //para salir

        do { //PARA SELECIONAR OTRA VEZ EL CLUB

            for (int i = 0; i < _club.size(); i++) {
                if (_club.get(i).Nombre.equals(miclub)) {
                    nuevoClub.Nombre = _club.get(i).Nombre;
                    nuevoClub.Recolecta = _club.get(i).Recolecta;
                    posClub = i;
                }
            }

            do {//para digitar los montos por el club
                recuado = JOptionPane.showInputDialog("Digite el Monto para recuado del Club de Leon: [" + miclub + "] X: Salir");

                if (isNumeric(recuado)) {
                    nuevoClub.Recolecta = nuevoClub.Recolecta + Float.parseFloat(recuado);
                    clubList.set(posClub, nuevoClub);
                } else {
                    if (!recuado.equals("X")) {
                        JOptionPane.showMessageDialog(null, " NO es dato valido: " + recuado);
                    }
                }
            } while (!salida.equals(recuado));

            resp = JOptionPane.showConfirmDialog(null, "Selecionar Otro Club", "Alerta!", JOptionPane.YES_NO_OPTION);

            if (resp == 0) {
                miclub = selecionarClub(_club);
            }

        } while (resp == 0);
        
        imprimirResultados(clubList);
    }

    //AUXILIAR PARA VALIDAR SI ES NUMERICO UN DATO
    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private static void imprimirResultados(List<ClubLeon> club) {

        String dato = "";

        for (int i = 0; i < club.size(); i++) {
            dato = club.get(i).Nombre + " Recolecta: " + clubList.get(i).Recolecta;
            //JOptionPane.showMessageDialog(null, dato);
            System.out.println(dato);
        }
    }
//endregion
}
