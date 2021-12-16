package 社員勤務表.business.adapter.parts;

import 社員勤務表.business.tool.状態区分判定;
import 社員勤務表.business.service.勤務状況サブステータス区分インターフェース;
import 社員勤務表.domain.model.状態区分;

public class 勤務状況サブステータス区分_状態 implements 勤務状況サブステータス区分インターフェース {
    private 状態区分 my状態区分;

    public 勤務状況サブステータス区分_状態(状態区分 my状態区分){
        this.my状態区分 = my状態区分;
    }

    public final String name(){
        if( new 状態区分判定(my状態区分).is有効() ){ return my状態区分.name(); }
        else{ return "該当する値がございません"; }
    }

    public final String 補足説明(){
        if( new 状態区分判定(my状態区分).is有効() ){ return my状態区分.補足説明(); }
        else{ return "該当する値がございません"; }
    }
}