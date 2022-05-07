package roster.domain.model;

public enum TypeDivision {
      INDOOR
    , OUTDOOR
    ;

    public final String detailDescription(){
        if( this.name().equals(TypeDivision.INDOOR.name()) )
            { return
                "It mainly refers to the state of working in a building" +
                        " by doing work styles that correspond to desk work."
            ;}

        if(this.name().equals(TypeDivision.OUTDOOR.name()))
            { return
                    "It refers to the state where most of the working hours work outside the building" +
                            ", such as outside sales." +
                            " Therefore, telework is not included."
            ;}

        else
            { return "The value is not in this division.";}
    }
}