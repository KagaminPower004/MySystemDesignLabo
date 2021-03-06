package 社員勤務表.domain.model;

import 社員勤務表.business.service.勤務状況サブステータス区分;

public enum 状態区分 implements 勤務状況サブステータス区分 {
    稼働,
    非稼働;

    public final String 補足説明(){
        if(this.name().equals(状態区分.稼働.name()))  { return "一日のうちなんらかの仕事をした状態を指します。テレワークも含みます";}
        if(this.name().equals(状態区分.非稼働.name())){ return "終日仕事をしていない状態を指します。土日祝日も含みます。";}
        else{ return "その値は状態区分にはございません。";}
    }
}