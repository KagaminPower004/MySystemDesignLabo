package roster.domain.model.officedivision;

import roster.domain.support.tool.NewLine;

public enum OfficeDivision {
      OUTSIDE
    , INSIDE
    ;

    private final String myOneOfNewLine = new NewLine().executed();

    public final String comments(){
        if( this.name().equals(OfficeDivision.OUTSIDE.name()) )
            { return
                    "It refers to the state of working outside the company."
            ;}

        if( this.name().equals(OfficeDivision.INSIDE.name()) )
            { return
                      "It refers to the state of working inside the company."
                    + myOneOfNewLine
                    + "However, telework is not included."
            ;}

        else
            { return "The value is not in this division.";}
    }
}