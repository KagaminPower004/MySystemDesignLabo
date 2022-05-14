package attendance_management.domain.anticorruption.workattendance_division.check_behavior;

import attendance_management.domain
        .anticorruption.workattendance_division.AnswerService_WorkAttendanceDivision;
import attendance_management.domain.model.workstyle_division.WorkStyleDivision;

class Actor_Worker {
    public static void main(final String[] args) {
        //全パラメータ網羅 ※なぜ今まで気付けなかったのだろう。。。Orz
        for (WorkStyleDivision myWorkingWorkStyle : WorkStyleDivision.values()) {
            String myWorkStyle = myWorkingWorkStyle.name();
            System.out.println("-------Start to check [" + myWorkStyle + "] !!-------");
            answer(myWorkStyle);
        }
    }

    private static void answer(final String myWorkStyle){
        final String myAnswerMessage
                = new AnswerService_WorkAttendanceDivision(myWorkStyle)
                .makeAnswer();

        System.out.println(myAnswerMessage);
    }
}