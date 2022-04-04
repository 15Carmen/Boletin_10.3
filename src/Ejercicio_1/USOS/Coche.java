package Ejercicio_1.USOS;

public class Coche {

    private String matricula;
    public enum Modelo{BERLINA, CABRIO, CUPE}
    public enum Marca{MERCEDES, BMW, AUDI, FERRARI}
    private Modelo modelo;
    private Marca marca;

    public Coche(String matricula, Modelo modelo, Marca marca) {
        this.matricula = matricula;
        this.modelo=modelo;
        this.marca=marca;
    }
}
