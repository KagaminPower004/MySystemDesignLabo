package attendance_management.domain.model.worktype_division;

import attendance_management.domain.support.base.Check_Enabled_Object;

public class Check_WorkTypeDivision {

    final private WorkTypeDivision myWorkTypeDivision;

    public Check_WorkTypeDivision(final WorkTypeDivision myWorkTypeDivision)
        { this.myWorkTypeDivision = myWorkTypeDivision; }

    public final Boolean isEnabled(){
        // まとりょーしか!!
        return new Check_Enabled_Object(myWorkTypeDivision)
                .isEnabled();
    }

    public final Boolean isNotEnabled(){
        return !this.isEnabled();
    }
}