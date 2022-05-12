package roster.domain.model.workdivision;

import roster.domain.support.base.Check_Enabled_Object;

public class Check_WorkDivision {

    final private WorkDivision myWorkDivision;

    public Check_WorkDivision(final WorkDivision myWorkDivision){ this.myWorkDivision = myWorkDivision; }

    public final Boolean isEnabled(){
        // まとりょーしか!!
        return new Check_Enabled_Object(myWorkDivision)
                .isEnabled();
    }

    public final Boolean isNotEnabled(){
        return !this.isEnabled();
    }
}