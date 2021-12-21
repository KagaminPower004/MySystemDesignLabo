package 社員勤務表.business.tool;

import 社員勤務表.business.service.勤務状況サブ区分インターフェース;
import 社員勤務表.business.tool.parts.オブジェクト有効判定;

public class 勤務状況サブ区分判定 {

    private 勤務状況サブ区分インターフェース my勤務状況サブ区分インターフェース;

    public 勤務状況サブ区分判定(勤務状況サブ区分インターフェース my勤務状況サブ区分インターフェース){
        this.my勤務状況サブ区分インターフェース = my勤務状況サブ区分インターフェース;
    }
    public Boolean is有効(){
        return new オブジェクト有効判定(my勤務状況サブ区分インターフェース).is有効();
    }
}