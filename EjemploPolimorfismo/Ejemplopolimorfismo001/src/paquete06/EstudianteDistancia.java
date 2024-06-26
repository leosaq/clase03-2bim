package paquete06;

public class EstudianteDistancia extends Estudiante {
    int numeroAsignaturas;
    double costoAsignatura;

    public EstudianteDistancia(String nombresEstudiante, String apellidosEstudiante, String identificacionEstudiante, int edadEstudiante, int numeroAsignaturas, double costoAsignatura) {
        super(nombresEstudiante, apellidosEstudiante, identificacionEstudiante, edadEstudiante);
        this.numeroAsignaturas = numeroAsignaturas;
        this.costoAsignatura = costoAsignatura;
    }

    public void establecerNumeroAsignaturas(int numero) {
        numeroAsignaturas = numero;
    }

    public void establecerCostoAsignatura(double valor) {
        costoAsignatura = valor;
    }

    @Override
    public void calcularMatricula() {
        matricula = numeroAsignaturas * costoAsignatura;
    }

    public int obtenerNumeroAsignaturas() {
        return numeroAsignaturas;
    }

    public double obtenerCostoAsignatura() {
        return costoAsignatura;
    }

    @Override
    public String toString() {
        return String.format("%sNumero de asignaturas: %d\nCosto por asignatura: %.2f\n",
                super.toString(),
                obtenerNumeroAsignaturas(),
                obtenerCostoAsignatura());
    }
}

