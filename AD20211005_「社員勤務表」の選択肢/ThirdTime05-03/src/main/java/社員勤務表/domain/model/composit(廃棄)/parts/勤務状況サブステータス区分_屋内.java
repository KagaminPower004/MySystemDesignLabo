package 社員勤務表.domain.model.composit.parts;

import 社員勤務表.domain.model.composit.勤務状況サブステータス区分インターフェース;
import 社員勤務表.domain.tool.NewLine;
import 社員勤務表.domain.tool.屋内区分判定;
import 社員勤務表.domain.model.屋内区分;

public class 勤務状況サブステータス区分_屋内 implements 勤務状況サブステータス区分インターフェース {

    private 屋内区分 my屋内区分;

    public 勤務状況サブステータス区分_屋内(屋内区分 my屋内区分) { this.my屋内区分 = my屋内区分; }

    public final String 区分名(){
        if( new 屋内区分判定(my屋内区分).is有効() ){ return my屋内区分.getClass().getSimpleName(); }
        else                                  { return "該当する値がございません"; }
    }

    public final String チェック値(){ return my屋内区分.name();}

    public final String 区分値(){
        if( new 屋内区分判定(my屋内区分).is有効() ){ return my屋内区分.name(); }
        else                                  { return "該当する値がございません"; }
    }

    public final String 補足説明(){
        if( new 屋内区分判定(my屋内区分).is有効() ){
            if( my屋内区分.name() == 屋内区分.内勤.name()){ return my屋内区分.詳細説明()
                                                                + NewLine.hiSpeedExecuted()
                                                                + "      (※総務部より：経理部の山田花子さん、福島正紀さん、ご結婚おめでとうございます！！)";}
            else                                      { return my屋内区分.詳細説明(); }
        }
        else                                  { return "該当する値がございません"; }
    }
}