package 社員勤務表.domain.tool;

import 社員勤務表.domain.tool.parts.オブジェクト有効判定;
import 社員勤務表.domain.model.場所区分;

public class 場所区分判定 {

    private 場所区分 my場所区分;

    public 場所区分判定(場所区分 my場所区分){ this.my場所区分 = my場所区分; }

    public Boolean is有効(){
          return new オブジェクト有効判定(my場所区分).is有効();
    }
}