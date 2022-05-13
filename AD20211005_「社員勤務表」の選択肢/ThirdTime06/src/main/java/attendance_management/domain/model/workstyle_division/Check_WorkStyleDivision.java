package attendance_management.domain.model.workstyle_division;

import attendance_management.domain.support.base.Check_Enabled_Object;

public class Check_WorkStyleDivision {

    final private WorkStyleDivision myWorkStyleDivision;

    public Check_WorkStyleDivision(final WorkStyleDivision myWorkStyleDivision)
        { this.myWorkStyleDivision = myWorkStyleDivision; }

    public final Boolean isEnabled(){
        // まとりょーしか!!
        return new Check_Enabled_Object(myWorkStyleDivision)
                .isEnabled();
    }

    public final Boolean isNotEnabled(){
        return !this.isEnabled();
    }
}