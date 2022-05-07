package roster.domain.anticorruption.workdivision;

import roster.domain.model.WorkDivision;
import roster.domain.support.WorkDivisionCheck;

class WorkDivionAdapter implements WorkDivisionInterface {

    private WorkDivision myWorkDivion;

    WorkDivionAdapter(WorkDivision myWorkDivion){
        this.myWorkDivion = myWorkDivion;
    }

    public final String name(){
        if( new WorkDivisionCheck(myWorkDivion).isAvailable() ){ return myWorkDivion.name(); }
        else                                                   { return "There is no applicable value"; }
    }
}