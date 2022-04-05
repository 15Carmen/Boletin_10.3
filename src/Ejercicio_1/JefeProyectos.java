package Ejercicio_1;

import Ejercicio_1.USOS.Coche;
import Ejercicio_1.USOS.Empresa;
import Ejercicio_1.USOS.Portatil;

import java.time.LocalDate;
import java.util.ArrayList;

public class JefeProyectos extends Empleado implements Empresa {

    //atributos

    public enum Despacho {ATICO_1, ATICO_2, ATICO_3, ATICO_4}

    private int movil;
    private Coche coche;
    private Portatil portatil;
    private Programador.Tecnología tecnologia;
    private Administrativo administrativo;

    private ArrayList<Programador> programadoresLista = new ArrayList<Programador>();
    private ArrayList<Programador.Proyecto> proyectosLista = new ArrayList<>();


    //constructores

    public JefeProyectos(String nombre, String apellidos, String dni, String direccion, LocalDate antiguedad, int telf,
                         double salario, Portatil portatil1, Programador.Tecnología limpia, Administrativo empleado1, int movil, Coche coche, Portatil portatil,
                         Programador.Tecnología tecnologia, Administrativo administrativo) {
        super(nombre, apellidos, dni, direccion, antiguedad, telf, salario);
        this.movil = movil;
        this.coche = coche;
        this.portatil = portatil;
        this.tecnologia = tecnologia;
        this.administrativo = administrativo;
    }

    public JefeProyectos(String nombre, String apellidos, String dni, String direccion, LocalDate antiguedad, int telf,
                         double salario) {
        super(nombre, apellidos, dni, direccion, antiguedad, telf, salario);
        this.movil = movil;
        this.coche = coche;
        this.portatil = portatil;
        this.tecnologia = tecnologia;
        this.administrativo = administrativo;
    }

    public JefeProyectos(String nombre, String apellidos, String dni, int movil, Coche coche, Portatil portatil,
                         Programador.Tecnología tecnologia, Administrativo administrativo) {
        super(nombre, apellidos, dni);
        this.movil = movil;
        this.coche = coche;
        this.portatil = portatil;
        this.tecnologia = tecnologia;
        this.administrativo = administrativo;
    }


    //metodos

    /**
     * Metodo para añadir un programador al ArrayList, usando un el metodo add() del ArrayList
     * Precondición: Se debe introducir por parametros el programador de la clase programador
     * Postcondición: ninguna
     * Entrada: Programador
     * Salida: -
     * @param programador
     */
    public void añadirProgramador(Programador programador){
        programadoresLista.add(programador);
    }

    /**
     * Metodo para quitar un programador al ArrayList, usando un el metodo remove() del ArrayList
     * Precondición: Se debe introducir por parametros el programador de la clase programador
     * Postcondición: ninguna
     * Entrada: Programador
     * Salida: -
     * @param programador
     */
    public void darBajaProgramador(Programador programador){
        programadoresLista.remove(programador);
    }


    /**
     * Precondición:
     * Postcondición:
     * Entrada:
     * Salida:
     * @param proyecto
     */
    public void añadirProyecto(Programador.Proyecto proyecto){
        proyectosLista.add(proyecto);
    }

    /**
     * Precondición:
     * Postcondición:
     * Entrada:
     * Salida:
     * @param proyecto
     */
    public void quitarProyecto(Programador.Proyecto proyecto){
        proyectosLista.remove(proyecto);
    }

    /**
     * Precondición:
     * Postcondición:
     * Entrada:
     * Salida:
     */
    public void cambiarPortatil(Portatil portatil){

        if(this.portatil.equals(portatil)){
            System.out.println("Ya tiene este portatil");
        }else {
            this.portatil=portatil;
        }
    }

    /**
     * Precondición:
     * Postcondición:
     * Entrada:
     * Salida:
     */
    public void cambiarTecnologia(Programador.Tecnología tecnologia){

        if(this.tecnologia.equals(tecnologia)){
            System.out.println("Ya tiene esta tecnología");
        }else {
            this.tecnologia=tecnologia;
        }
    }

    /**
     * Precondición:
     * Postcondición:
     * Entrada:
     * Salida:
     */
    public void cambiarAdministrativo(Administrativo administrativo){

        if(this.administrativo.equals(administrativo)){
            System.out.println("Ya trabaja con este administrativo");
        }else {
            this.administrativo=administrativo;
        }
    }

    /**
     * Precondición:
     * Postcondición:
     * Entrada:
     * Salida:
     */
    public void cambiarCoche(Coche coche){

        if(this.coche.equals(coche)){
            System.out.println("Ya tiene este coche");
        }else {
            this.coche=coche;
        }
    }

    /**
     * Metodo por el cual el salario base introducido se incrementará
     * Precondición: el empleado debe cobrar un salario
     * Postcondición: el salario incrementado debe ser mayor que el salario base
     * Entrada: double salario
     * Salida: double
     */
    @Override
    public void incrementarSalario(){

        double porcentajeSubida = 20;
        double incremento = ((porcentajeSubida/100)*salario)+salario;

        this.salario+=incremento;
    }
}
