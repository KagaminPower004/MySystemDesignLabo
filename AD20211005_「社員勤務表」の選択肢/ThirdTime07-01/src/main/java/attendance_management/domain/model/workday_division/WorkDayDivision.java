package attendance_management.domain.model.workday_division;

import attendance_management.domain.support.tool.NewLine;

public enum WorkDayDivision {
      WORKING
    , NON_WORKING
    ;

    private static final String myOneOfNewLine = new NewLine().executed();

    public final String explanation(){
        if( this.name().equals(WorkDayDivision.WORKING.name()) )
            { return
                      "It refers to the state of doing some work."
                    + myOneOfNewLine
                    + "Also includes telework."
            ;}

        if( this.name().equals(WorkDayDivision.NON_WORKING.name()) )
            { return
                      "It means that you are not working all day."
                    + myOneOfNewLine
                    + "Includes weekends and holidays."
            ;}

        else
            { return "The value is not in this division.";}
    }
}