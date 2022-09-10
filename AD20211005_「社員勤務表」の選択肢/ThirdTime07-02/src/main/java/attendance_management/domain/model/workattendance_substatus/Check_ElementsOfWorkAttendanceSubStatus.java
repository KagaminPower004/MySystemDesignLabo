package attendance_management.domain.model.workattendance_substatus;

import attendance_management.domain.model.workday_division.Check_WorkDayDivision;
import attendance_management.domain.model.workday_division.WorkDayDivision;
import attendance_management.domain.model.workoffice_division.Check_WorkOfficeDivision;
import attendance_management.domain.model.workoffice_division.WorkOfficeDivision;
import attendance_management.domain.model.worktype_division.Check_WorkTypeDivision;
import attendance_management.domain.model.worktype_division.WorkTypeDivision;

public class Check_ElementsOfWorkAttendanceSubStatus {

    private final Boolean _isOK;

    Check_ElementsOfWorkAttendanceSubStatus( final Object myWorkAttendanceSubStatus){
        if( myWorkAttendanceSubStatus instanceof WorkOfficeDivision ) {
            this._isOK = new Check_WorkOfficeDivision( myWorkAttendanceSubStatus ).isEnabled();
        }

        this._isOK = false;
    }

    Check_ElementsOfWorkAttendanceSubStatus(final WorkOfficeDivision  myWorkAttendanceSubStatus )
        {
            this._isOK = new Check_WorkOfficeDivision( myWorkAttendanceSubStatus ).isEnabled();
        }

    Check_ElementsOfWorkAttendanceSubStatus(final WorkTypeDivision myWorkAttendanceSubStatus )
        {
            this._isOK = new Check_WorkTypeDivision( myWorkAttendanceSubStatus ).isEnabled();
        }

    Check_ElementsOfWorkAttendanceSubStatus(final WorkDayDivision myWorkAttendanceSubStatus )
        {
            this._isOK = new Check_WorkDayDivision( myWorkAttendanceSubStatus ).isEnabled();
        }

    private Boolean Check_Division() { return this._isOK; }

    public Boolean isOK()
        {
            return this.Check_Division();
        }

}