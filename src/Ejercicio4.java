
import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor de temperatura en grados centigrados:");
        double centi = sc.nextDouble();
        double fahre = fromCentiToFaren(centi);
        System.out.println("El valor equivalente en grados Fahrenheit es: " + fahre);
    }
    public static double fromCentiToFaren(double centi) {
        return 32 + 9*centi/5;
    }
}
