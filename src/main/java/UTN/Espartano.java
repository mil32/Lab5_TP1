package UTN;

public class Espartano extends Humano {

    private Integer toleranciaExtra;

    public Espartano(String Nombre, Integer Edad, Integer Peso, Orinar orImp, Beber bebImp, Integer toleranciaExtra) {
        super(Nombre, Edad, Peso, orImp, bebImp);
        this.toleranciaExtra = toleranciaExtra;
    }
}
