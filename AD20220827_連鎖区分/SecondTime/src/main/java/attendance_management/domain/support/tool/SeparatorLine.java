package attendance_management.domain.support.tool;

import attendance_management.domain.model.workattendance_substatus.Interface_WorkAttendanceSubStatus;

public class SeparatorLine implements Interface_WorkAttendanceSubStatus {
    private final String SeparatorLine = "---------------OR---------------";

    public SeparatorLine(){}

    public final String name()        { return this.SeparatorLine; }
    public final String description() { return this.SeparatorLine; }
}
