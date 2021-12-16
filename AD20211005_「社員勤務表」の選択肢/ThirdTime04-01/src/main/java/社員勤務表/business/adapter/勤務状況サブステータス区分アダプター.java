package 社員勤務表.business.adapter;

import 社員勤務表.business.tool.*;
import 社員勤務表.business.service.勤務状況サブステータス区分インターフェース;
import 社員勤務表.domain.model.*;

public class 勤務状況サブステータス区分アダプター  implements 勤務状況サブステータス区分インターフェース {
    private 状態区分 my状態区分;
    private 場所区分 my場所区分;
    private 屋内区分 my屋内区分;

    public 勤務状況サブステータス区分アダプター(状態区分 my状態区分){
        this.my状態区分 = my状態区分;
    }
    public 勤務状況サブステータス区分アダプター(場所区分 my場所区分){
        this.my場所区分 = my場所区分;
    }
    public 勤務状況サブステータス区分アダプター(屋内区分 my屋内区分) { this.my屋内区分 = my屋内区分; }

    public final String name(){
        if( new 状態区分判定(my状態区分).is有効() ){ return my状態区分.name(); }
        if( new 場所区分判定(my場所区分).is有効() ){ return my場所区分.name(); }
        if( new 屋内区分判定(my屋内区分).is有効() ){ return my屋内区分.name(); }
        else                                  { return "該当する値がございません"; }
    }

    public final String 補足説明(){
        if( new 状態区分判定(my状態区分).is有効() ){ return my状態区分.補足説明(); }
        if( new 場所区分判定(my場所区分).is有効() ){ return my場所区分.詳細説明(); }
        if( new 屋内区分判定(my屋内区分).is有効() ){ return my屋内区分.詳細説明(); }
        else                                  { return "該当する値がございません"; }
    }
}