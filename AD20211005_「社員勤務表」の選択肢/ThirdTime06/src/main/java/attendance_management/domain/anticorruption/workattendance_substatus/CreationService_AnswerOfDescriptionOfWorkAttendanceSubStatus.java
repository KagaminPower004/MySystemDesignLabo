package attendance_management.domain.anticorruption.workattendance_substatus;

import attendance_management.domain.model.workstyle_division.Judge_WorkStyleDivision;
import attendance_management.domain.support.tool.NewLine;

class CreationService_AnswerOfDescriptionOfWorkAttendanceSubStatus {

    private final String myWorkStyle;
    private final AnswerService_DescriptionOfWorkAttendanceSubStatus mySubStatusDescription;

    private static final String myOneOfNewLine = new NewLine().executed();

    CreationService_AnswerOfDescriptionOfWorkAttendanceSubStatus(final String myWorkStyle )
        {
            //引数チェック
            final Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);
            if(myJudgedWorkStyle.isNG()){ throw new RuntimeException( "This value does not exist." ); }

            //フィールドセット
            this.myWorkStyle = myWorkStyle;
            this.mySubStatusDescription
                    = new AnswerService_DescriptionOfWorkAttendanceSubStatus(myWorkStyle);
        }

    public final String makeAnswer()
        {
            final String myAnswer_the_first_part = "If the " + myWorkStyle + " is " + myOneOfNewLine;

            final StringBuilder myAnswer_the_main_part_work = new StringBuilder();
            for (final Interface_WorkAttendanceSubStatus
                    myWorkingDescription :this.mySubStatusDescription.createList())
                {
                    myAnswer_the_main_part_work
                            .append("  ●").append(myWorkingDescription.name()).append(":")
                            .append(myOneOfNewLine)
                            .append("    ⇒")
                            .append(myWorkingDescription.description()
                                    .replace(myOneOfNewLine,myOneOfNewLine + "      "))
                            .append(myOneOfNewLine);
                }
            final String myAnswer_the_main_part = myAnswer_the_main_part_work.toString();

            final String myAnswer_the_last_part =  "" + myOneOfNewLine;

            return myAnswer_the_first_part
                    + myAnswer_the_main_part
                    + myAnswer_the_last_part ;
        }
}