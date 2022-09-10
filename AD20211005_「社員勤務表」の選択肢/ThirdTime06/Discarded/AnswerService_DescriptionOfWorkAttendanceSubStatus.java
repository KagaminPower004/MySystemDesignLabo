package attendance_management.domain.model.workattendance_substatus;

import attendance_management.domain.model.workstyle_division.Judge_WorkStyleDivision;

import java.util.List;

public class AnswerService_DescriptionOfWorkAttendanceSubStatus {

    private final String myWorkStyle;

    public AnswerService_DescriptionOfWorkAttendanceSubStatus(final String myWorkStyle)
        {
            //引数チェック
            final Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);
            if(myJudgedWorkStyle.isNG())  { throw new RuntimeException( "This value does not exist." ); }

            //フィールドセット
            this.myWorkStyle = myWorkStyle;
        }

    public final String answer()
        {
            //まとりょーしか!！
            return new Creation_AnswerOfWorkAttendanceSubStatusDescription(this.myWorkStyle)
                    .create();
        }

    public final List<Interface_WorkAttendanceSubStatus> list()
        {
            return new Creation_ListOfWorkAttendanceSubStatusDescription(this.myWorkStyle)
                        .create();
        }
}