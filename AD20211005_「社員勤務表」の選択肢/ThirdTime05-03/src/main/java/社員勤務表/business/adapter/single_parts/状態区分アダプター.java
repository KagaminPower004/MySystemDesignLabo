package 社員勤務表.business.adapter.single_parts;

import 社員勤務表.business.tool.状態区分判定;
import 社員勤務表.business.service.勤務状況サブ区分インターフェース;
import 社員勤務表.domain.model.状態区分;

public class 状態区分アダプター implements 勤務状況サブ区分インターフェース {

    public static final 勤務状況サブ区分インターフェース 稼働   = new 状態区分アダプター(状態区分.稼働);
    public static final 勤務状況サブ区分インターフェース 非稼働 = new 状態区分アダプター(状態区分.非稼働);

    private 状態区分 my状態区分;

    public 状態区分アダプター(状態区分 my状態区分){
        this.my状態区分 = my状態区分;
    }

    public final String name(){ return my状態区分.name();}

    public final String 区分名(){
        if( new 状態区分判定(my状態区分).is有効() ){ return my状態区分.getClass().getSimpleName(); }
        else                                  { return "該当する値がございません"; }
    }

    public final String 区分値(){
        if( new 状態区分判定(my状態区分).is有効() ){ return my状態区分.name(); }
        else                                  { return "該当する値がございません"; }
    }

    public final String 補足説明(){
        if( new 状態区分判定(my状態区分).is有効() ){ return my状態区分.補足説明(); }
        else                                  { return "該当する値がございません"; }
    }
}