package roster.domain.anticorruption.adapter;

import roster.domain.anticorruption.service.WorkSubStatusInterface;
import roster.domain.anticorruption.translator.WorkSubStatusDescriptionTranslator;
import roster.domain.model.LocationDivision;
import roster.domain.model.屋内区分;
import roster.domain.model.状態区分;

public enum WorkSubStatusAdapter implements WorkSubStatusInterface {
     INSIDE   ( LocationDivision.INSIDE)
    ,OUTSIDE   ( LocationDivision.OUTSIDE)
    ,稼働   ( 状態区分.稼働  )
    ,非稼働 ( 状態区分.非稼働 )
    ,内勤   ( 屋内区分.内勤  )
    ,外勤   ( 屋内区分.外勤  )
    ,国外
    ;

    private WorkSubStatusInterface my勤務状況サブステータス区分;
    private LocationDivision my場所区分;
    private 屋内区分 my屋内区分;
    private 状態区分 my状態区分;

    //コンストラクターらっしゅ！！
    WorkSubStatusAdapter(){  }
    WorkSubStatusAdapter(LocationDivision my場所区分 ){ this.my場所区分 = my場所区分; }
    WorkSubStatusAdapter(屋内区分 my屋内区分 ){ this.my屋内区分 = my屋内区分; }
    WorkSubStatusAdapter(状態区分 my状態区分 ){ this.my状態区分 = my状態区分; }

    //補足説明めそっど
    public final String description(){

        //『トランスレーター』へ変換を依頼
        return new
                WorkSubStatusDescriptionTranslator(this)
                .translated();
    }
}
