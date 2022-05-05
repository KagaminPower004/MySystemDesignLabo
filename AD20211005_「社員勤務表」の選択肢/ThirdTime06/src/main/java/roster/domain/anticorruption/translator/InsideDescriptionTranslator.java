package roster.domain.anticorruption.translator;

import roster.domain.model.LocationDivision;

public class InsideDescriptionTranslator {

    InsideDescriptionTranslator(){ }

    public final String description(){
        final String front = "";
        final String main  = LocationDivision.INSIDE.comments();
        final String rear  = "なんてな。";

        return (front + main + rear);
    }
}
