package 社員勤務表.business.model;

import 社員勤務表.domain.model.状態区分;
import 社員勤務表.domain.model.場所区分;

public enum 勤務状況サブステータス区分 {
     社外(場所区分.社外),
     社内(場所区分.社内),
    非稼働(状態区分.非稼働);

    private 勤務状況サブステータス区分(場所区分 社外) {
    }

    private 勤務状況サブステータス区分(状態区分 非稼働) {
    }
}