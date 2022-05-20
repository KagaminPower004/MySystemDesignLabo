package attendance_management.domain.anticorruption.workattendance_division;

import attendance_management.domain.model.workstyle_division.Check_SpellingOfWorkStyleDivision;
import attendance_management.domain.support.tool.NewLine;

class CreationService_AnswerOfWorkAttendanceDivision {

    private final String myWorkStyle;
    private final CreationService_ListOfWorkAttendanceDivision myWorkAttendanceDivisionList;

    private static final String        myOneOfNewLine       = new NewLine().executed();

    CreationService_AnswerOfWorkAttendanceDivision(final String myWorkStyle )
        {
            //引数チェック
            new Check_SpellingOfWorkStyleDivision(myWorkStyle)
                    .isExceptionOccurred();

            //フィールドセット
            this.myWorkStyle = myWorkStyle;
            this.myWorkAttendanceDivisionList
                    = new CreationService_ListOfWorkAttendanceDivision(myWorkStyle);
        }

    public final String create()
        {
            final String myAnswer_the_first_part
                    =  "If the work style is " + myWorkStyle
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