import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenidos al Sistema de Gestion de Califiaciones");
        //Ingresar logo con compañeros 
        IngresoAsginaturas();
    }
    //se inicializa la clase para ingresar la cantidad de asignaturas
    public static void IngresoAsginaturas(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantas asignaturas quieres ingresar ? \nNo puedes Ingresar mas de 10");
        int cantidadAsignaturas = entrada.nextInt();
        entrada.nextLine();// se agrega este nextline porque luego del nextint el scanner queda una string vacia y hace que se utilize en el bucle de abajo
        String asignaturas[];
        asignaturas = new String[cantidadAsignaturas];
        int j = 1;
        for(int i = 0 ; i < asignaturas.length ; i++ ){
            System.out.println("Ingrese la Asignatura nro: " + j);
            asignaturas[i] = entrada.nextLine();
            j++;
            }
    }
    public static void IngresoEstudiantes(){

    }
    public static void IngresoCalificacione(){

    }
}
