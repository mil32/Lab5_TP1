package UTN.Implementaciones;

import UTN.Interfaces.Beber;

import java.util.Random;

public class BeberVikingoImp implements Beber {


    public Integer beber(){
        return new Random().nextInt(7);
    }
}
