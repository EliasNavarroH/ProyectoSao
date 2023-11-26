import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenidos al Sistema de Gestion de Califiaciones");
        System.out.println("Presiona Enter para continuar...");
        entrada.nextLine();  // Espera hasta que se presiona Enter
        //Ingresar logo con compañeros 
        int opcion = 0;

        System.out.println("****************************\nQue deseas hacer?\n1)Cargar datos\n2)Buscar\n3)Salir\n****************************");
        opcion =entrada.nextInt();
        while(true)
            if (opcion == 1) {
            System.out.println("Carga de datos");
            int cantidadAsignaturas = IngresoAsignaturas();
            String[] asignaturas = IngresoAsginaturas(cantidadAsignaturas);
        
            int cantidadAlumnos = IngresoEstudiantes();
            String[] alumnos = new String[cantidadAlumnos];
            alumnos = IngresoEstudiantes(cantidadAlumnos);

            int [][] calificaciones = new int[cantidadAlumnos][cantidadAsignaturas];
            IngresoCalificaciones(calificaciones, alumnos, asignaturas);
        }else if(opcion == 2){
            System.out.println("Que deseas buscar ?\n1)Estudiantes\n2)Estudiantes destacados\n3)Estadisticas\n3)Calculo de Promedios\n4)Salir");
            opcion=entrada.nextInt();
            if (opcion == 1) {
                
            }else if (opcion ==2) {
                
            }else if (opcion ==3) {
                
            }else if(opcion == 4){

            }else {
                System.out.println("Ingresa un numero valido");
            }
        break;
        }

    }

    //Se inicializa el ingreso de asignaturas
    public static int IngresoAsignaturas() {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("Cuantas asignaturas quieres ingresar ? \nNo puedes Ingresar mas de 10");
            int cantidadAsignaturas = entrada.nextInt();
            if (cantidadAsignaturas <= 10) {
                entrada.nextLine(); // Consumir el salto de línea después del nextInt
                return cantidadAsignaturas;
            } else {
                System.out.println("Ingrese 10 o menos Asignaturas.");
            }
        }
    }
    public static String [] IngresoAsginaturas(int cantidadAsignaturas){
        Scanner entrada = new Scanner(System.in);
        String asignaturas[] = new String[cantidadAsignaturas];
        int j = 1;
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Ingrese la Asignatura nro: " + j);
            asignaturas[i] = entrada.nextLine();
            j++;
        }
        return asignaturas;
    }

    //Se inicializa la clase para ingresar alumnos 
    public static int IngresoEstudiantes() {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("Cuantos alumnos quieres ingresar ? \nNo puedes Ingresar mas de 30");
            int cantidadAlumnos = entrada.nextInt();
            if (cantidadAlumnos <= 30) {
                entrada.nextLine(); // Consumir el salto de línea después del nextInt
                return cantidadAlumnos;
            } else {
                System.out.println("Ingrese 30 o menos alumnos");
            }
        }
    }
    public static String[] IngresoEstudiantes(int cantidadAlumnos) {
        Scanner entrada = new Scanner(System.in);
        String alumnos[] = new String[cantidadAlumnos];
        int j = 1;
        System.out.println("El formato de ingreso valido de alumnos es: apellido, nombre1 nombre2");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el Alumno numero: " + j);
            alumnos[i] = entrada.nextLine();
            j++;
        }
        return alumnos;
    }

    // se inicializa la clase para el ingreso de las calificaciones
    public static void IngresoCalificaciones(int[][] calificaciones, String[] alumnos, String[] asignaturas) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < asignaturas.length; j++) {
                System.out.println("Ingrese la calificación de " + alumnos[i] + " en " + asignaturas[j] + ": ");
                calificaciones[i][j] = entrada.nextInt();
            }
        }
        entrada.close();
    }
}
