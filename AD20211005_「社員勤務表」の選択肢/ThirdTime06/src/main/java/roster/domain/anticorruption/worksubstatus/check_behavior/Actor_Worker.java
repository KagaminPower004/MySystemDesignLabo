package roster.domain.anticorruption.worksubstatus.check_behavior;

import roster.domain.anticorruption.worksubstatus.AnswerService_WorkSubStatus;
import roster.domain.anticorruption.worksubstatus.AnswerService_WorkSubStatusDescription;

public class Actor_Worker {
    public static void main(final String[] args){
        final String myStyle = args[0];

        answerWorkSubStatus(myStyle);
        answerWorkSubStatusDescription(myStyle);
    }

    private static void answerWorkSubStatus(final String myStyle){
        final String myAnswerMessage
                = new AnswerService_WorkSubStatus(myStyle)
                .answerWorkSubStatus();

        System.out.println(myAnswerMessage);
    }
    private static void answerWorkSubStatusDescription(final String myStyle){
        final String myAnswerMessage
                = new AnswerService_WorkSubStatusDescription(myStyle)
                .answer_WorkSubStatusDescription();

        System.out.println(myAnswerMessage);
    }
}
