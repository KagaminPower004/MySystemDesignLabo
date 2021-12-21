package 社員勤務表.domain.model;

public enum 場所区分 {
    社外,
    社内;

    public final String 詳細説明(){
        if(this.name() == 場所区分.社外.name()){ return "テレワークに該当する働き方を行い、一日のうちなんらかの仕事をした状態を指します。";}
        if(this.name() == 場所区分.社内.name()){ return "一日のうちなんらかの仕事をした状態を指します。ただし、テレワークは含みません。";}
        else{ return "その値は場所区分にはございません。";}
    }
}