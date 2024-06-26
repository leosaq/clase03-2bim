package paquete05;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import paquete04.*;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de estudiantes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        */
        // Se declaran variables
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
        int tipoEstudiante;
        int totalEstudiantes;
        int estudiantesPresenciales;
        int estudiantesDistancia;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // Solicitar el número total de estudiantes
        System.out.println("Ingrese el número total de estudiantes:");
        totalEstudiantes = entrada.nextInt();

        // Solicitar el número de estudiantes presenciales y de distancia
        System.out.println("Ingrese el número de estudiantes presenciales:");
        estudiantesPresenciales = entrada.nextInt();
        System.out.println("Ingrese el número de estudiantes a distancia:");
        estudiantesDistancia = entrada.nextInt();

        // Validar que la suma de estudiantes presenciales y a distancia sea igual al total
        if (estudiantesPresenciales + estudiantesDistancia != totalEstudiantes) {
            System.out.println("La suma de estudiantes presenciales y a distancia no coincide con el total de estudiantes. Intente de nuevo.");
            return;
        }

        // Iniciar ciclo repetitivo para ingresar los estudiantes presenciales
        for (int i = 0; i < estudiantesPresenciales; i++) {
            System.out.println("Ingrese los nombres del estudiante presencial");
            nombresEst = entrada.next();
            System.out.println("Ingrese los apellidos del estudiante presencial");
            apellidosEst = entrada.next();
            System.out.println("Ingrese la identificación del estudiante presencial");
            identificacionEst = entrada.next();
            System.out.println("Ingrese la edad del estudiante presencial");
            edadEst = entrada.nextInt();
            System.out.println("Ingrese el número de créditos");
            numeroCreds = entrada.nextInt();
            System.out.println("Ingrese el costo de cada crédito");
            costoCred = entrada.nextDouble();

            EstudiantePresencial estudianteP = new EstudiantePresencial();
            estudianteP.establecerNombresEstudiante(nombresEst);
            estudianteP.establecerApellidoEstudiante(apellidosEst);
            estudianteP.establecerIdentificacionEstudiante(identificacionEst);
            estudianteP.establecerEdadEstudiante(edadEst);
            estudianteP.establecerNumeroCreditos(numeroCreds);
            estudianteP.establecerCostoCredito(costoCred);
            estudiantes.add(estudianteP);
        }

        // Iniciar ciclo repetitivo para ingresar los estudiantes a distancia
        for (int i = 0; i < estudiantesDistancia; i++) {
            System.out.println("Ingrese los nombres del estudiante a distancia");
            nombresEst = entrada.next();
            System.out.println("Ingrese los apellidos del estudiante a distancia");
            apellidosEst = entrada.next();
            System.out.println("Ingrese la identificación del estudiante a distancia");
            identificacionEst = entrada.next();
            System.out.println("Ingrese la edad del estudiante a distancia");
            edadEst = entrada.nextInt();
            System.out.println("Ingrese el número de asignaturas");
            numeroAsigs = entrada.nextInt();
            System.out.println("Ingrese el costo de cada asignatura");
            costoAsig = entrada.nextDouble();

            EstudianteDistancia estudianteD = new EstudianteDistancia();
            estudianteD.establecerNombresEstudiante(nombresEst);
            estudianteD.establecerApellidoEstudiante(apellidosEst);
            estudianteD.establecerIdentificacionEstudiante(identificacionEst);
            estudianteD.establecerEdadEstudiante(edadEst);
            estudianteD.establecerNumeroAsginaturas(numeroAsigs);
            estudianteD.establecerCostoAsignatura(costoAsig);
            estudiantes.add(estudianteD);
        }

        // Iterar sobre el ArrayList para calcular la matrícula y mostrar los datos de cada estudiante
        for (int i = 0; i < estudiantes.size(); i++) {
            estudiantes.get(i).calcularMatricula();
            System.out.printf("Datos Estudiante %d\n%s\n", i + 1, estudiantes.get(i));
        }
    }

}
