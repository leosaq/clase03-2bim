package paquete07;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
        caracteristicas = "Cuadrado";
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public void calcular_area() {
        area = lado * lado * lado * lado;
    }
}
