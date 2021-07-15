/**
 * Saludo a Bety
 * 
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        var nombre = "Bety Ariza";
        var resultado = saludo(nombre);
        System.out.println(resultado);
    }

    public static String saludo(String nombre) {
        return "Hola " + nombre + "!";
    }
}
