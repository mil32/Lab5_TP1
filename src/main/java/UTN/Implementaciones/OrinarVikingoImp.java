package UTN.Implementaciones;

import UTN.Interfaces.Orinar;

import java.util.Random;

public class OrinarVikingoImp implements Orinar {

    public Integer orinar(){

        return new Random().nextInt(29);
    }
}
