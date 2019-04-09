package UTN;

public class Humano {

    private String nombre;
    private Integer edad;
    private Integer peso;
    Orinar orinarImp;
    Beber beberImp;

    public Humano( String Nombre, Integer Edad, Integer Peso, Orinar orImp, Beber bebImp){
        this.nombre = Nombre;
        this.edad = Edad;
        this.peso = Peso;
        this.orinarImp = orImp;
        this.beberImp = bebImp;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nombre: " +this.nombre +" Edad: "+this.edad+" Peso: " +this.peso+" kg.";
    }


    // METHODS



}
