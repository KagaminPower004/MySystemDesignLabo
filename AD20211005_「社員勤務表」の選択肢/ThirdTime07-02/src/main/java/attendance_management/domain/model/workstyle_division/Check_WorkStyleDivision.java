package attendance_management.domain.model.workstyle_division;

import attendance_management.domain.support.base.Check_Enabled_Object;

public class Check_WorkStyleDivision {

    private final WorkStyleDivision myWorkStyleDivision;

    public Check_WorkStyleDivision(final WorkStyleDivision myWorkStyleDivision)
        {
            //フィールドセット
            this.myWorkStyleDivision = myWorkStyleDivision;
        }

    public final Boolean isEnabled(){
        // まとりょーしか!!
        return new Check_Enabled_Object(myWorkStyleDivision)
                .isEnabled();
    }

    public final Boolean isNotEnabled(){
        return !this.isEnabled();
    }
}