
import java.util.Scanner;
public class Ejercicio5 {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int intvar = sc.nextInt();
        sc.close();
        evenodd(intvar);
    }
    
    /*Parametros de los métodos 
        Modificadores de acceso: 
            public
            private
            protected
            default
        Retornos: 
            void: Un método sin ningún valor de retorno.
        Directivas: 
            static: Significa que el método pertenece a la clase Main
        <modificador de acceso> <directiva> <tipo_dato> <nombre_metodo(tipo nombre_var, tipo nombre_var...)>{}
        */

    public static void evenodd(int intvar) {
        
        boolean eo = intvar % 2 == 0 ? true : false;
        if (eo) {
            System.out.println(intvar + " es par");
        } else {
            System.out.println(intvar + " es impar");
        }
        
    }
    
}
