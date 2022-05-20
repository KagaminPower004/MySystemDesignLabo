package attendance_management.domain.anticorruption.workattendance_division;

import attendance_management.domain.model.workstyle_division.Judge_WorkStyleDivision;
import attendance_management.domain.support.tool.NewLine;

class CreationService_AnswerOfWorkAttendanceDivision {

    private final String myWorkStyle;
    private final CreationService_WorkAttendanceDivisionList myWorkAttendanceDivisionList;

    private static final String        myOneOfNewLine       = new NewLine().executed();

    CreationService_AnswerOfWorkAttendanceDivision(final String myWorkStyle )
        {
            //引数チェック
            final Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);
            if(myJudgedWorkStyle.isNG()){ throw new RuntimeException( "This value does not exist." ); }

            //フィールドセット
            this.myWorkStyle = myWorkStyle;
            this.myWorkAttendanceDivisionList
                    = new CreationService_WorkAttendanceDivisionList(myWorkStyle);
        }

    public final String create()
        {
            final String myAnswer_the_first_part
                    =  "If the workstyle is " + myWorkStyle
                    + ", the corresponding [WorkAttendanceDivision] is" + myOneOfNewLine;

            final StringBuilder myAnswer_the_main_part_work = new StringBuilder();
            for (final Interface_WorkAttendanceDivision
                    myWorkingDivision : this.myWorkAttendanceDivisionList.create())
                {
                    myAnswer_the_main_part_work
                            .append("  ●").append(myWorkingDivision.name())
                            .append(myOneOfNewLine);
                }
            final String myAnswer_the_main_part = myAnswer_the_main_part_work.toString();

            final String myAnswer_the_last_part = "." + myOneOfNewLine;

            return myAnswer_the_first_part
                    + myAnswer_the_main_part
                    + myAnswer_the_last_part ;
        }
}