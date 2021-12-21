package 社員勤務表.domain.tool;

import 社員勤務表.domain.model.composit.勤務状況サブステータス区分;
import 社員勤務表.domain.model.composit.勤務状況サブステータス区分インターフェース;

// ※作成中
public class 勤務状況サブステータス区分エラー判定 {

    private 勤務状況サブステータス区分              my勤務状況サブステータス区分;
    private 勤務状況サブステータス区分インターフェース my勤務状況サブステータス区分インターフェース;

    public 勤務状況サブステータス区分エラー判定(勤務状況サブステータス区分インターフェース my勤務状況サブステータス区分インターフェース){
        this.my勤務状況サブステータス区分インターフェース = my勤務状況サブステータス区分インターフェース;
    }

    public Boolean isチェック値チェック(){
        try
        {
            final String チェック値 = my勤務状況サブステータス区分インターフェース.チェック値();
            勤務状況サブステータス区分.valueOf(チェック値);

            return false;
        }
        catch (Exception e){

//            final 勤務状況サブステータス区分 this区分  = new 勤務状況サブステータス区分(my勤務状況サブステータス区分インターフェース);
            final String 区分名                   = my勤務状況サブステータス区分インターフェース.区分名();
            final String 区分値                   = my勤務状況サブステータス区分インターフェース.区分値();
            final String チェック値                = my勤務状況サブステータス区分インターフェース.チェック値();

            System.out.println("区分値の整合性が取れておりません。");
//            System.out.println("サブステータス側：" + this区分.区分名() + "(" + this区分.チェック値() + ")" );
            System.out.println(区分名 + "側："     + 区分値           + "(" + チェック値 + ")" ) ;
            return true;
        }
    }
}