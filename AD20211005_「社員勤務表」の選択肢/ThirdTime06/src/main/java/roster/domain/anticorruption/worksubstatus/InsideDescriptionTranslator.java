package roster.domain.anticorruption.worksubstatus;

import roster.domain.model.OfficeDivision;

class InsideDescriptionTranslator {

    InsideDescriptionTranslator(){ }

     final String done(){
        final String front = "<!!caution!!::Not TeleWork!!>";
        final String main  = OfficeDivision.INSIDE.comments();
        final String rear  = "Is it OK?";

        return (front + main + rear);
    }
}
