import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
public class App {

    private static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String[] alumnos = null;
        String[] asignaturas = null;
        int[][] calificaciones = null;
        System.out.println("Bienvenidos al Sistema de Gestion de Califiaciones");
        System.out.println();
               
        //Ingresar logo con compañeros 
System.out.println("__________________¶¶¶¶¶");
System.out.println("_______________¶¶¶¶¶__¶¶________¶¶¶¶¶¶¶¶");
System.out.println("__________¶¶¶¶__¶¶¶¶___¶¶_____¶¶¶¶¶____¶¶");
System.out.println("______¶¶¶___¶¶¶¶________¶¶_¶¶¶______¶¶¶");
System.out.println("___¶¶¶_¶¶¶¶______________¶¶_______¶¶¶");
System.out.println("¶¶¶_¶¶¶¶________________¶¶______¶¶¶");
System.out.println("¶¶¶¶_________________¶¶¶_____¶¶¶");
System.out.println("¶¶________________¶¶¶_____¶¶¶");
System.out.println("¶¶_____________¶¶¶_____¶¶¶");
System.out.println("_¶¶________¶¶¶¶____¶¶¶¶");
System.out.println("__¶¶____¶¶¶_____¶¶¶¶");
System.out.println("___¶¶_¶¶¶¶___¶¶¶¶");
System.out.println("____¶¶_____¶¶¶¶");
System.out.println("__¶¶_____¶¶¶¶");
System.out.println("¶¶____¶¶¶¶");
System.out.println("¶¶_¶¶¶¶");
System.out.println("¶¶¶¶¶_____¶¶¶¶¶___________¶¶¶¶¶");
System.out.println("_________¶¶¶¶¶¶¶_________¶¶¶¶¶¶¶");
System.out.println("_________¶¶¶¶¶¶¶_________¶¶¶¶¶¶¶");
System.out.println("__________¶¶¶¶¶___________¶¶¶¶¶");
System.out.println("__¶¶¶¶_____________________________¶¶¶¶");
System.out.println("_¶¶¶¶¶¶___________________________¶¶¶¶¶");
System.out.println("__¶¶¶¶¶¶_________________________¶¶¶¶¶¶");
System.out.println("___¶¶¶¶¶¶_______________________¶¶¶¶¶¶");
System.out.println("____¶¶¶¶¶¶¶___________________¶¶¶¶¶¶¶");
System.out.println("______¶¶¶¶¶¶¶_______________¶¶¶¶¶¶¶");
System.out.println("_________¶¶¶¶¶¶___________¶¶¶¶¶¶");
System.out.println("____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
System.out.println("______________¶¶¶¶¶¶¶¶¶¶¶¶");
System.out.println();

        System.out.println("Presiona Enter para continuar...");
        entrada.nextLine();  // Espera hasta que se presiona Enter
while(true) {        
        
        System.out.println("****************************\nQue deseas hacer?\n1)Cargar datos\n2)Buscar\n3)Salir\n****************************");
        int opcion =entrada.nextInt();
    while(true)
        if (opcion == 1) {
            System.out.println("****** Carga de datos ******\n");
            int cantidadAsignaturas = IngresoAsignaturas();
            asignaturas = IngresoAsginaturas(cantidadAsignaturas);
        
            int cantidadAlumnos = IngresoEstudiantes();
            alumnos = IngresoEstudiantes(cantidadAlumnos);

            calificaciones = IngresoCalificaciones(alumnos, asignaturas);

            System.out.println("\nDatos cargados en el sistema! ");
            
            break;
            }
        else if(opcion == 2){
            System.out.println("Que deseas buscar ?\n1)Estudiantes\n2)Estudiantes destacados\n3)Calculo de Promedios\n4)Ver Estadisticas\n5)Salir");
            opcion=entrada.nextInt();
            if (opcion == 1) {
                alumnos = BuscarEstudiantes(alumnos,asignaturas,calificaciones);
            }else if (opcion ==2) {
                alumnos = EstudiantesDestacados(alumnos, asignaturas, calificaciones);
            }else if (opcion ==3) {
                alumnos = EstudiantesPromedios(alumnos, asignaturas, calificaciones);
            }else if (opcion ==4) {
                alumnos = Estadisticas(alumnos, asignaturas, calificaciones);
            }else if(opcion == 5){
                break;
            }
            else {
                System.out.println("Ingresa un numero valido");
            }
            break;
            }
        else if (opcion == 3) {
            System.out.println("Muchas gracias por utilizar nuestro programa. Adios");
            break;
        }else {
             System.out.println("Por favor ingrese un numero valido, entre 1 y 3");
                 break;
            }
      
       
    }
 }

