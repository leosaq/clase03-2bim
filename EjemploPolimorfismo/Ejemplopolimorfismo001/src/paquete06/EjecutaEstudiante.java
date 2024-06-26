package paquete06;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int totalEstudiantes;
        int estudiantesPresenciales;
        int estudiantesDistancia;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // Solicitar el número total de estudiantes
        System.out.println("Ingrese el numero total de estudiantes:");
        totalEstudiantes = entrada.nextInt();

        // Solicitar el número de estudiantes presenciales y de distancia
        System.out.println("Ingrese el numero de estudiantes presenciales:");
        estudiantesPresenciales = entrada.nextInt();
        System.out.println("Ingrese el numero de estudiantes a distancia:");
        estudiantesDistancia = entrada.nextInt();

        // Validar que la suma de estudiantes presenciales y a distancia sea igual al total
        if (estudiantesPresenciales + estudiantesDistancia != totalEstudiantes) {
            System.out.println("La suma de estudiantes presenciales y a distancia no coincide con el total de estudiantes. Intente de nuevo.");
            return;
        }

        entrada.nextLine(); // Limpiar el buffer

        // Iniciar ciclo repetitivo para ingresar los estudiantes presenciales
        for (int i = 0; i < estudiantesPresenciales; i++) {
            System.out.println("Ingrese los nombres del estudiante presencial:");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante presencial:");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificacion del estudiante presencial:");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante presencial:");
            edadEst = entrada.nextInt();
            System.out.println("Ingrese el numero de créditos:");
            numeroCreds = entrada.nextInt();
            System.out.println("Ingrese el costo de cada crédito:");
            costoCred = entrada.nextDouble();
            entrada.nextLine(); // Limpiar el buffer

            EstudiantePresencial estudianteP = new EstudiantePresencial(nombresEst, apellidosEst, identificacionEst, edadEst, numeroCreds, costoCred);
            estudiantes.add(estudianteP);
        }

        // Iniciar ciclo repetitivo para ingresar los estudiantes a distancia
        for (int i = 0; i < estudiantesDistancia; i++) {
            System.out.println("Ingrese los nombres del estudiante a distancia:");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante a distancia:");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificacion del estudiante a distancia:");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante a distancia:");
            edadEst = entrada.nextInt();
            System.out.println("Ingrese el numero de asignaturas:");
            numeroAsigs = entrada.nextInt();
            System.out.println("Ingrese el costo de cada asignatura:");
            costoAsig = entrada.nextDouble();
            entrada.nextLine(); // Limpiar el buffer

            EstudianteDistancia estudianteD = new EstudianteDistancia(nombresEst, apellidosEst, identificacionEst, edadEst, numeroAsigs, costoAsig);
            estudiantes.add(estudianteD);
        }

        // Iterar sobre el ArrayList para calcular la matrícula y mostrar los datos de cada estudiante
        for (int i = 0; i < estudiantes.size(); i++) {
            estudiantes.get(i).calcularMatricula();
            System.out.printf("Datos Estudiante %d\n%s\n", i + 1, estudiantes.get(i));
        }

        // Ciclo que permite comprobar el polimorfismo
        for (int i = 0; i < estudiantes.size(); i++) {
            estudiantes.get(i).calcularMatricula();
            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));
        }

        // Cerrar el scanner
        entrada.close();
    }

}

