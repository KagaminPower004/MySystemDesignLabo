package roster.domain.anticorruption.tool;

import roster.domain.model.状態区分;

public class RunDivisionCheck {
    private 状態区分 myRunDivision;

    public RunDivisionCheck(状態区分 myRunDivision){ this.myRunDivision = myRunDivision; }

    public Boolean isAvailable(){
        return myRunDivision != null;
    }

}