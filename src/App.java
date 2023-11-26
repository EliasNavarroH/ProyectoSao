import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenidos al Sistema de Gestion de Califiaciones");
        System.out.println("Presiona Enter para continuar...");
        entrada.nextLine();  // Espera hasta que se presiona Enter
        //Ingresar logo con compañeros 
        IngresoAsginaturas();
        IngresoEstudiantes();
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

    //Se inicializa la clase para ingresar alumnos
    public static void IngresoEstudiantes(){
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("Cuantos alumnos quieres ingresar ? \nNo puedes Ingresar mas de 30");
            int cantidadAlumnos = entrada.nextInt();
            if (cantidadAlumnos <= 30) {
                entrada.nextLine();
                String alumnos[];
                alumnos = new String[cantidadAlumnos];
                int j = 1;
                System.out.println("El formato de ingreso valido de alumnos es: apellido, nombre1 nombre2");
                for(int i = 0; i < alumnos.length;i++){
                    System.out.println("Ingrese el Alumno numero: "+ j);
                    alumnos[i] = entrada.nextLine();
                    j++;
                }
                break;
            }else{
                System.out.println("Ingrese 30 o menos alumnos");
            }
        }
    entrada.close();
    }


    public static void IngresoCalificacione(){
    }
}
