import java.util.Scanner;
/**
 * @author Pedro Pablo Guzmán Mayen
 * @version 1.0.0
 */

public class Main {
    static methodsej2 met2 = new methodsej2();
    static Dogs dogs = new Dogs();
    static Family[] family = new Family[3];
    static Scanner in = new Scanner(System.in);
    static Boolean condition = true;
    static String day = "";
    static int failures = 0;
    static boolean canBeAdpoted = false;
    
    /** 
     * Es el método principal, este usa los métodos de las anteriores clases y los junta para lograr implementar la funcionalidad principal del programa 
     * @param args es un parámetro que deben tener los métodos principales, representa un arreglo de strings
     * 
     */
    public static void main(String[] args){
        System.out.println("******HOGARES TEMPORALES PARA PERROS*****");
        System.out.println("");
        System.out.println("Ingrese los datos de las familias: ");
        met2.addFam(family, in);
        while(condition){

            System.out.println("Ahora ingrese los datos del perro: ");
            met2.addDog(dogs, family, in, failures, canBeAdpoted); 
            System.out.println("Termino el dia?");
            day = in.nextLine();
            if (day.equals("si")){
                System.out.println("Ya no llegaron mas perros, lamentamos si no consiguio el numero de mascotas deseado");
                condition = false;
            }
        }
    }
    
}
