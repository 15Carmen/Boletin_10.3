package Ejercicio_1.USOS;

import Ejercicio_1.Programador;

public interface Empresa {

    /**
     * declaro en mi interfaz los métodos que voy a obligar a las clases que he indicado que usen
     */

    void cambiarPortatil(Portatil portatil);

    void cambiarTecnologia(Programador.Tecnología tecnologia);

}
