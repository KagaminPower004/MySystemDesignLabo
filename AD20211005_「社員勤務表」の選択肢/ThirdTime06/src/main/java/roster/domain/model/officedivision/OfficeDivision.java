package roster.domain.model.officedivision;

public enum OfficeDivision {
      OUTSIDE
    , INSIDE
    ;

    public final String comments(){
        if( this.name().equals(OfficeDivision.OUTSIDE.name()) )
            { return
                    "It refers to the state of working outside the company."
            ;}

        if( this.name().equals(OfficeDivision.INSIDE.name()) )
            { return
                      "It refers to the state of working inside the company."
                    + " However, telework is not included."
            ;}

        else
            { return "The value is not in this division.";}
    }
}