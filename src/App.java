import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenidos al Sistema de Gestion de Califiaciones");
        System.out.println("Presiona Enter para continuar...");
        entrada.nextLine();  // Espera hasta que se presiona Enter
        //Ingresar logo con compañeros 
        IngresoAsginaturas();
    }
    //se inicializa la clase para ingresar la cantidad de asignaturas
    public static void IngresoAsginaturas(){
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("Cuantas asignaturas quieres ingresar ? \nNo puedes Ingresar mas de 10");
            int cantidadAsignaturas = entrada.nextInt();
            if (cantidadAsignaturas <= 10) {
                entrada.nextLine();// se agrega este nextline porque luego del nextint el scanner queda una string vacia y hace que se utilize en el bucle de abajo
                String asignaturas[];
                //Se chequea que la cantidad de asginaturas sea correcta, de lo contrario se finaliza el programa
                asignaturas = new String[cantidadAsignaturas];
                int j = 1;
                for(int i = 0 ; i < asignaturas.length ; i++ ){
                    System.out.println("Ingrese la Asignatura nro: " + j);
                    asignaturas[i] = entrada.nextLine();
                    j++;
                }
                break;
            }else{
                System.out.println("Ingrese 10 o menos Asignaturas.");
            }
        }
            
    }
    public static void IngresoEstudiantes(){

    }
    public static void IngresoCalificacione(){

    }
}
