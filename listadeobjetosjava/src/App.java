
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Automovil> auto = new LinkedList<>(); 
    
        Automovil ferrari = new Automovil("Ferrari", "Rojo");
        Automovil nissan = new Automovil("Skyline", "Azul");
    
        auto.add(ferrari); 
        auto.add(nissan);
        System.out.println(" " + auto.get(0));
    }
}