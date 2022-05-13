package attendance_management.domain.anticorruption.workattendance_division.check_behavior;

import attendance_management.domain.anticorruption.workattendance_division.AnswerService_WorkAttendanceDivision;

class Actor_Worker {
    public static void main(final String[] args){
        final String myWorkStyle = args[0];
        answer(myWorkStyle);
     }

    private static void answer(final String myWorkStyle){
        final String myAnswerMessage
                = new AnswerService_WorkAttendanceDivision(myWorkStyle)
                .makeAnswer();

        System.out.println(myAnswerMessage);
    }
}
