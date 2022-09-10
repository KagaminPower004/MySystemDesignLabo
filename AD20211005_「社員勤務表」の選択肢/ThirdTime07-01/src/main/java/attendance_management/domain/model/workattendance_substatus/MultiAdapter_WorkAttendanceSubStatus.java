package attendance_management.domain.model.workattendance_substatus;

import attendance_management.domain.model.workday_division.WorkDayDivision;
import attendance_management.domain.model.workoffice_division.WorkOfficeDivision;
import attendance_management.domain.model.worktype_division.WorkTypeDivision;

enum MultiAdapter_WorkAttendanceSubStatus implements Interface_WorkAttendanceSubStatus {
      INSIDE      ( WorkOfficeDivision.INSIDE )
    , OUTSIDE     ( WorkOfficeDivision.OUTSIDE )
    , WORKING     ( WorkDayDivision.WORKING )
    , NON_WORKING ( WorkDayDivision.NON_WORKING )
    , INDOOR      ( WorkTypeDivision.INDOOR )
    , OUTDOOR     ( WorkTypeDivision.OUTDOOR )
    , NON_DOMESTIC
    ;

    //コンストラクターらっしゅ！！
    MultiAdapter_WorkAttendanceSubStatus() {  }

    MultiAdapter_WorkAttendanceSubStatus(final Object myWorkAttendanceSubStatus )
    {
        //区分値チェック
        if( ! new Check_ElementsOfWorkAttendanceSubStatus( myWorkAttendanceSubStatus ).isOK() ){
            throw new RuntimeException( "This Object is not enabled." );
        }
    }

    //補足説明めそっど:『トランスレーター』へ変換を依頼
    public final String description() { return createTranslator().description(); }
    //※単品ファクトリーww
    private Translator_WorkAttendanceSubStatus createTranslator()
        { return new Translator_WorkAttendanceSubStatus(this); }
}