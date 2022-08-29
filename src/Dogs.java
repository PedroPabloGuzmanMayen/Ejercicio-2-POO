/**
 * 
 * @author Pedro Pablo Guzmán Mayen
 * @version 1.0.0
 *
 */
public class Dogs {
    private String size;
    private String breed;
    private int age;
    private int health;
    private String color;
    private String name;
    String[] dangerDogs = {"Pit bull terrier", "American Staffordshire terrier", "Tosa Inu", "Dogo argentino", "Dogo guatemalteco", "Fila brasileiro", "Presa canario", "Doberman", "Gran perro japones", "Mastin napolitano", "Presa Mallorqui", "Dogo de Burdeos", "Bullmastiff", "Bull terrier ingles", "Bulldog americano", "Rhodesiano", "Rottweiler" };
    /**
     * Este método se encarga de obtener el tamaño del perro
     * @return el tamaño del perro
     */
    public String getSize() {
        return size;
    }
    /**
     * Este método establece el tamaño del perro
     * @param size representa el tamaño del perro indicado por el usuario 
     */
    public void setSize(String size) {
        this.size = size;
    }
    /**
     * Este método obtiene la raza del perro
     * @return un string que es igual a la raza del perro 
     */
    public String getBreed() {
        return breed;
    }
    /**
     * Este método establece la raza del perro
     * @param breed representa la raza del perro indicada por el usuario
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
    /**
     * Este método obtiene la edad del perro 
     * @return un int que representa la edad del perro
     */
    public int getAge() {
        return age;
    }
    /**
     * Este método establece la edad del perro
     * @param age representa la edad del perro indicada por el usuario
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Este método obtiene la salud del perro
     * @return un int que representa la salud del perro
     */
    public int getHealth() {
        return health;
    }
    /**
     * Este método establece la salud del perro
     * @param health un int que representa la salud del perro indicada por el usuario 
     */
    public void setHealth(int health) {
        this.health = health;
    }
    /**
     * Este método obtiene el color del perro
     * @return un string que representa el color del perro 
     */
    public String getColor() {
        return color;
    }
    /**
     * Este método esteblece el color del perro 
     * @param color un string que representa el color del perro indicado por el usuario
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Obtiene el nombre del perro 
     * @return un string que representa el nombre del perro 
     */
    public String getName() {
        return name;
    }
    /**
     * Este método establece el nombre del perro
     * @param name un string que representa el nombre del perro indicado por el usuario
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Este método establece una lista que contiene los nombres de los perro más peligrosos
     * @return una lista que representa la lista de nombres de los perros más peligrosos
     */
    public String[] getDangerDogs() {
        return dangerDogs;
    }
    /**
     * Este método establece una lista que contiene el nombre de los perros más peligrosos 
     * @param dangerDogs reprsenta una lista con el nombre de los perros más peligrosos.
     */
    public void setDangerDogs(String[] dangerDogs) {
        this.dangerDogs = dangerDogs;
    }
    


    
}
