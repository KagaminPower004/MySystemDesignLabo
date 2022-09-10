package attendance_management.domain.model.workattendance_substatus;

import attendance_management.domain.model.workday_division.Check_WorkDayDivision;
import attendance_management.domain.model.workday_division.WorkDayDivision;
import attendance_management.domain.model.workoffice_division.Check_WorkOfficeDivision;
import attendance_management.domain.model.workoffice_division.WorkOfficeDivision;
import attendance_management.domain.model.worktype_division.Check_WorkTypeDivision;
import attendance_management.domain.model.worktype_division.WorkTypeDivision;

public class Check_ElementsOfWorkAttendanceSubStatus {

    private final Object _myWorkAttendanceSubStatus;

    Check_ElementsOfWorkAttendanceSubStatus(final Object myWorkAttendanceSubStatus )
    {
        this._myWorkAttendanceSubStatus = myWorkAttendanceSubStatus;
    }

    private Boolean Check_Division() {

        //区分値チェック
        if( _myWorkAttendanceSubStatus instanceof WorkOfficeDivision )
            {
                return new Check_WorkOfficeDivision((WorkOfficeDivision)_myWorkAttendanceSubStatus)
                        .isEnabled();
            }
        if( _myWorkAttendanceSubStatus instanceof WorkTypeDivision )
            {
                return new Check_WorkTypeDivision((WorkTypeDivision)_myWorkAttendanceSubStatus)
                        .isEnabled();
            }
        if( _myWorkAttendanceSubStatus instanceof WorkDayDivision )
            {
                return new Check_WorkDayDivision((WorkDayDivision)_myWorkAttendanceSubStatus)
                        .isEnabled();
            }

        //コイツなんでもねぇよ
        return false;
    }

    public Boolean isOK()
        {
            return this.Check_Division();
        }

}