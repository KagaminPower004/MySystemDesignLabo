package roster.domain.support;

import roster.domain.model.WorkDivision;

public class WorkDivisionCheck {

    private WorkDivision myWorkDivision;

    public WorkDivisionCheck(WorkDivision myWorkDivision){ this.myWorkDivision = myWorkDivision; }

    public Boolean isAvailable(){
        return myWorkDivision != null;
    }

    public Boolean isNotAvailable(){
        return ! this.isAvailable();
    }
}