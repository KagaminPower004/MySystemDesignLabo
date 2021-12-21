package 社員勤務表.domain.tool;

import 社員勤務表.domain.tool.parts.オブジェクト有効判定;
import 社員勤務表.domain.model.状態区分;

public class 状態区分判定 {

    private 状態区分 my状態区分;

    public 状態区分判定(状態区分 my状態区分){ this.my状態区分 = my状態区分; }

    public Boolean is有効(){
        return new オブジェクト有効判定(my状態区分).is有効();
    }
}