package UTN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "DRINK TEAMS FIGHTERS!  -  WELCOME." );

        List<Vikingo> vk = new ArrayList<>();

        vk = Arrays.asList(
                    new Vikingo("Arturo", 35, 78, new OrinarVikingoImp(), new BeberVikingoImp(), 10),
                    new Vikingo("VIGG", 25, 82, new OrinarVikingoImp(), new BeberVikingoImp(), 5)
                    );

        vk.forEach(System.out::println);






    }
}
