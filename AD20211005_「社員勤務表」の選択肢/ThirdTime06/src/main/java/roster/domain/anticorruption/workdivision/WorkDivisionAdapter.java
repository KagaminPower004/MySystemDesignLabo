package roster.domain.anticorruption.workdivision;

import roster.domain.model.workdivision.WorkDivision;
import roster.domain.model.workdivision.Check_WorkDivision;

//独語にしちゃいました。。。的な^^;
enum WorkDivisionAdapter implements WorkDivisionInterface {
      VOLL_ZEIT_ARBEIT   ( WorkDivision.FULL_TIME_WORK)
    , NACHMITTAG_ARBEIT  ( WorkDivision.AFTERNOON_WORK )
    , MORGEN_ARBEIT      ( WorkDivision.MORNING_WORK )
    , WEEKLY_HOLIDAY     ( WorkDivision.WEEKLY_HOLIDAY )
    , URLAUB             ( WorkDivision.HOLIDAY )
    , ABWESENHEIT        ( WorkDivision.ABSENCE )
    ;

    WorkDivisionAdapter(final WorkDivision myWorkDivision){
        //区分値チェック
        if( new Check_WorkDivision(myWorkDivision).isNotEnabled() ){
            throw new RuntimeException( "This Object is not available." );
        }
    }

}