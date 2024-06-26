
package paquete06;

public class EjecutaDos {
    public static void main(String[] args) {
        String nombre = "Leandro";
        String apellido = "Saquisari";
        
        EstudianteDistancia e = new EstudianteDistancia(nombre, apellido);
        e.establecerIdentificacionEstudiante("0104579859");
        e.establecerEdadEstudiante(19);
        e.establecerNumeroAsginaturas(10);
        e.establecerCostoAsignatura(100);
        e.calcularMatricula();
        System.out.printf("%s\n",e);
    }
}
