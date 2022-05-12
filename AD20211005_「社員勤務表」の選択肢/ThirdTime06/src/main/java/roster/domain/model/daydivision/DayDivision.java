package roster.domain.model.daydivision;

import roster.domain.support.tool.NewLine;

public enum DayDivision {
      WORKING
    , NON_WORKING
    ;

    private final String myOneOfNewLine = new NewLine().executed();

    public final String explanation(){
        if( this.name().equals(DayDivision.WORKING.name()) )
            { return
                      "It refers to the state of doing some work."
                    + myOneOfNewLine
                    + "Also includes telework."
            ;}

        if( this.name().equals(DayDivision.NON_WORKING.name()) )
            { return
                      "It means that you are not working all day."
                    + myOneOfNewLine
                    + "Includes weekends and holidays."
            ;}

        else
            { return "The value is not in this division.";}
    }
}