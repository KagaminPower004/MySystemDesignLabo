package roster.domain.anticorruption.worksubstatus;

import roster.domain.model.officedivision.OfficeDivision;
import roster.domain.support.tool.NewLine;

class Translator_InsideDescription {
    private final String myOneOfNewLine = new NewLine().executed();

    Translator_InsideDescription(){ }

     final String done(){
        final String front = "<!!caution!!::Not Telework!!>"  + myOneOfNewLine;
        final String main  = OfficeDivision.INSIDE.comments() + myOneOfNewLine;
        final String rear  = "Is it OK?";

        return (front + main + rear);
    }
}
