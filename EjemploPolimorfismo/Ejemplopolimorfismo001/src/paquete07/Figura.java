
package paquete07;

abstract class Figura {
    protected String caracteristicas;
    protected double area;

    public abstract void calcular_area();

    public double getArea() {
        return area;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Figura{" + "caracteristicas=" + caracteristicas + ", area=" + area + '}';
    }
    
    
}
