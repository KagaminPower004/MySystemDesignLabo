package attendance_management.domain.model.worktype_division;

import attendance_management.domain.support.tool.NewLine;

public enum WorkTypeDivision {
      INDOOR
    , OUTDOOR
    ;

    private static final String myOneOfNewLine = new NewLine().executed();

    public final String detailDescription(){
        if( this.name().equals(WorkTypeDivision.INDOOR.name()) )
            { return
                       "It mainly refers to the state of working in a building"
                     + myOneOfNewLine
                     + "by doing work styles that correspond to desk work."
            ;}

        if(this.name().equals(WorkTypeDivision.OUTDOOR.name()))
            { return
                       "It refers to the state where most of the working hours work outside the building"
                     + myOneOfNewLine
                     + ", such as outside sales."
                     + myOneOfNewLine
                     + "Therefore, telework is not included."
            ;}

        else
            { return "The value is not in this division.";}
    }
}