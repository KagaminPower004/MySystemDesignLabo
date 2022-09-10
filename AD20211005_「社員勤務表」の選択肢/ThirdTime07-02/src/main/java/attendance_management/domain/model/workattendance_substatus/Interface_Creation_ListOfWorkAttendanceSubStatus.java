package attendance_management.domain.model.workattendance_substatus;

import java.util.List;

public interface Interface_Creation_ListOfWorkAttendanceSubStatus {
    List<Interface_WorkAttendanceSubStatus> teleworkSettings();
    List<Interface_WorkAttendanceSubStatus> physical_workSettings();
    List<Interface_WorkAttendanceSubStatus> non_workSettings();
}
