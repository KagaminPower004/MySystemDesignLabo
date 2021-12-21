package 社員勤務表.business.adapter;

import 社員勤務表.business.service.勤務区分インターフェース;
import 社員勤務表.domain.model.勤務区分;

public enum 勤務区分アダプター implements 勤務区分インターフェース {
    フル出勤 ( 勤務区分.フル出勤  )
    ;

    private 勤務区分 my勤務区分;
    private static 勤務区分 myStatic勤務区分;

    勤務区分アダプター( 勤務区分 my勤務区分 ){
        this.my勤務区分 = my勤務区分;
        aaa();
    }
    private void  aaa(){
        myStatic勤務区分 = this.my勤務区分;
    }
}