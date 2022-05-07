package roster.domain.support;

import roster.domain.model.TypeDivision;

public class InOrOutdoorDivisionCheck {

    private TypeDivision myInOrOutdoorDivision;

    public InOrOutdoorDivisionCheck(TypeDivision myInOrOutdoorDivision){ this.myInOrOutdoorDivision = myInOrOutdoorDivision; }

    public Boolean isAvailable(){
        return myInOrOutdoorDivision != null;
    }
}