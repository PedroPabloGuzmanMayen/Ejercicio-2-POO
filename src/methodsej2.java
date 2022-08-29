
/**
 * @author Pedro Pablo Guzmán Mayen
 * @version 1.0.0
 */
import java.util.Arrays;
import java.util.Scanner;

public class methodsej2 {
    /**
     * Este método se encarga de agregar los datos de las 3 familias que son necesarias para el programa
     * @param f representa el array de las familias ingresadas por el usuario
     * @param in representa el scanner que sirve para que el usuario ingrese los datos 
     */
    public void addFam(Family[] f, Scanner in ){
        for (int i = 0; i<3; i++ ){
            f[i] = new Family();
            System.out.println("Apellido de la familia " + (i +1) + ":");
            f[i].setLastName(in.nextLine());
            System.out.println("Cantidad de hijos menores de 10 de la familia " + (i+1) + ":" );
            f[i].setLittleChildren(in.nextInt());
            System.out.println("Cantidad de hijos mayores de 10 de la familia " + (i+1) + ":" );
            f[i].setBigChildren(in.nextInt());
            System.out.println("Cantidad de mascotas deseadas por la familia (no mas que 4) " + (i+1) + ":" );
            f[i].setWantedPets(in.nextInt());
            while (f[i].getWantedPets() > 4){
                System.out.println("Valor invalido, intente de nuevo");
                f[i].setWantedPets(in.nextInt());
            }
            in.nextLine();
        }
    }
    /**
     * Este método se encarga de agregar datos del perro y analizarlos para indicar si una familia es apta o no para adoptar un perro
     * @param d representa el objeto que contiene los datos del perro ingresados por el usuario
     * @param f representa un array de objetos de la clase familia el cuál contiene los datos obtenidos por el usuario
     * @param in representa el escáner que sirve para que el usuario ingrese los datos
     * @param c representa un entero el cuál sirve para contar el número de fracasos 
     * @param w representa un booleano el cuál sirve para indicar si la familia tiene hijos o no
     */
    public void addDog(Dogs d, Family[] f, Scanner in, int c, boolean w){
        System.out.println("Ingrese el nombre del perro: ");
        d.setName(in.nextLine());
        System.out.println("Ingrese la edad del perro: ");
        d.setAge(in.nextInt());
        System.out.println("Ingrese el estado de salud del perro: ");
        d.setHealth(in.nextInt());
        in.nextLine();
        System.out.println("Ingrese la raza del perro: ");
        d.setBreed(in.nextLine());
        System.out.println("Ingrese las medidas del perro (S significa un perro de tamaño chico, M es un perro mediano y L un perro grande): ");
        d.setSize(in.nextLine());
        System.out.println("Ingrese el color del perro: ");
        d.setColor(in.nextLine());
        for (int i = 0; i<3; i++ ){
            if (f[i].getCounter() == f[i].getWantedPets()){
                System.out.println("La familia " + f[i].getLastName() + " ya no puede agregar mas mascotas");
                c+= 1;
                continue;
            }
            if (f[i].getLittleChildren() > 0){
                if(Arrays.asList(d.getDangerDogs()).contains(d.getBreed()) || !d.getSize().equals("S") || !d.getBreed().equals("Labrador")){
                    System.out.println("La familia " + f[i].getLastName() + " no puede acoger a " + d.getName());
                    c+= 1;
                }
                else{
                    System.out.println("La familia " + f[i].getLastName() + " acogio a: " + d.getName());
                    f[i].setCounter(f[i].getCounter() + 1);
                    break;
                }
            }
            if (f[i].getBigChildren() > 1 && f[i].getLittleChildren() == 0){
                if(Arrays.asList(d.getDangerDogs()).contains(d.getBreed()) || d.getSize().equals("B")){
                    System.out.println("La familia " + f[i].getLastName() + " no puede acoger a " + d.getName());
                    c+= 1;
                }
                else{
                    System.out.println("La familia " + f[i].getLastName() + " acogio a: " + d.getName());
                    f[i].setCounter(f[i].getCounter() + 1);
                    break;
                }

            }
            if (f[i].getBigChildren() == 0 && f[i].getLittleChildren() == 0){
                w =true;
                System.out.println("La familia " + f[i].getLastName() + " acogio a: " + d.getName());
                f[i].setCounter(f[i].getCounter() + 1);
                break;
            }
        }
        if (c == 3 && w == false ){
            System.out.println(d.getName() + " no pudo conseguir un hogar ya que ninguna de las familias cumple con las condiciones para adoptarlo, se abre un espacio en la perrera para este perro");
        }


    }

}

