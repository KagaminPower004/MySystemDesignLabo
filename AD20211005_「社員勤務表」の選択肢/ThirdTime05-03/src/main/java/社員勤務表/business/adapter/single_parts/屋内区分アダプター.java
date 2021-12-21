package 社員勤務表.business.adapter.single_parts;

import 社員勤務表.business.tool.NewLine;
import 社員勤務表.business.tool.屋内区分判定;
import 社員勤務表.business.service.勤務状況サブ区分インターフェース;
import 社員勤務表.domain.model.屋内区分;

public class 屋内区分アダプター implements 勤務状況サブ区分インターフェース {

    public static final 勤務状況サブ区分インターフェース 外勤 = new 屋内区分アダプター(屋内区分.外勤);
    public static final 勤務状況サブ区分インターフェース 内勤 = new 屋内区分アダプター(屋内区分.内勤);

    private 屋内区分 my屋内区分;

    public 屋内区分アダプター(屋内区分 my屋内区分) { this.my屋内区分 = my屋内区分; }

    public final String 区分名(){
        if( new 屋内区分判定(my屋内区分).is有効() ){ return my屋内区分.getClass().getSimpleName(); }
        else                                  { return "該当する値がございません"; }
    }

    public final String name(){ return my屋内区分.name();}

    public final String 区分値(){
        if( new 屋内区分判定(my屋内区分).is有効() ){
            final String message01 = " ※";
            final String tailMessage = message01;

            if( is内勤() ) { return my屋内区分.name() + tailMessage; }
            else          { return my屋内区分.name(); }
        }
        else                                  { return "該当する値がございません"; }
    }

    public final String 補足説明(){
        if( new 屋内区分判定(my屋内区分).is有効() ){
            final String message01 = NewLine.hiSpeedExecuted();
            final String message02 = "      (※総務部より：経理部の山田花子さん、福島正紀さん、ご結婚おめでとうございます！！)";
            final String tailMessage = message01 + message02;

            if( is内勤() ) { return my屋内区分.詳細説明() + tailMessage; }
            else          { return my屋内区分.詳細説明(); }
        }
        else { return "該当する値がございません"; }
    }

    private Boolean is内勤(){ return my屋内区分.name() == 屋内区分.内勤.name(); }
}