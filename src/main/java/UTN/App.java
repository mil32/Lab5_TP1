package UTN;

import UTN.DAO.Connector;
import UTN.Entidades.Espartano;
import UTN.Entidades.Humano;
import UTN.Entidades.Torneo;
import UTN.Entidades.Vikingo;
import UTN.Implementaciones.BeberEspartanoImp;
import UTN.Implementaciones.BeberVikingoImp;
import UTN.Implementaciones.OrinarEspartanoImp;
import UTN.Implementaciones.OrinarVikingoImp;

import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args )

    {
        Connector db = new Connector();


        List<Humano> vk = Arrays.asList(
                    new Vikingo("Arturo", 35, 98, new OrinarVikingoImp(), new BeberVikingoImp(), 10),
                    new Vikingo("Vigg", 25, 82, new OrinarVikingoImp(), new BeberVikingoImp(), 5),
                    new Vikingo("Walter", 18, 42, new OrinarVikingoImp(), new BeberVikingoImp(), 2)
                    );

        List<Humano> esp = Arrays.asList(
                    new Espartano("Ramon", 35, 78, new OrinarEspartanoImp(), new BeberEspartanoImp(), 15),
                    new Espartano("Giuseppe", 25, 82, new OrinarEspartanoImp(), new BeberEspartanoImp(), 75),
                    new Espartano("Ortani", 42, 62, new OrinarEspartanoImp(), new BeberEspartanoImp(), 20)
                    );

        Torneo t1 = new Torneo( vk , esp );

        String winner = t1.comenzarTorneo();
        System.out.println("*** GANADOR : " +winner+" ***");

        db.save(winner);

    }





}
