package 社員勤務表.domain.model.composit;

import 社員勤務表.domain.tool.NewLine;
import 社員勤務表.domain.model.*;
import 社員勤務表.domain.model.composit.parts.*;
import 社員勤務表.domain.tool.勤務状況サブステータス区分エラー判定;

public enum 勤務状況サブステータス区分 implements 勤務状況サブステータス区分インターフェース {
     社内   ( new 勤務状況サブステータス区分_場所( 場所区分.社内 ) )
    ,社外   ( new 勤務状況サブステータス区分_場所( 場所区分.社外)  )
    ,稼働   ( new 勤務状況サブステータス区分_状態( 状態区分.稼働 ) )
    ,非稼働 ( new 勤務状況サブステータス区分_状態( 状態区分.非稼働) )
    ,内勤   ( new 勤務状況サブステータス区分_屋内( 屋内区分.内勤 ) )
    ,外勤   ( new 勤務状況サブステータス区分_屋内( 屋内区分.外勤 ) )
//    ,海外   ( new 勤務状況サブステータス区分_特別赴任( )             )
    ;

    private 勤務状況サブステータス区分インターフェース my勤務状況サブステータス区分インターフェース;

    勤務状況サブステータス区分(勤務状況サブステータス区分インターフェース my勤務状況サブステータス区分インターフェース ){
        this.my勤務状況サブステータス区分インターフェース = my勤務状況サブステータス区分インターフェース;
    }

    public final String チェック値() { return my勤務状況サブステータス区分インターフェース.チェック値(); }
    public final String 区分名()    { return my勤務状況サブステータス区分インターフェース.区分名(); }
    public final String 区分値()    { return "サブステータス：" + my勤務状況サブステータス区分インターフェース.区分値(); }
    public final String 補足説明()  {

        final String 補足説明 = my勤務状況サブステータス区分インターフェース.補足説明();
        final String 区分名   = my勤務状況サブステータス区分インターフェース.区分名();
        final String 区分値   = my勤務状況サブステータス区分インターフェース.区分値();

        final String 補足説明_修正後
                = 補足説明
                + NewLine.hiSpeedExecuted()
                + "      ～「" + 区分名 + ":" + 区分値 + "」より引用(カッコ内は加筆箇所)";

        return 補足説明_修正後;
    }
}