package attendance_management.domain.anticorruption.workattendance_substatus;

import attendance_management.domain.model.workstyle_division.Judge_WorkStyleDivision;
import attendance_management.domain.support.tool.NewLine;
import attendance_management.domain.support.tool.SeparatorLine;

class CreationService_AnswerOfWorkAttendanceSubStatus {

    private final String myWorkStyle;
    private final AnswerService_WorkAttendanceSubStatus myWorkAttendanceSubStatus;

    private static final SeparatorLine mySeparatorLine      = new SeparatorLine();
    private static final String        myOneOfNewLine       = new NewLine().executed();

    CreationService_AnswerOfWorkAttendanceSubStatus(final String myWorkStyle )
        {
            //引数チェック
            final Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);
            if(myJudgedWorkStyle.isNG()){ throw new RuntimeException( "This value does not exist." ); }

            //フィールドセット
            this.myWorkStyle = myWorkStyle;
            this.myWorkAttendanceSubStatus = new AnswerService_WorkAttendanceSubStatus(myWorkStyle);
        }

    public final String makeAnswer()
        {
            final String myAnswer_the_first_part
                    = "If the workstyle is " + myWorkStyle + ", the corresponding [work_sub-status] is"
                    + myOneOfNewLine;

            final StringBuilder myAnswer_the_main_part_work = new StringBuilder();
            for (final Interface_WorkAttendanceSubStatus
                    myWorkingSubStatus : this.myWorkAttendanceSubStatus.createList())
                {
                    myAnswer_the_main_part_work
                            .append("  ●").append(myWorkingSubStatus.name()).append(myOneOfNewLine);
                }
            final String myAnswer_the_main_part
                    = myAnswer_the_main_part_work.toString()
                    .replace(" ●" + mySeparatorLine.name() ,mySeparatorLine.name())
                    .replace(MultiAdapter_WorkAttendanceSubStatus.INSIDE.name()
                            ,MultiAdapter_WorkAttendanceSubStatus.INSIDE.name()
                                    + " (*there are notes.)");

            final String myAnswer_the_last_part = "." + myOneOfNewLine;

            return myAnswer_the_first_part + myAnswer_the_main_part + myAnswer_the_last_part ;
        }
}