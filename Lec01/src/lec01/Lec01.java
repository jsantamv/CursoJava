/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec01;

import java.util.Scanner;
import Lec02.WhileExample;
/**
 *
 * @author Lab06-PC01
 */
public class Lec01 {

    /**
     * probando
     */
    public static void main(String[] args) {
        
       
       Lec01 miObjeto = new Lec01();
       
       miObjeto.Ejercicio1();
       miObjeto.Ejercicio2();
       
       //Le paso por parametro el arreglo
       Integer[] intArray = new Integer[3];
       intArray[0] = 2;
       intArray[1] = 24;
       intArray[2] = 33;
        
       System.out.println("La que me gusta x=a+b+c es: " + miObjeto.Ejercicio3(intArray));              
       System.out.println("Forma mas o menos la x=a+b+c es: " + miObjeto.Ejercicio3OtraForma(2,24,33));
    }
    
    
    //Ejercicio 1
    public void Ejercicio1(){
        System.out.println("****< EJERCICIO 1 >****");        
        System.out.println("");        
        System.out.println("Bienvenido al Mundo JAVA");        
        System.out.println("Podrias Dar soluciones a muchos problemas");
        System.out.println("");      
    }
    
    //Ejercicio 2
    public void Ejercicio2(){
        System.out.println("****< EJERCICIO 2 >****");        
        System.out.println("");        
        
        System.out.println("Esotos son los datos primitivos de JAVA");
        String[] primitivos = {"byte", "short", "int", "long","float","double","boolean","char"};
        
        for (String primitivo : primitivos) {
            System.out.println(primitivo);            
        }
        System.out.println("");     
        System.out.println("segunda parte del ejercicio 2"); 
        //segunda parte del ejercicio 2
        int[] intArray = new int[4];
        intArray[0] = 2;
        intArray[1] = 24;
        intArray[2] = 33;
        intArray[3] = 15;
        
        int suma = 0; 
        
        for (int i=0; i < intArray.length; i++)
        {
            suma += intArray[i];
        }
        
        int promedio = 0;
        promedio = suma/intArray.length;
        
        System.out.println("La suma es: " + suma);
        System.out.println("La promedio es: " + promedio);
        
    }
    
	//Ejercicio 3
    //calculo de la exprecion x=a+b+c
    public int Ejercicio3(Integer[] args){    
        System.out.println("");   
        System.out.println("****< EJERCICIO 3 >****");   
        int suma = 0;         
        for (int i=0; i < args.length; i++)
        {
            suma += args[i];
        }
        
        return suma;
    }
    
     public int Ejercicio3OtraForma(int a, int b, int c){    
        System.out.println("");   
        System.out.println("****< EJERCICIO 3 otro Forma>****");           
        return a+b+c;
    }
    
    
    //Metodo de susana
    public void MetododSusana(){
     int edad; //Definiendo la variable edad de tipo entero
        String nombre;  //Defino la variable nombre de tipo string
        nombre = "Carmen";
        edad = 19;

        Scanner entrada; //Defino la variable entrada tipo scanner (tipo especial)

        entrada = new Scanner(System.in); //Hago que entrada lea del teclado.

        System.out.print("¿Cómo se llama usted?: ");
        nombre = entrada.nextLine();

        System.out.print("¿Y cuántos años tienes?: ");
        edad = entrada.nextInt();

        System.out.println("Tu eres " + nombre + " y tienes " + edad + " años ");

        edad = edad + 5; //edad+=5; Le suma 5 a edad...
        System.out.print("Uyyy " + nombre + " y dentro de 5 años tendrás " + edad + " años ");

        // javax.swing.JOptionPane.showMessageDialog(null,"Hola soy "+nombre+" y tengo "+edad+" años");
    }
    
    

}
