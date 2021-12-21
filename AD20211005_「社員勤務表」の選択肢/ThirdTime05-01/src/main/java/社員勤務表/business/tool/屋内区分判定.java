package 社員勤務表.business.tool;

import 社員勤務表.business.tool.parts.オブジェクト有効判定;
import 社員勤務表.domain.model.屋内区分;

public class 屋内区分判定 {

    private 屋内区分 my屋内区分;

    public 屋内区分判定(屋内区分 my屋内区分){ this.my屋内区分 = my屋内区分; }

    public Boolean is有効(){
        return new オブジェクト有効判定(my屋内区分).is有効();
    }
}