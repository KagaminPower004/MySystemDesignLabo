package attendance_management.domain.anticorruption.workattendance_substatus.check_behavior;

import attendance_management.domain.anticorruption.workattendance_substatus
        .AnswerService_WorkAttendanceSubStatus;
import attendance_management.domain.anticorruption.workattendance_substatus
        .AnswerService_DescriptionOfWorkAttendanceSubStatus;
import attendance_management.domain.model.workstyle_division.WorkStyleDivision;

public class Actor_Worker {
    public static void main(final String[] args){

        //全パラメータ網羅 ※なぜ今まで気付けなかったのだろう。。。Orz
        for(WorkStyleDivision myWorkingWorkStyle :WorkStyleDivision.values()){
            String myWorkStyle = myWorkingWorkStyle.name();
            System.out.println( "-------Start to check [" + myWorkStyle + "] !!-------");
            answerWorkAttendanceSubStatus(myWorkStyle);
            answerDescriptionOfWorkAttendanceSubStatus(myWorkStyle);
        }
    }

    private static void answerWorkAttendanceSubStatus(final String myWorkStyle){
        final String myAnswerMessage
                = new AnswerService_WorkAttendanceSubStatus(myWorkStyle)
                .makeAnswer();

        System.out.println(myAnswerMessage);
    }
    private static void answerDescriptionOfWorkAttendanceSubStatus(final String myWorkStyle){
        final String myAnswerMessage
                = new AnswerService_DescriptionOfWorkAttendanceSubStatus(myWorkStyle)
                .makeAnswer();

        System.out.println(myAnswerMessage);
    }
}