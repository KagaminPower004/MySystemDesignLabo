package 社員勤務表.business.service;

import 社員勤務表.business.adapter.勤務状況サブステータス区分アダプター;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 勤務状況サブステータス区分補足説明サービス {

    private String my勤務状況 = "" ;
    private List<勤務状況サブステータス区分インターフェース> my勤務状況サブステータス区分list
            = new ArrayList<>();

    public 勤務状況サブステータス区分補足説明サービス(String my勤務状況){
        勤務状況判定サービス my勤務状況判定 = new 勤務状況判定サービス(my勤務状況);

        if(my勤務状況判定.is非該当()){ System.out.println("その値は勤務状況には存在しません"); }
        else{ this.my勤務状況 = my勤務状況; }
    }

    public List<勤務状況サブステータス区分インターフェース> 勤務状況サブステータス区分List(){
        勤務状況判定サービス my勤務状況判定 = new 勤務状況判定サービス(my勤務状況);

        if(my勤務状況判定.isテレワーク())  { return テレワーク設定(); }
        if(my勤務状況判定.is出社())       { return 出社設定(); }
        if(my勤務状況判定.is非出社())     { return 非出社設定(); }
        else                           { my勤務状況サブステータス区分list.clear(); }

        return  Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }

    private List<勤務状況サブステータス区分インターフェース> テレワーク設定(){
        my勤務状況サブステータス区分list.add( 勤務状況サブステータス区分アダプター.稼働 );
        my勤務状況サブステータス区分list.add( 勤務状況サブステータス区分アダプター.社外 );
        my勤務状況サブステータス区分list.add( 勤務状況サブステータス区分アダプター.内勤 );

        return Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }
    private List<勤務状況サブステータス区分インターフェース> 出社設定() {
        my勤務状況サブステータス区分list.add( 勤務状況サブステータス区分アダプター.稼働 );
        my勤務状況サブステータス区分list.add( 勤務状況サブステータス区分アダプター.社内);
        my勤務状況サブステータス区分list.add( 勤務状況サブステータス区分アダプター.社外 );
        my勤務状況サブステータス区分list.add( 勤務状況サブステータス区分アダプター.内勤 );
        my勤務状況サブステータス区分list.add( 勤務状況サブステータス区分アダプター.外勤 );

        return Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }
    private List<勤務状況サブステータス区分インターフェース> 非出社設定() {
        my勤務状況サブステータス区分list.add( 勤務状況サブステータス区分アダプター.非稼働 );

        return Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }
}