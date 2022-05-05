package roster.domain.anticorruption.tool;

import roster.domain.model.屋内区分;

public class InOrOutdoorDivisionCheck {

    private 屋内区分 myInOrOutdoorDivision;

    public InOrOutdoorDivisionCheck(屋内区分 myInOrOutdoorDivision){ this.myInOrOutdoorDivision = myInOrOutdoorDivision; }

    public Boolean isAvailable(){
        return myInOrOutdoorDivision != null;
    }
}