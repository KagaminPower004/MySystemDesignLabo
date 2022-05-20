package attendance_management.domain.anticorruption.workattendance_division;

import attendance_management.domain.model.workstyle_division.Judge_WorkStyleDivision;
import java.util.List;

public class Service_WorkAttendanceDivision {

    private final String myWorkStyle;

    public Service_WorkAttendanceDivision(final String myWorkStyle)
        {
            //引数チェック
            final Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);
            if(myJudgedWorkStyle.isNG())  { System.out.println("This value does not exist."); }

            //フィールドセット
            this.myWorkStyle = myWorkStyle;
        }

    public final String answer()
        {
            //まとりょーしか！！
            return new CreationService_AnswerOfWorkAttendanceDivision(this.myWorkStyle)
                        .create();
        }

    public final List<Interface_WorkAttendanceDivision> list()
        {
            //まとりょーしか！！
            return new CreationService_WorkAttendanceDivisionList(myWorkStyle)
                        .create();
        }
}