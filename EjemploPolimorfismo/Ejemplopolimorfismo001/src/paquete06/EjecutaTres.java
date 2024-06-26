package paquete06;

public class EjecutaTres {

    public static void main(String[] args) {
        String nombre = "Leandro";
        String apellido = "Saquisari";

        EstudianteDistancia e = new EstudianteDistancia(nombre, apellido, 5, 150);
        e.establecerIdentificacionEstudiante("0104579859");
        e.establecerEdadEstudiante(19);
        e.calcularMatricula();
        System.out.printf("%s\n", e);
    }
}
