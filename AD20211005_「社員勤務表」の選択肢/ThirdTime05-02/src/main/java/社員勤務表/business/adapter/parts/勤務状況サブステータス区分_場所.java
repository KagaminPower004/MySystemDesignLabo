package 社員勤務表.business.adapter.parts;

import 社員勤務表.business.tool.NewLine;
import 社員勤務表.business.tool.場所区分判定;
import 社員勤務表.business.service.勤務状況サブステータス区分インターフェース;
import 社員勤務表.domain.model.場所区分;

public class 勤務状況サブステータス区分_場所 implements 勤務状況サブステータス区分インターフェース {

    private 場所区分 my場所区分;

    public 勤務状況サブステータス区分_場所(場所区分 my場所区分){
        this.my場所区分 = my場所区分;
    }

    public final String チェック値(){ return my場所区分.name();}

    public final String 区分名(){
        if( new 場所区分判定(my場所区分).is有効() ){ return my場所区分.getClass().getSimpleName(); }
        else                                  { return "該当する値がございません"; }
    }

    public final String 区分値(){
        if( new 場所区分判定(my場所区分).is有効() ){ return my場所区分.name(); }
        else                                  { return "該当する値がございません"; }
    }

    public final String 補足説明(){
        if( new 場所区分判定(my場所区分).is有効() ){ return my場所区分.詳細説明()
                + NewLine.hiSpeedExecuted()
                + "      (※小須田部長（こすだぶちょう）を除く)"; }
        else                                  { return "該当する値がございません"; }
    }
}