    //Se inicializa el ingreso de asignaturas
        public static int IngresoAsignaturas() {
        int cantidadAsignaturas = 0;
        boolean entradaInvalida = true;

        System.out.println("Cuantas asignaturas quieres ingresar? (No puedes ingresar mas de 10)");


        while (entradaInvalida) {
            try {
                cantidadAsignaturas = entrada.nextInt();
                entrada.nextLine(); // Consumir el salto de línea después del nextInt

                if (cantidadAsignaturas <= 10 && cantidadAsignaturas > 0) {
                    entradaInvalida = false;
                } else {
                    System.out.println("Ingrese 10 o menos asignaturas.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un numero entero entre 0 y 10");
                entrada.nextLine(); // Limpiar el búfer en caso de excepción
            }
        }

       
        return cantidadAsignaturas;
    }
    public static String [] IngresoAsginaturas(int cantidadAsignaturas){
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
        while (true) {
            
            boolean entradaInvalida = true;
            while (entradaInvalida) {
                try {
                System.out.println("\nCuantos alumnos quieres ingresar ? (No puedes Ingresar mas de 30)");
                int cantidadAlumnos = entrada.nextInt();
                    if (cantidadAlumnos <= 30) {
                    entrada.nextLine(); // Consumir el salto de línea después del nextInt
                
                return cantidadAlumnos;
             }      else {
                    System.out.println("Ingrese 30 o menos alumnos");
                    }
            }   catch (InputMismatchException i) {
        System.out.println("Debe ingresar un numero entero entre 0 y 30");
                entrada.nextLine(); // Limpiar el búfer en caso de excepción}
                }
            }
        }
    }
    public static String[] IngresoEstudiantes(int cantidadAlumnos) {
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
    public static int[][] IngresoCalificaciones(String[] alumnos, String[] asignaturas) {
        Random random = new Random();
        int [][]calificaciones;
        calificaciones = new int[alumnos.length][asignaturas.length];
        
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < asignaturas.length; j++) {
                int numero = random.nextInt(10) +1;
                calificaciones[i][j] = numero;
            }  
        }
        return calificaciones;
    }

    //Se crea el metodo de busqueda de estudiantes 
    public static String[] BuscarEstudiantes(String [] alumnos, String[]asignaturas, int [][]calificaciones){
        System.out.println("Que estudiante deseas buscar? ");
        String buscarEstudiante = entrada.next();
        int indiceEstudiante = Arrays.asList(alumnos).indexOf(buscarEstudiante);
        if (indiceEstudiante != -1) {
            System.out.println("El alumno: " + buscarEstudiante + " Esta en la lista y sus notas son:");
            for(int j = 0 ;j < asignaturas.length ; j++ ){
                System.out.println("En la asignatura " + asignaturas[j] + " :" + calificaciones[indiceEstudiante][j]);
            }
        }else{
            System.out.println("El estudiante no se encuentra en esta lista");
        }
        
        return alumnos;
    }


    //Se crea el meotodo de estudiantes destacados
    public static String[] EstudiantesPromedios(String[]alumnos, String[]asignaturas, int [][]calificaciones){
        for(int i = 0 ; i < alumnos.length ; i ++){
            int suma = 0 ;
            for(int j = 0; j < asignaturas.length ; j++){
                suma = suma + calificaciones[i][j];
            }
            double promedio = (double) suma/ asignaturas.length;
            System.out.println("El promedio del estudiante: " + alumnos[i] + " es " + promedio);
        }
        return alumnos;
    }
    
    //Metodo estudiantes destacados
    public static String [] EstudiantesDestacados(String[]alumnos, String[]asignaturas, int [][]calificaciones) {
        boolean notaDestacada = false;
        for(int i = 0; i < alumnos.length; i++) {
            for ( int j = 0; j < asignaturas.length; j++ ) {
                if (calificaciones[i][j] >= 9) {
                    notaDestacada = true;
                    System.out.println("El estudiante " + alumnos[i] + " esta destacado en " + asignaturas[j] + " con la nota: " + calificaciones[i][j]);
                }
            }
        }
            if (notaDestacada == false) System.out.println("No hay estudiantes destacados");
        return alumnos;
    }
    
    //El metodo de estadisticas
    public static String [] Estadisticas(String[]alumnos, String[]asignaturas, int [][]calificaciones) {
       
        
        
        for(int i = 0; i < asignaturas.length; i++) {
        double notaMasAlta = 0;
        double notaMasBaja = 10;
        String asignaturaMasAlta = asignaturas[i];
        String asignaturaMasBaja = asignaturas[i];
        int  j;
        int indiceAlumnoMasAlta = 0;
        int indiceAlumnoMasBaja = 0;
            for (j = 0; j < alumnos.length; j++ ) {
                if (notaMasAlta < calificaciones [j][i]) {
                    notaMasAlta = calificaciones[j][i];
                   asignaturaMasAlta = asignaturas[i]; 
                   indiceAlumnoMasAlta = j;
                }
                if (notaMasBaja > calificaciones [j][i]){
                    notaMasBaja = calificaciones[j][i];
                    asignaturaMasBaja = asignaturas [i];
                    indiceAlumnoMasBaja = j;
                }
            }
            
            System.out.println("Para la asignatura " + asignaturaMasAlta + " la nota mas alta es " + notaMasAlta + " del alumno " + alumnos[indiceAlumnoMasAlta]);
            System.out.println("Para la asignatura " + asignaturaMasBaja + " la nota mas baja es " + notaMasBaja + " del alumno " + alumnos[indiceAlumnoMasBaja]);
        
        }
        
        return alumnos;
    }
    
    public static void cerrarScanner(){
        entrada.close();
    }
}
