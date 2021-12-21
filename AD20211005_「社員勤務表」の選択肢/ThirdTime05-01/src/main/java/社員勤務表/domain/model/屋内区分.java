package 社員勤務表.domain.model;

public enum 屋内区分 {
     内勤
    ,外勤
    ;

    public final String 詳細説明(){
        if(this.name().equals(屋内区分.内勤.name())){ return "主にデスクワークに該当する働き方を行い、建物内での仕事をする状態を指します。";}
        if(this.name().equals(屋内区分.外勤.name())){ return "外回りの営業など、勤務時間の大半が建物外での仕事をする状態を指します。そのため、テレワークは含みません。";}
        else                                      { return "その値は屋内区分にはございません。";}
    }
}