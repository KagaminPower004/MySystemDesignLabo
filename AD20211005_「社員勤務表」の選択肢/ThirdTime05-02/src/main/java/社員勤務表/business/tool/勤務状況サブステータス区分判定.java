package 社員勤務表.business.tool;

import 社員勤務表.business.tool.parts.オブジェクト有効判定;
import 社員勤務表.domain.model.composit.勤務状況サブステータス区分;

public class 勤務状況サブステータス区分判定 {

    private 勤務状況サブステータス区分 my勤務状況サブステータス区分;

    public 勤務状況サブステータス区分判定(勤務状況サブステータス区分 my勤務状況サブステータス区分){
        this.my勤務状況サブステータス区分 = my勤務状況サブステータス区分;
    }
    public Boolean is有効(){
        return new オブジェクト有効判定(my勤務状況サブステータス区分).is有効();
    }
}