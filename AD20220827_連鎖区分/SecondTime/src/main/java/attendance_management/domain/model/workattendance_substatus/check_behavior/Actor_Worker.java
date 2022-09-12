package attendance_management.domain.model.workattendance_substatus.check_behavior;

import attendance_management.domain.model.workattendance_substatus.MultiAdapter_WorkAttendanceSubStatus;
import attendance_management.domain.model.workattendance_substatus.MultiAdapter_WorkAttendanceSubStatus02;

public class Actor_Worker {
    public static void main(final String[] args){

        System.out.println(MultiAdapter_WorkAttendanceSubStatus02.OfficeDivision.names());
        System.out.println(MultiAdapter_WorkAttendanceSubStatus.WORKING);
    }
}