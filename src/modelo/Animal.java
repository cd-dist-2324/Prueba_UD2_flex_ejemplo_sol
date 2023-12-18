package modelo;

public class Animal {

    private int numPatas;
    private String nombre;

    public void showInfo() {
        System.out.printf("Soy un %s. Tengo %d patas%n", nombre, numPatas);
    }
    

    public Animal() {
    }

    public Animal(int numPatas, String nombre) {
        this.numPatas = numPatas;
        this.nombre = nombre;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


  



   


}
