package 社員勤務表.domain.tool;

import 社員勤務表.domain.tool.parts.オブジェクト有効判定;
import 社員勤務表.domain.model.勤務区分;

public class 勤務区分判定 {

    private 勤務区分 my勤務区分;

    public 勤務区分判定(勤務区分 my勤務区分){ this.my勤務区分 = my勤務区分; }

    public Boolean is有効(){
        return new オブジェクト有効判定(my勤務区分).is有効();
    }

}