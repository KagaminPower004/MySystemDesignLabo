package roster.domain.support;

import roster.domain.model.OfficeDivision;

public class LocationDivisionCheck {

    private OfficeDivision myLocationDivision;

    public LocationDivisionCheck(OfficeDivision myLocationDivision){ this.myLocationDivision = myLocationDivision; }

    public Boolean isAvailable(){
        return myLocationDivision != null;
    }
}