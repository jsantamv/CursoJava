/*
 * Este es el metodo Prinicpal para el llamado de todas las clases
 */
package lec01;

import Lec02.WhileExample;
import java.util.Scanner;
/**
 *
 * @author Lab06-PC01
 */
public class Lec01 {

    /**
     * Metodo Principal {Main}
     */
    public static void main(String[] args) {
        /* 
        //Esto fue para la primera clase
        Lecion01 lec01 = new Lecion01();
        lec01.MetodoPrinpal();
         */

//        WhileExample miObj = new WhileExample();
//        miObj.Pricipal();
        CadenasString();

    }

    public static void CadenasString() {
        for (int i = 0; i < 10; i++) {
            int numero = (int) (Math.random() * 300) + 1;            
            System.out.println(numero);
        }
        

    }

}
