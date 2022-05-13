package attendance_management.domain.anticorruption.workattendance_substatus.check_behavior;

import attendance_management.domain.anticorruption.workattendance_substatus.AnswerService_WorkAttendanceSubStatus;
import attendance_management.domain.anticorruption.workattendance_substatus.AnswerService_DescriptionOfWorkAttendanceSubStatus;

public class Actor_Worker {
    public static void main(final String[] args){
        final String myWorkStyle = args[0];

        answerWorkAttendanceSubStatus(myWorkStyle);
        answerDescriptionOfWorkAttendanceSubStatus(myWorkStyle);
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
