import modelo.Animal;

public class App {
   public static void main(String[] args) throws Exception {
        
        System.out.println("La versión de Java utilizada es: "  + System.getProperty("java.version"));
        Animal perro = new Animal(4, "perro");
        perro.showInfo();

        Animal gallina = new Animal();
        gallina.setNombre("gallina");
        gallina.setNumPatas(2);
        gallina.showInfo();
        
    }
}
