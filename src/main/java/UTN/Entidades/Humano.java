package UTN.Entidades;

import UTN.Interfaces.Beber;
import UTN.Interfaces.Orinar;

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

    public Orinar getOrinarImp() {
        return orinarImp;
    }

    public Beber getBeberImp() {
        return beberImp;
    }

    @Override
    public String toString() {
        return this.nombre +", "+this.edad+" años,  " +this.peso+" kg.";
    }


    // METHODS

    public Integer getChance(){

        Integer chance= getPeso();
        if(this instanceof Vikingo) {
            chance += ((Vikingo) this).getBebedorProfesional();
        }else if (this instanceof Espartano) {
            chance += ((Espartano) this).getToleranciaExtra();
        }
        return chance;
    }

    public Humano fight(Humano p2){

        Integer p1Chance = this.getChance();
        Integer p2Chance = p2.getChance();

        while (p1Chance>0 && p2Chance>0) {
            p1Chance = p1Chance + getBeberImp().beber() - getOrinarImp().orinar();

            if(p1Chance>0) {
                System.out.println(this.getNombre() +" -> BEBIENDO... ");
                p2Chance = p2Chance + p2.getBeberImp().beber() - p2.getOrinarImp().orinar();
                System.out.println(p2.getNombre() + (p2Chance > 0 ? " -> BEBIENDO..." : " -> ORINANDO...")  );

            } else {
                System.out.println(this.getNombre() +" -> ORINANDOO...");
            }
        }

        return p1Chance >0 ? this : p2;

    }



}
