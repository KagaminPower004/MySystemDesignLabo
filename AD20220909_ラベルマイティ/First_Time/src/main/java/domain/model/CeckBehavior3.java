package domain.model;

import java.util.ArrayList;
import java.util.List;

public class CeckBehavior3 {
    public static void main(String[] args){
        AmaJava AmaChan = new AmaJava( 111 );
        ProJava ProChan = new ProJava(  );
        AdapterJava me1 = new AdapterJava( AmaChan );
        AdapterJava me2 = new AdapterJava( ProChan );

        System.out.println(me2.me().getClass().getName());

        List<Object> LavelBonJackList = new ArrayList<>();
        LavelBonJackList.add(AmaChan);
        LavelBonJackList.add(ProChan);

    }
}
