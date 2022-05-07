package roster.domain.model;

public enum OfficeDivision {
      OUTSIDE
    , INSIDE
    ;

    public final String comments(){
        if( this.name().equals(OfficeDivision.OUTSIDE.name()) )
            { return
                    "It refers to the state of working outside the company" +
                            " and doing some work during the day."
            ;}

        if( this.name().equals(OfficeDivision.INSIDE.name()) )
            { return
                    "It refers to the state of doing some work during the day." +
                            " However, telework is not included."
            ;}

        else
            { return "The value is not in this division.";}
    }
}