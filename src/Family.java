
/**
 * @author Pedro Pablo Guzmán Mayen
 * @version 1.0.0
 */
public class Family {

    private int littleChildren;
    private int bigChildren;
    private int wantedPets;
    private String lastName;
    private int counter;
    
   
    /**
     * Establece un valor inicial para la variable counter 
     */
    public Family(){
        counter = 0;
    }

    /**
     * Obtiene el numero de hijos menores de la familia 
     * @return el numero de hijos menores de 10 años de la familia
     */
    public int getLittleChildren() {
        return littleChildren;
    }
    /**
     * Establece el numero de hijos menores que tiene la familia
     * @param littleChildren representa la cantidad de hijos menores de la familia
     */
    public void setLittleChildren(int littleChildren) {
        this.littleChildren = littleChildren;
    }
    /**
     * Obtiene el numero de hijos mayores de cada familia
     * @return el numero de hijos mayores de 10 años de la familia
     */
    public int getBigChildren() {
        return bigChildren;
    }
    /**
     * Este método establece el número de hijos mayores de 10 años que tiene la familia
     * @param bigChildren representa el número de hijos mayores de la familia
     */
    public void setBigChildren(int bigChildren) {
        this.bigChildren = bigChildren;
    }
    /**
     * Este método obtiene el número de mascotas deseadas por la familia
     * @return el número de mascotas deseadas por la familia
     */
    public int getWantedPets() {
        return wantedPets;
    }
    /**
     * Este método establece el número de mascotas desadas por la familia
     * @param wantedPets representa el número de mascotas deseadas por la familia 
     */
    public void setWantedPets(int wantedPets) {
        this.wantedPets = wantedPets;
    }
    /**
     * Este método obtiene el apellido de la familia
     * @return devuelve un string el cuál es igual al apellido e la famlia indicado por el usuario
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Este método establece el apellido de cada familia
     * @param lastName es un string que representa el apellido de la familia 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Obtiene el contador de mascotas de cada familia 
     * @return un número entero el cuál indica la cantidad de mascotas que tiene la familia
     */
    public int getCounter() {
        return counter;
    }
    /**
     * Establece el contador de mascotas de cada familia
     * @param counter representa un entro el cuál es el número de mascotas deseado de cada familia indicado por el usuario
     */
    public void setCounter(int counter) {
        this.counter = counter;
    }
    


}
