package 社員勤務表.business.adapter.complex_parts;

import 社員勤務表.business.adapter.single_parts.*;
import 社員勤務表.business.service.勤務状況サブ区分インターフェース;
import 社員勤務表.business.tool.勤務状況サブ区分判定;

public class 勤務状況サブ区分アダプター implements 勤務状況サブ区分インターフェース {

    public static final 勤務状況サブ区分インターフェース 稼働   = new 勤務状況サブ区分アダプター(状態区分アダプター.稼働);
    public static final 勤務状況サブ区分インターフェース 非稼働 = new 勤務状況サブ区分アダプター(状態区分アダプター.非稼働);
    public static final 勤務状況サブ区分インターフェース 社外   = new 勤務状況サブ区分アダプター(場所区分アダプター.社外);
    public static final 勤務状況サブ区分インターフェース 社内   = new 勤務状況サブ区分アダプター(場所区分アダプター.社内);
    public static final 勤務状況サブ区分インターフェース 内勤   = new 勤務状況サブ区分アダプター(屋内区分アダプター.内勤);
    public static final 勤務状況サブ区分インターフェース 外勤   = new 勤務状況サブ区分アダプター(屋内区分アダプター.外勤);
    public static final 勤務状況サブ区分インターフェース 海外   = new 勤務状況サブ区分アダプター(特別赴任アダプター.海外);

    private 勤務状況サブ区分インターフェース my勤務状況サブ区分インターフェース;

    public 勤務状況サブ区分アダプター(勤務状況サブ区分インターフェース my勤務状況サブ区分インターフェース){
        this.my勤務状況サブ区分インターフェース = my勤務状況サブ区分インターフェース;
        try {
            if( new 勤務状況サブ区分判定(this.my勤務状況サブ区分インターフェース)
                    .is有効() == false ){
                throw new Exception();
            }
        }
        catch (Exception e){
            System.out.println("設定した値は有効な値ではございません。");
            System.exit(2);
        }
    }

    public final String name()    { return my勤務状況サブ区分インターフェース.name(); }
    public final String 区分名()   { return my勤務状況サブ区分インターフェース.区分名(); }
    public final String 区分値()   { return "ステータス：" + my勤務状況サブ区分インターフェース.区分値(); }
    public final String 補足説明()  { return my勤務状況サブ区分インターフェース.補足説明();}
}