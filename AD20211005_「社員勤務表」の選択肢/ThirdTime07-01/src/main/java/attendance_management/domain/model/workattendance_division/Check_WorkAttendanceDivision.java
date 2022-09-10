package attendance_management.domain.model.workattendance_division;

import attendance_management.domain.support.base.Check_Enabled_Object;

public class Check_WorkAttendanceDivision {

    final private WorkAttendanceDivision myWorkAttendanceDivision;

    public Check_WorkAttendanceDivision(final WorkAttendanceDivision myWorkAttendanceDivision)
        { this.myWorkAttendanceDivision = myWorkAttendanceDivision; }

    public final Boolean isEnabled()
        {
            // まとりょーしか!!
            return new Check_Enabled_Object(myWorkAttendanceDivision)
                    .isEnabled();
        }

    public final Boolean isNotEnabled(){
        return !this.isEnabled();
    }
}