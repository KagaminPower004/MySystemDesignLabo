package roster.domain.anticorruption.tool;

import roster.domain.model.LocationDivision;

public class LocationDivisionCheck {

    private LocationDivision myLocationDivision;

    public LocationDivisionCheck(LocationDivision myLocationDivision){ this.myLocationDivision = myLocationDivision; }

    public Boolean isAvailable(){
        return myLocationDivision != null;
    }
}