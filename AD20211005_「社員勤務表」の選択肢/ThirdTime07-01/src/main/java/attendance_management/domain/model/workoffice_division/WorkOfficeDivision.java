package attendance_management.domain.model.workoffice_division;

import attendance_management.domain.support.tool.NewLine;

public enum WorkOfficeDivision {
      OUTSIDE
    , INSIDE
    ;

    private static final String myOneOfNewLine = new NewLine().executed();

    public final String comments(){
        if( this.name().equals(WorkOfficeDivision.OUTSIDE.name()) )
            { return
                    "It refers to the state of working outside the company."
            ;}

        if( this.name().equals(WorkOfficeDivision.INSIDE.name()) )
            { return
                      "It refers to the state of working inside the company."
                    + myOneOfNewLine
                    + "However, telework is not included."
            ;}

        else
            { return "The value is not in this division.";}
    }
}