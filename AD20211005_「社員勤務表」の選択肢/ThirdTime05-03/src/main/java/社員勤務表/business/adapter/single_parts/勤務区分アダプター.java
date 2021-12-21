package 社員勤務表.business.adapter.single_parts;

import 社員勤務表.business.service.勤務区分インターフェース;
import 社員勤務表.business.tool.勤務区分判定;
import 社員勤務表.domain.model.勤務区分;

public class 勤務区分アダプター implements 勤務区分インターフェース {

    public static final 勤務区分インターフェース フル出勤 = new 勤務区分アダプター(勤務区分.フル出勤);
    public static final 勤務区分インターフェース 午前休   = new 勤務区分アダプター(勤務区分.午前休);
    public static final 勤務区分インターフェース 午後休   = new 勤務区分アダプター(勤務区分.午後休);
    public static final 勤務区分インターフェース 週休日   = new 勤務区分アダプター(勤務区分.週休日);
    public static final 勤務区分インターフェース 休暇     = new 勤務区分アダプター(勤務区分.休暇);
    public static final 勤務区分インターフェース 欠勤     = new 勤務区分アダプター(勤務区分.欠勤);

    private 勤務区分 my勤務区分;

    public 勤務区分アダプター(勤務区分 my勤務区分){
        this.my勤務区分 = my勤務区分;
    }

    public final String name(){
        if( new 勤務区分判定(my勤務区分).is有効() ){ return my勤務区分.name(); }
        else{ return "該当する値がございません"; }
    }
}