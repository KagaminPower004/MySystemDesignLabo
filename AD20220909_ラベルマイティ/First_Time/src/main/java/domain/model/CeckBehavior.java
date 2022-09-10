package domain.model;

import java.util.ArrayList;
import java.util.List;

public class CeckBehavior {
    public static void main(String[] args){
        InterfaceJava AmaChan = new AmaJava( 111 );
        InterfaceJava ProChan = new ProJava(  );

        List<InterfaceJava> LavelBonJackList = new ArrayList<>();
        LavelBonJackList.add(AmaChan);
        LavelBonJackList.add(ProChan);

        System.out.println(ProChan.me().getClass().getName());

    }
}
