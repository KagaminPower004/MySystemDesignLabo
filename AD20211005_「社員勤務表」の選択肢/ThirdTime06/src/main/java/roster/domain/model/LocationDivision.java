package roster.domain.model;

public enum LocationDivision {
      OUTSIDE
    , INSIDE
    ;

    public final String comments(){
        if(this.name().equals(LocationDivision.OUTSIDE.name())){ return "社内以外の場所での働き方を行い、一日のうちなんらかの仕事をした状態を指します。";}
        if(this.name().equals(LocationDivision.INSIDE.name())) { return "一日のうちなんらかの仕事をした状態を指します。ただし、テレワークは含みません。";}
        else                                                   { return "その値は場所区分にはございません。";}
    }
}