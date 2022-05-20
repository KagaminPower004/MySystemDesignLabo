package attendance_management.domain.anticorruption.workattendance_division;

import attendance_management.domain.model.workstyle_division.Check_SpellingOfWorkStyleDivision;
import java.util.List;

public class Service_WorkAttendanceDivision {

    private final String myWorkStyle;

    public Service_WorkAttendanceDivision(final String myWorkStyle)
        {
            //引数チェック
            new Check_SpellingOfWorkStyleDivision(myWorkStyle)
                    .isExceptionOccurred();

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
            return new CreationService_ListOfWorkAttendanceDivision(myWorkStyle)
                        .create();
        }
}