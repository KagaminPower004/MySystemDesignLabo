package attendance_management.domain.model.workattendance_substatus;

import attendance_management.domain.model.workstyle_division.Judge_WorkStyleDivision;
import attendance_management.domain.support.tool.NewLine;

class Creation_AnswerOfWorkAttendanceSubStatusDescription {

    private final String myWorkStyle;
    private final Creation_ListOfWorkAttendanceSubStatusDescription mySubStatusDescription;

    private static final String myOneOfNewLine = new NewLine().executed();

    Creation_AnswerOfWorkAttendanceSubStatusDescription(final String myWorkStyle )
        {
            //引数チェック
            final Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);
            if(myJudgedWorkStyle.isNG()){ throw new RuntimeException( "This value does not exist." ); }

            //フィールドセット
            this.myWorkStyle = myWorkStyle;
            this.mySubStatusDescription
                    = new Creation_ListOfWorkAttendanceSubStatusDescription(myWorkStyle);
        }

    public final String create()
        {
            final String myAnswer_the_first_part = "If the " + myWorkStyle + " is " + myOneOfNewLine;

            final StringBuilder myAnswer_the_main_part_work = new StringBuilder();
            for (final Interface_WorkAttendanceSubStatus
                    myWorkingDescription :this.mySubStatusDescription.create())
                {
                    myAnswer_the_main_part_work
                            .append("  ●")
                            .append(myWorkingDescription.name())
                            .append(":")
                            .append(myOneOfNewLine)
                            .append("    ⇒")
                            .append(myWorkingDescription.description()
                                    .replace(myOneOfNewLine
                                            ,myOneOfNewLine + "      "
                                    )
                            )
                            .append(myOneOfNewLine);
                }
            final String myAnswer_the_main_part = myAnswer_the_main_part_work.toString();

            final String myAnswer_the_last_part =  "." + myOneOfNewLine;

            return myAnswer_the_first_part
                    + myAnswer_the_main_part
                    + myAnswer_the_last_part ;
        }
}