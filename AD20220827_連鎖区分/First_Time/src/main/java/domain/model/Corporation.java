package domain.model;

import java.util.ArrayList;
import java.util.List;

public enum Corporation {
    Kojima(),
    Yamada(myYamadaLocation_List),
    Yodobashi()


    private static final Location myLocation = null;
    private static final List<Location>
            myYamadaLocation_List = new ArrayList<>();

        myYamadaLocation_List.add(myLocation.Saitama);
        myYamadaLocation_List.add(Location.Gunnma);

}
