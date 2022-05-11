package roster.domain.anticorruption.workdivision.check_behavior;

import roster.domain.anticorruption.workdivision.AnswerService_WorkDivision;

class Actor_Worker {
    public static void main(final String[] args){
        final String myStyle = args[0];

        answerWorkDivision(myStyle);
     }

    private static void answerWorkDivision(final String myStyle){
        final String myAnswerMessage
                = new AnswerService_WorkDivision(myStyle)
                .answerWorkDivision();

        System.out.println(myAnswerMessage);
    }
}
