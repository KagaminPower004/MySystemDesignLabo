package 社員勤務表.business.adapter;

import 社員勤務表.business.service.勤務区分インターフェース;
import 社員勤務表.business.tool.勤務区分判定;
import 社員勤務表.domain.model.勤務区分;

public class 勤務区分アダプター implements 勤務区分インターフェース {

    private 勤務区分 my勤務区分;

    public 勤務区分アダプター(勤務区分 my勤務区分){
        this.my勤務区分 = my勤務区分;
    }

    public final String name(){
        if( new 勤務区分判定(my勤務区分).is有効() ){ return my勤務区分.name(); }
        else{ return "該当する値がございません"; }
    }
}