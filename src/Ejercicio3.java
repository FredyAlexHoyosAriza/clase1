/**
 * Devuelve el doble y el triple del entero que se ingresa
 * @author FredyAlexHoyosAriza
 * @version 1.0 
 */

import java.util.Scanner;
public class Ejercicio3 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        var numero = sc.nextInt();
        sc.close();
        int [] dt =  doubleTripleNum(numero);
        System.out.println("Para el numero ingresado, el doble y el triple corresponden a: " + dt[0] + " y " + dt[1]);
        System.gc();
    }
    public static int [] doubleTripleNum(int numero) {
        int [] d = {numero * 2, numero * 3};
        return d;
    }
    
}
