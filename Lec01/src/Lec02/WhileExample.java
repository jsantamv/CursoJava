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
     * Este metodo es publico para que se pueda ver en otras clases
     */
    public void Pricipal() {
        PesosNinos();
    }

    /**
     * ESTE METODO ES --PRIVADO-- SOLO SE PUEDE VER EN ESTA CLASE
     * [[WhileExample]] Ejercicio 4 La Escuela Escuela El Abecé requiere
     * programa que permita leer el peso de Nniños, niños, determine : - Cuántos
     * niños pesan entre 20.00 y 30.00 kg. - Cuántos pesan entre 30.01 y 50.00
     * kg . - Cuántos pesan más de 50.00 kg.
     */
    private void PesosNinos() {
        try {
            //variables
            Scanner sc = new Scanner(System.in);
            double peso = 0;
            double muestra = 0;
            double contador = 0;
            double child2030 = 0;
            double child3050 = 0;
            double child50 = 0;

            //logica del programa        
            System.out.println("Digite la cantidad de la Muestra a analizar");
            muestra = sc.nextDouble();

            while (contador <= muestra) {
                contador++;
                System.out.print("Digite el peso del Ninios: ");
                peso = sc.nextDouble();

                //Cuántos niños pesan entre 20.00 y 30.00 kg.
                if (peso >= 20 && peso <= 30) {
                    child2030++;
                }

                //Cuántos pesan entre 30.01 y 50.00
                if (peso >= 30.01 && peso <= 50) {
                    child3050++;
                }

                //Cuántos pesan más de 50.00 kg.
                if (peso > 50) {
                    child50++;
                }

            }//fin del while

            //los resultados
            System.out.println("La Cantidad que esta entre 20 y 30 es: " + child2030);
            System.out.println("La Cantidad que esta entre 30.01 y 50: " + child3050);
            System.out.println("La Cantidad mayor que 50 es: " + child50);

        } catch (Exception ex) {
            System.out.println("Error en Lec02.WhileExample.PesosNinos() " + ex.getMessage());
        }

    }

}
