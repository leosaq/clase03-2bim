package paquete06;

public class EstudiantePresencial extends Estudiante {
    int numeroCreditos;
    double costoCredito;

    public EstudiantePresencial(String nombresEstudiante, String apellidosEstudiante, String identificacionEstudiante, int edadEstudiante, int numeroCreditos, double costoCredito) {
        super(nombresEstudiante, apellidosEstudiante, identificacionEstudiante, edadEstudiante);
        this.numeroCreditos = numeroCreditos;
        this.costoCredito = costoCredito;
    }

    public void establecerNumeroCreditos(int numero) {
        numeroCreditos = numero;
    }

    public void establecerCostoCredito(double valor) {
        costoCredito = valor;
    }

    @Override
    public void calcularMatricula() {
        matricula = numeroCreditos * costoCredito;
    }

    public int obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    public double obtenerCostoCredito() {
        return costoCredito;
    }

    @Override
    public String toString() {
        return String.format("%sNumero de creditos: %d\nCosto por credito: %.2f\n",
                super.toString(),
                obtenerNumeroCreditos(),
                obtenerCostoCredito());
    }
}

