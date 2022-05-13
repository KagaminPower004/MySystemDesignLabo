package attendance_management.domain.model.workoffice_division;

import attendance_management.domain.support.base.Check_Enabled_Object;

public class Check_WorkOfficeDivision {

    final private WorkOfficeDivision myWorkOfficeDivision;

    public Check_WorkOfficeDivision(final WorkOfficeDivision myWorkOfficeDivision)
        { this.myWorkOfficeDivision = myWorkOfficeDivision; }

    public final Boolean isEnabled(){
        // まとりょーしか!!
        return new Check_Enabled_Object(myWorkOfficeDivision)
                .isEnabled();
    }

    public final Boolean isNotEnabled(){
        return !this.isEnabled();
    }
}