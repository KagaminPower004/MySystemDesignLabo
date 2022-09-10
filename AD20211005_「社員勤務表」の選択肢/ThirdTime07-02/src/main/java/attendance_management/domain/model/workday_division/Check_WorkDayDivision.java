package attendance_management.domain.model.workday_division;

import attendance_management.domain.support.base.Check_Enabled_Object;

public class Check_WorkDayDivision {
    final private WorkDayDivision myWorkDayDivision;

    public Check_WorkDayDivision(final WorkDayDivision myWorkDayDivision)
        { this.myWorkDayDivision = myWorkDayDivision; }

    public final Boolean isEnabled(){
        // まとりょーしか!!
        return new Check_Enabled_Object(myWorkDayDivision)
                .isEnabled();
    }

    public final Boolean isNotEnabled(){
        return !this.isEnabled();
    }

}