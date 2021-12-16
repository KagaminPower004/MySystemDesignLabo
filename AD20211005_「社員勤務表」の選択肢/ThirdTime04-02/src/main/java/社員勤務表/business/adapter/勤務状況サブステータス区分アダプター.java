package 社員勤務表.business.adapter;

import 社員勤務表.business.service.勤務状況サブステータス区分;
import 社員勤務表.domain.model.場所区分;
import 社員勤務表.domain.model.屋内区分;
import 社員勤務表.domain.model.状態区分;

public enum 勤務状況サブステータス区分アダプター implements 勤務状況サブステータス区分 {
     社内   ( 場所区分.社内  )
    ,社外   ( 場所区分.社外  )
    ,稼働   ( 状態区分.稼働  )
    ,非稼働 ( 状態区分.非稼働 )
    ,内勤   ( 屋内区分.内勤  )
    ,外勤   ( 屋内区分.外勤  )
    ;

    private 勤務状況サブステータス区分 my勤務状況サブステータス区分;
    private 場所区分 my場所区分;
    private 屋内区分 my屋内区分;
    private 状態区分 my状態区分;

    勤務状況サブステータス区分アダプター(場所区分 my場所区分 ){
        this.my場所区分 = my場所区分;
    }
    勤務状況サブステータス区分アダプター(屋内区分 my屋内区分 ){
        this.my屋内区分 = my屋内区分;
    }
    勤務状況サブステータス区分アダプター(状態区分 my状態区分 ){
        this.my状態区分 = my状態区分;
    }

    public final String 補足説明(){ return my勤務状況サブステータス区分.補足説明(); }
}
