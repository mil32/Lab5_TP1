package UTN.Implementaciones;

import UTN.Interfaces.Beber;

import java.util.Random;

public class BeberEspartanoImp implements Beber {


    public Integer beber() {
        return new Random().nextInt(10);
    }
}
