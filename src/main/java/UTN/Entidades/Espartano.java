package UTN.Entidades;

import UTN.Entidades.Humano;
import UTN.Interfaces.Beber;
import UTN.Interfaces.Orinar;

public class Espartano extends Humano {

    private Integer toleranciaExtra;

    public Espartano(String Nombre, Integer Edad, Integer Peso, Orinar orImp, Beber bebImp, Integer toleranciaExtra) {
        super(Nombre, Edad, Peso, orImp, bebImp);
        this.toleranciaExtra = toleranciaExtra;
    }

    public Integer getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }
}
