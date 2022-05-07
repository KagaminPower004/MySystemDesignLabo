package roster.domain.anticorruption.workdivision;

import roster.domain.model.WorkDivision;
import roster.domain.support.WorkDivisionCheck;

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
        if( new WorkDivisionCheck(myWorkDivision).isNotAvailable() ){
            throw new RuntimeException( "This Object is not available." );
        }
    }

}