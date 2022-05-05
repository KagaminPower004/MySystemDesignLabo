package roster.domain.anticorruption.tool;

import roster.domain.model.勤務区分;

public class WorkDivisionCheck {

    private 勤務区分 myWorkDivision;

    public WorkDivisionCheck(勤務区分 myWorkDivision){ this.myWorkDivision = myWorkDivision; }

    public Boolean isAvailable(){
        return myWorkDivision != null;
    }
}