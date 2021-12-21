package 社員勤務表.business.service;

import 社員勤務表.business.adapter.complex_parts.勤務状況サブ区分アダプター;
import 社員勤務表.business.tool.NewLine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 勤務状況サブ区分補足説明サービス {

    private String my勤務状況 = "" ;
    private List<勤務状況サブ区分インターフェース> my勤務状況サブステータス区分list = new ArrayList<>();

    public 勤務状況サブ区分補足説明サービス(String my勤務状況){
        勤務状況判定サービス my勤務状況判定 = new 勤務状況判定サービス(my勤務状況);

        if(my勤務状況判定.is非該当()) { System.out.println("その値は勤務状況には存在しません"); System.exit(1); }
        else                      { this.my勤務状況 = my勤務状況; }
    }

    public List<勤務状況サブ区分インターフェース> 勤務状況サブステータス区分List(){
        勤務状況判定サービス my勤務状況判定 = new 勤務状況判定サービス(my勤務状況);

        if(my勤務状況判定.isテレワーク())  { return テレワーク設定(); }
        if(my勤務状況判定.is出社())       { return 出社設定(); }
        if(my勤務状況判定.is非出社())     { return 非出社設定(); }
        else                           { my勤務状況サブステータス区分list.clear(); }

        return  Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }

    public final String 問合せ回答(){
        my勤務状況サブステータス区分list = this.勤務状況サブステータス区分List();

        final String _result01     = "『勤務状況』が" + my勤務状況 + "の場合、該当する『勤務状況サブ区分』の補足説明は"
                + NewLine.hiSpeedExecuted()
                ;
        final String _result02work = my勤務状況サブステータス区分list
                .stream()
                    .map( list要素 ->
                              " ●" + list要素.区分値()
                            + NewLine.hiSpeedExecuted()
                            + "    ⇒" + list要素.補足説明()
                            + NewLine.hiSpeedExecuted()
                    )
                    .collect(Collectors.toList())
                    .toString()
                ;
        final String _result02     = _result02work
                .replace("["," ")
                .replace("]","")
                .replace(",",NewLine.hiSpeedExecuted());
                ;
        final String _result03     = NewLine.hiSpeedExecuted()
                + "です。"
                ;

        final String _result = _result01 + _result02 + _result03;
        return _result;
    }

    private List<勤務状況サブ区分インターフェース> テレワーク設定(){
        my勤務状況サブステータス区分list.add( 勤務状況サブ区分アダプター.稼働 );
        my勤務状況サブステータス区分list.add( 勤務状況サブ区分アダプター.社外);
        my勤務状況サブステータス区分list.add( 勤務状況サブ区分アダプター.内勤 );
        my勤務状況サブステータス区分list.add(勤務状況サブ区分アダプター.稼働);
        my勤務状況サブステータス区分list.add(勤務状況サブ区分アダプター.海外);

        return Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }
    private List<勤務状況サブ区分インターフェース> 出社設定() {
        my勤務状況サブステータス区分list.add( 勤務状況サブ区分アダプター.稼働 );
        my勤務状況サブステータス区分list.add( 勤務状況サブ区分アダプター.社内);
        my勤務状況サブステータス区分list.add( 勤務状況サブ区分アダプター.社外);
        my勤務状況サブステータス区分list.add( 勤務状況サブ区分アダプター.内勤 );
        my勤務状況サブステータス区分list.add( 勤務状況サブ区分アダプター.外勤 );

        return Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }
    private List<勤務状況サブ区分インターフェース> 非出社設定() {
        my勤務状況サブステータス区分list.add( 勤務状況サブ区分アダプター.非稼働);

        return Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }
}