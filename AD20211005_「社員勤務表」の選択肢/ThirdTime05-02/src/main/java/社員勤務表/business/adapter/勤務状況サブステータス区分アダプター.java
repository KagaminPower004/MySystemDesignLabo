package 社員勤務表.business.adapter;

import 社員勤務表.business.service.勤務状況サブステータス区分インターフェース;
import 社員勤務表.business.adapter.parts.勤務状況サブステータス区分_特別赴任;
import 社員勤務表.business.tool.勤務状況サブステータス区分判定;
import 社員勤務表.domain.model.composit.勤務状況サブステータス区分;

public class 勤務状況サブステータス区分アダプター implements 勤務状況サブステータス区分インターフェース {

    public static final 勤務状況サブステータス区分インターフェース 稼働 = new 勤務状況サブステータス区分アダプター(勤務状況サブステータス区分.稼働);
    public static final 勤務状況サブステータス区分インターフェース 非稼働 = new 勤務状況サブステータス区分アダプター(勤務状況サブステータス区分.非稼働);
    public static final 勤務状況サブステータス区分インターフェース 社外 = new 勤務状況サブステータス区分アダプター(勤務状況サブステータス区分.社外);
    public static final 勤務状況サブステータス区分インターフェース 社内 = new 勤務状況サブステータス区分アダプター(勤務状況サブステータス区分.社内);
    public static final 勤務状況サブステータス区分インターフェース 内勤 = new 勤務状況サブステータス区分アダプター(勤務状況サブステータス区分.内勤);
    public static final 勤務状況サブステータス区分インターフェース 外勤 = new 勤務状況サブステータス区分アダプター(勤務状況サブステータス区分.外勤);
    public static final 勤務状況サブステータス区分インターフェース 海外 = new 勤務状況サブステータス区分_特別赴任();

    private 勤務状況サブステータス区分              my勤務状況サブステータス区分;

    public 勤務状況サブステータス区分アダプター(勤務状況サブステータス区分 my勤務状況サブステータス区分){
        this.my勤務状況サブステータス区分 = my勤務状況サブステータス区分;
        try {
            if( new 勤務状況サブステータス区分判定(my勤務状況サブステータス区分).is有効() == false ){ throw new Exception(); }
        }
        catch (Exception e){
            System.out.println("設定した値は有効な値ではございません。");
            System.exit(2);
        }
    }

    public final String チェック値() { return my勤務状況サブステータス区分.チェック値(); }
    public final String 区分名()    { return my勤務状況サブステータス区分.区分名(); }
    public final String 区分値()    { return my勤務状況サブステータス区分.区分値(); }
    public final String 補足説明()  { return my勤務状況サブステータス区分.補足説明();}
}