package Ejercicio_1;

import Ejercicio_1.USOS.Coche;
import Ejercicio_1.USOS.Portatil;

import java.util.ArrayList;

public class JefeProyectos {

    public enum Despacho {ATICO_1, ATICO_2, ATICO_3, ATICO_4}

    private int movil;
    private Coche coche;
    private Portatil portatil;
    private Programador.Tecnología tecnologia;

    private ArrayList<Programador.Proyecto> programadoresLista = new ArrayList<Programador.Proyecto>();
    private ArrayList<Programador.Proyecto> proyectosLista = new ArrayList<>();

    public JefeProyectos(int movil, Coche coche, Portatil portatil, Programador.Tecnología tecnologia) {
        this.movil = movil;
        this.coche = coche;
        this.portatil = portatil;
        this.tecnologia = tecnologia;
    }

    public void añadirProgramador(Programador.Proyecto programador){
        programadoresLista.add(programador);
    }

    public void darBajaProgramador(Programador programador){
        programadoresLista.remove(programador);
    }

    public void añadirProyecto(Programador.Proyecto proyecto){
        proyectosLista.add(proyecto);
    }

    public void quitarProyecto(Programador.Proyecto proyecto){
        proyectosLista.remove(proyecto);
    }
}
