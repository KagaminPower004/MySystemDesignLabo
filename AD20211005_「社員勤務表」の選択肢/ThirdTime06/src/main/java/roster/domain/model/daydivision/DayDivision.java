package roster.domain.model.daydivision;

public enum DayDivision {
      WORKING
    , NON_WORKING
    ;

    public final String explanation(){
        if( this.name().equals(DayDivision.WORKING.name()) )
            { return
                      "It refers to the state of doing some work during the day."
                    + " Also includes telework."
            ;}

        if( this.name().equals(DayDivision.NON_WORKING.name()) )
            { return
                      "It means that you are not working all day."
                    + "Includes weekends and holidays."
            ;}

        else
            { return "The value is not in this division.";}
    }
}