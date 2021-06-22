
package co.com.reto.cargame.domain.carril;

import co.com.reto.cargame.domain.ids.CarroId;
import co.com.reto.cargame.domain.ids.JuegoId;
import co.com.reto.cargame.domain.carril.values.Posicion;


public class Carril {

    protected CarroId carroId;
    protected JuegoId juegoId;
    protected Posicion posicion;
    protected Integer metros;
    protected Boolean desplazamientoFinal;

    public Carril(CarroId carroId, JuegoId juegoId, Posicion posicion, Integer metros, Boolean desplazamientoFinal) {
        this.carroId = carroId;
        this.juegoId = juegoId;
        this.posicion = posicion;
        this.metros = metros;
        this.desplazamientoFinal = desplazamientoFinal;
    }

    public void alcanzarLaMeta() {
        if (posicionActual() >= posicionDeseada()) {
            desplazamientoFinal = true;
        }

    }

    public void moverCarro(Posicion posicion, Integer cantidad) {
        this.posicion = posicion;
        posicion.setActual(posicion.actual() + cantidad);
        alcanzarLaMeta();
    }

    public Integer metros() {

        return metros;

    }

    public Posicion posicion() {

        return posicion;

    }

    public Integer posicionActual() {

        return posicion.actual();

    }

    public Integer posicionDeseada() {
        return posicion.meta();
    }

    public Boolean desplazamientoFinal() {

        return desplazamientoFinal;

    }

}
