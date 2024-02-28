import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class App {
    public static List<coche> concesionario = new LinkedList<>(); 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int op=0;
        Integer numbastidor=1;
        String marca;
        String modelo;
        Integer caballos;
        Integer precio;
        Integer puntos=0;


        while(op!=5){
            System.out.println("Concesionario Como en Casa");
            System.out.println("1. Nuestros Coches");
            System.out.println("2. Añadir coche");
            System.out.println("3. Eliminar coche");
            System.out.println("4. Valorar coche");
            System.out.println("5. Salir del concesionario");

            op = sc.nextInt();
            sc.nextLine();
            if(op==1){
                for(coche carro : concesionario){
                    System.out.println(carro.toString());
                }
            }
            if(op==2){
                System.out.println("Dime el numero de bastidor: ");
                numbastidor = sc.nextInt();
                sc.nextLine();
                System.out.println("Escribe la marca: ");
                marca = sc.nextLine();
                System.out.println("Escribe el modelo: ");
                modelo = sc.nextLine();
                System.out.println("Dime los caballos: ");
                caballos = sc.nextInt();
                sc.nextLine();
                System.out.println("Indica un precio (en euros): ");
                precio = sc.nextInt();
                sc.nextLine();
                coche nuevoCoche = new coche(numbastidor,marca,modelo,caballos,precio);
                concesionario.add(nuevoCoche);
            
            }
            if(op==3){
                int pos = 0;
                for(coche carro : concesionario){
                    System.out.println(pos+ "||" + carro.toString());
                    pos++;
                }
                System.out.println("Dime la poscion del coche a eliminar: ");
                int eliminar = sc.nextInt();
                sc.nextLine();
                concesionario.remove(eliminar);
                
            }
            if(op==4){
                for(coche carro : concesionario){
                    System.out.println(carro.toString());
                }
                System.out.println("Dime el numero de bastidor del coche a valorar: ");
                int avalorar = sc.nextInt();
                sc.nextLine();
                for(int i =0; i<concesionario.size(); i++){
                    if (avalorar == concesionario.get(i).getNumbastidor()) {
                        System.out.println("Escriba lo que desea cambiar");
                        int valoracion = sc.nextInt();
                        sc.nextLine();
                        concesionario.get(i).setpuntos(valoracion);
                    }
                }
                
            }
            if(op==5){

            }
        }
        System.out.println("Gracias por usar este concesionario");
        sc.close();
    }
}
