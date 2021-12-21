package 社員勤務表.business.adapter.single_parts;

import 社員勤務表.business.tool.NewLine;
import 社員勤務表.business.tool.場所区分判定;
import 社員勤務表.business.service.勤務状況サブ区分インターフェース;
import 社員勤務表.domain.model.場所区分;

public class 場所区分アダプター implements 勤務状況サブ区分インターフェース {

    public static final 勤務状況サブ区分インターフェース 社外 = new 場所区分アダプター(場所区分.社外);
    public static final 勤務状況サブ区分インターフェース 社内 = new 場所区分アダプター(場所区分.社内);

    private 場所区分 my場所区分;

    public 場所区分アダプター(場所区分 my場所区分){
        this.my場所区分 = my場所区分;
    }

    public final String name(){ return my場所区分.name();}

    public final String 区分名(){
        if( new 場所区分判定(my場所区分).is有効() ){ return my場所区分.getClass().getSimpleName(); }
        else                                  { return "該当する値がございません"; }
    }

    public final String 区分値(){
        if( new 場所区分判定(my場所区分).is有効() ){ return my場所区分.name() + " ※"; }
        else                                  { return "該当する値がございません"; }
    }

    public final String 補足説明(){
        if( new 場所区分判定(my場所区分).is有効() ){ return my場所区分.詳細説明()
                + NewLine.hiSpeedExecuted()
                + "      (※小須田部長（こすだぶちょう）を除く)"; }
        else                                  { return "該当する値がございません"; }
    }
}