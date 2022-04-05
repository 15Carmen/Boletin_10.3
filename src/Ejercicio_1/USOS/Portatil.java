package Ejercicio_1.USOS;

public class Portatil {

    private int numSerie;
    public enum Marca{HP, LENOVO, MSI, ACER}
    public enum Modelo{PRIMERA_GEN, SEGUNDA_GEN, TERCERA_GEN}
    private Marca marca;
    private Modelo modelo;

    public Portatil(Marca marca, Modelo modelo, int numSerie) {
        this.marca= marca;
        this.modelo=modelo;
        this.numSerie=numSerie;
    }

}
