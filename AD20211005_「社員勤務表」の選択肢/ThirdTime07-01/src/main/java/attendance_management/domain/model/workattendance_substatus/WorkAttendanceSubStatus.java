package attendance_management.domain.model.workattendance_substatus;

import attendance_management.domain.model.workstyle_division.Check_SpellingOfWorkStyleDivision;

import java.util.List;

public class WorkAttendanceSubStatus {

    private final String myWorkStyle;

    public WorkAttendanceSubStatus(final String myWorkStyle)
        {
            //引数チェック
            new Check_SpellingOfWorkStyleDivision(myWorkStyle)
                    .isExceptionOccurred();

            //フィールドセット
            this.myWorkStyle = myWorkStyle;

        }

    public final String answer()
        {
            //まとりょーしか!!
            return new Creation_AnswerOfWorkAttendanceSubStatus(this.myWorkStyle)
                        .create() ;
        }

    public final List<Interface_WorkAttendanceSubStatus> toList()
        {
            //まとりょーしか!!
            return new Creation_ListOfWorkAttendanceSubStatus(this.myWorkStyle)
                        .create();
        }

    public final String describe()
        {
            //まとりょーしか!！
            return new Creation_AnswerOfWorkAttendanceSubStatusDescription(this.myWorkStyle)
                            .create();
        }
}