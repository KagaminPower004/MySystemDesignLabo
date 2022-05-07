package roster.domain.anticorruption.worksubstatus;

import roster.domain.model.OfficeDivision;
import roster.domain.model.TypeDivision;
import roster.domain.model.DayDivision;

enum WorkSubStatusAdapter implements WorkSubStatusInterface {
      INSIDE      ( OfficeDivision.INSIDE )
    , OUTSIDE     ( OfficeDivision.OUTSIDE )
    , WORKING     ( DayDivision.WORKING )
    , NON_WORKING ( DayDivision.NON_WORKING )
    , INDOOR      ( TypeDivision.INDOOR )
    , OUTDOOR     ( TypeDivision.OUTDOOR )
    , NON_DOMESTIC
    ;

    private WorkSubStatusInterface  myWorkSubStatusInterface;
    private OfficeDivision          myOfficeDividion;
    private TypeDivision            myTypeDivision;
    private DayDivision             myDayDivision;

    //コンストラクターらっしゅ！！
    WorkSubStatusAdapter(){  }
    WorkSubStatusAdapter(OfficeDivision myOfficeDividion ){ this.myOfficeDividion = myOfficeDividion; }
    WorkSubStatusAdapter(TypeDivision   myTypeDivision )  { this.myTypeDivision   = myTypeDivision; }
    WorkSubStatusAdapter(DayDivision    myDayDivision )   { this.myDayDivision    = myDayDivision; }

    //補足説明めそっど
    public final String description(){

        //『トランスレーター』へ変換を依頼
        return new
                WorkSubStatusTranslator(this)
                .description();
    }
}
