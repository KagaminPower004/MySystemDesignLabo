package 社員勤務表.business.adapter;

import 社員勤務表.domain.model.勤務区分;

public class 勤務区分アダプター {
    private 勤務区分 my勤務区分;

    public 勤務区分アダプター(勤務区分 my勤務区分){
        this.my勤務区分 = my勤務区分;
    }

    public final String name(){
        return my勤務区分.name();
    }
}