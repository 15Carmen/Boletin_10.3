package Ejercicio_1.USOS;

public class Coche {

    private String matricula;
    public enum ModeloCoche{BERLINA, CABRIO, CUPE}
    public enum MarcaCoche{MERCEDES, BMW, AUDI, FERRARI}
    private ModeloCoche modelo;
    private MarcaCoche marca;

    public Coche(String matricula, ModeloCoche modelo, MarcaCoche marca) {
        this.matricula = matricula;
        this.modelo=modelo;
        this.marca=marca;
    }
}

