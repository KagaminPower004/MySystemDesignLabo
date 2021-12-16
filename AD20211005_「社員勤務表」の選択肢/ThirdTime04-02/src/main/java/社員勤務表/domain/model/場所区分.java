package 社員勤務表.domain.model;

public enum 場所区分 {
     社外
    ,社内
    ;

    public final String 詳細説明(){
        if(this.name().equals(場所区分.社外.name())){ return "社内以外の場所での働き方を行い、一日のうちなんらかの仕事をした状態を指します。";}
        if(this.name().equals(場所区分.社内.name())){ return "一日のうちなんらかの仕事をした状態を指します。ただし、テレワークは含みません。";}
        else                                      { return "その値は場所区分にはございません。";}
    }
}