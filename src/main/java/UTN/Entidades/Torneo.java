package UTN.Entidades;

import UTN.Entidades.Humano;
import UTN.Implementaciones.BeberVikingoImp;
import UTN.Implementaciones.OrinarEspartanoImp;

import java.util.Comparator;
import java.util.List;

public class Torneo {

    private List<Humano> team1;
    private List<Humano> team2;

    public Torneo(List<Humano> vikingos, List<Humano> espartanos) {
        this.team1 = vikingos;
        this.team2 = espartanos;
    }




    public void ordenarPesos() {
        team1.sort(Comparator.comparing(Humano::getPeso) );
        team2.sort(Comparator.comparing(Humano::getPeso) );
    }

    public String comenzarTorneo(){

        this.ordenarPesos();

        System.out.println( "DRINK TEAMS FIGHTERS!  -  WELCOME." );
        this.showTeams();

        Humano p1 = team1.get(0);
        Humano p2 = team2.get(0);

        System.out.println("------------------ ");
        System.out.println(p1.getNombre()+" vs. " + p2.getNombre());
        System.out.println("---- FIGHT! ------ ");
        Humano result = p1.fight(p2);

        System.out.println("GANADOR: " + result.getNombre() );
        System.out.println("\n\nPelea FINAL vs el dueño de la taverna aka BOWSER -----\n");

        return bossFight(result).getNombre();

    }

    private Humano bossFight(Humano p1) {
        Humano boss = new Humano("BOWSER", 35, 110, new OrinarEspartanoImp(), new BeberVikingoImp());
        return boss.fight(p1);

    }

    public void showTeams() {
        System.out.println("----- VIKINGOS ------ ");
        team1.forEach(System.out::println);

        System.out.println("\n----- ESPARTANOS ------ ");
        team2.forEach(System.out::println);
    }

}
