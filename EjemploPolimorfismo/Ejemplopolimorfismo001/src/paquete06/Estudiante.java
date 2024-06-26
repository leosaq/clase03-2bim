package paquete06;

public abstract class Estudiante {
    protected String nombresEstudiante;
    protected String apellidosEstudiante;
    protected String identificacionEstudiante;
    protected int edadEstudiante;
    protected double matricula; // Agregado campo matricula

    public Estudiante(String nombresEstudiante, String apellidosEstudiante, String identificacionEstudiante, int edadEstudiante) {
        this.nombresEstudiante = nombresEstudiante;
        this.apellidosEstudiante = apellidosEstudiante;
        this.identificacionEstudiante = identificacionEstudiante;
        this.edadEstudiante = edadEstudiante;
    }

    public void establecerNombresEstudiante(String nom) {
        nombresEstudiante = nom;
    }

    public void establecerApellidoEstudiante(String ape) {
        apellidosEstudiante = ape;
    }

    public void establecerIdentificacionEstudiante(String iden) {
        identificacionEstudiante = iden;
    }

    public void establecerEdadEstudiante(int ed) {
        edadEstudiante = ed;
    }

    public abstract void calcularMatricula();

    public String obtenerNombresEstudiante() {
        return nombresEstudiante;
    }

    public String obtenerApellidoEstudiante() {
        return apellidosEstudiante;
    }

    public String obtenerIdentificacionEstudiante() {
        return identificacionEstudiante;
    }

    public int obtenerEdadEstudiante() {
        return edadEstudiante;
    }

    public double obtenerMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return String.format("Nombres: %s\nApellidos: %s\nIdentificacion: %s\nEdad: %d\nMatricula: %.2f\n",
                obtenerNombresEstudiante(),
                obtenerApellidoEstudiante(),
                obtenerIdentificacionEstudiante(),
                obtenerEdadEstudiante(),
                obtenerMatricula());
    }
}

