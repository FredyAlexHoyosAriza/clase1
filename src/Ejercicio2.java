/**
 * Cuenta los digitos de un numero y muestra el resultado en pantalla
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */

import java.util.Scanner;

public class Ejercicio2 {

    public static void main (String args[]) {
        var sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        var numero = sc.nextInt();
        sc.close();
        var digitos =  numeroDigitos(numero);
        System.out.println("El numero tiene " + digitos + " cifras");
    }

    public static int numeroDigitos(int numero) {
        int cifras = 0;

        while (numero != 0) {
            numero /= 10;
            //System.out.println(numero);
            cifras++;
        }
        return cifras;
    }
    
}
