package roster.domain.anticorruption.adapter;

import roster.domain.model.勤務区分;
import roster.domain.anticorruption.service.WorkDivisionInterface;
import roster.domain.anticorruption.tool.WorkDivisionCheck;

public class WorkDivionAdapter implements WorkDivisionInterface {

    private 勤務区分 myWorkDivion;

    public WorkDivionAdapter(勤務区分 myWorkDivion){
        this.myWorkDivion = myWorkDivion;
    }

    public final String name(){
        if( new WorkDivisionCheck(myWorkDivion).isAvailable() ){ return myWorkDivion.name(); }
        else                                      { return "There is no applicable value"; }
    }
}