package paquete07;

public class Rombo extends Figura {

    private double diagonal_menor;
    private double diagonal_mayor;

    public Rombo(double diagonal_menor, double diagonal_mayor) {
        this.diagonal_menor = diagonal_menor;
        this.diagonal_mayor = diagonal_mayor;
        caracteristicas = "Rombo";
    }

    public double getDiagonal_menor() {
        return diagonal_menor;
    }

    public void setDiagonal_menor(double diagonal_menor) {
        this.diagonal_menor = diagonal_menor;
    }

    public double getDiagonal_mayor() {
        return diagonal_mayor;
    }

    public void setDiagonal_mayor(double diagonal_mayor) {
        this.diagonal_mayor = diagonal_mayor;
    }
   
    @Override
    public void calcular_area() {
        area = (diagonal_menor * diagonal_mayor) / 2;
    }
}
