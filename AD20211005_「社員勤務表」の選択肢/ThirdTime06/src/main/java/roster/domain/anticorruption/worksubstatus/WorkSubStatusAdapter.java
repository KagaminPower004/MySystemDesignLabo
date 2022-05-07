package roster.domain.anticorruption.worksubstatus;

import roster.domain.model.officedivision.Check_OfficeDivision;
import roster.domain.model.officedivision.OfficeDivision;
import roster.domain.model.typedivision.Check_TypeDivision;
import roster.domain.model.typedivision.TypeDivision;
import roster.domain.model.daydivision.Check_DayDivision;
import roster.domain.model.daydivision.DayDivision;

enum WorkSubStatusAdapter implements WorkSubStatusInterface {
      INSIDE      ( OfficeDivision.INSIDE )
    , OUTSIDE     ( OfficeDivision.OUTSIDE )
    , WORKING     ( DayDivision.WORKING )
    , NON_WORKING ( DayDivision.NON_WORKING )
    , INDOOR      ( TypeDivision.INDOOR )
    , OUTDOOR     ( TypeDivision.OUTDOOR )
    , NON_DOMESTIC
    ;

    //コンストラクターらっしゅ！！
    WorkSubStatusAdapter(){  }

    WorkSubStatusAdapter(OfficeDivision myOfficeDivision )
        {
            //区分値チェック
            if( new Check_OfficeDivision(myOfficeDivision).isNotEnabled() ){
                throw new RuntimeException( "This Object is not enabled." );
            }
        }

    WorkSubStatusAdapter(TypeDivision   myTypeDivision )
        {
            //区分値チェック
            if( new Check_TypeDivision(myTypeDivision).isNotEnabled() ){
                throw new RuntimeException( "This Object is not enabled." );
            }
        }

    WorkSubStatusAdapter(DayDivision    myDayDivision )
        {
            //区分値チェック
            if( new Check_DayDivision(myDayDivision).isNotEnabled() ){
                throw new RuntimeException( "This Object is not enabled." );
            }
        }

    //補足説明めそっど
    public final String description(){

        //まとりょーしか!!
        //   『トランスレーター』へ変換を依頼
        return new
                WorkSubStatusTranslator(this)
                .description();
    }
}
