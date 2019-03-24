/*
 * Esta clase es para resolver los ejercicios de
 * del while para susy 
 */
package Lec02;
import java.util.Scanner;

/**
 * Clase con los ejerccios de While
 */
public class WhileExample {

    /**
     * Este metodo es publico
     * para que se pueda ver en otras
     * clases
     */
    public void main() {
        PesosNinos();
    }

    /** ESTE METODO ES --PRIVADO-- SOLO SE PUEDE VER EN ESTA CLASE [[WhileExample]]
     * Ejercicio 4 La Escuela Escuela El Abecé requiere
     * programa que permita leerel peso
     * de Nniños, niños, determine : 
     * - Cuántos niños pesan entre 20.00 y 30.00 kg.
     * - Cuántos pesan entre 30.01 y 50.00 kg .
     * - Cuántos pesan más de 50.00 kg .
     */
    private void PesosNinos() {
        //variables
        Scanner sc = new Scanner(System.in);
        double peso = 0;        
        
        //logica del programa        
        System.out.println("Pesos de Ninios");        
        peso = sc.nextDouble();
        
                
    }

}
