package roster.domain.support;

import roster.domain.model.DayDivision;

public class RunDivisionCheck {
    private DayDivision myRunDivision;

    public RunDivisionCheck(DayDivision myRunDivision){ this.myRunDivision = myRunDivision; }

    public Boolean isAvailable(){
        return myRunDivision != null;
    }

}