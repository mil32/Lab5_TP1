package UTN.Entidades;

import UTN.Entidades.Humano;
import UTN.Interfaces.Beber;
import UTN.Interfaces.Orinar;

public class Vikingo extends Humano {

        private Integer bebedorProfesional;


    public Vikingo(String Nombre, Integer Edad, Integer Peso, Orinar orImp, Beber bebImp, Integer bebedorProfesional) {
        super(Nombre, Edad, Peso, orImp, bebImp);
        this.bebedorProfesional = bebedorProfesional;
    }

    public Integer getBebedorProfesional() {
        return bebedorProfesional;
    }

    public void setBebedorProfesional(Integer bebedorProfesional) {
        this.bebedorProfesional = bebedorProfesional;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
