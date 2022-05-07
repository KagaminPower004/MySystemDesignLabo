package roster.domain.model.workdivision;

import roster.domain.support.base.Check_Enabled_Object;

public class Check_WorkDivision {

    final private WorkDivision myWorkDivision;

    public Check_WorkDivision(WorkDivision myWorkDivision){ this.myWorkDivision = myWorkDivision; }

    public Boolean isEnabled(){
        // まとりょーしか!!
        return new Check_Enabled_Object(myWorkDivision)
                .isEnabled();
    }

    public Boolean isNotEnabled(){
        return !this.isEnabled();
    }
}