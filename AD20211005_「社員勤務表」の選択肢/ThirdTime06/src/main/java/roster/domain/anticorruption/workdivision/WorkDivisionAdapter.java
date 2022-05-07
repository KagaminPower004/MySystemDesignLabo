package roster.domain.anticorruption.workdivision;

import roster.domain.model.WorkDivision;
import roster.domain.support.WorkDivisionCheck;

enum WorkDivisionAdapter implements WorkDivisionInterface {
      FULL_TIME_WORK     ( WorkDivision.FULL_TIME_WORK)
    , AFTERNOON_WORK     ( WorkDivision.AFTERNOON_WORK )
    , MORNING_WORK       ( WorkDivision.MORNING_WORK )
    , WEEKLY_HOLIDAY     ( WorkDivision.WEEKLY_HOLIDAY )
    , HOLIDAY            ( WorkDivision.HOLIDAY )
    , ABSENCE            ( WorkDivision.ABSENCE )
    ;

    WorkDivisionAdapter(final WorkDivision myWorkDivision){
        //区分値チェック
        if( new WorkDivisionCheck(myWorkDivision).isNotAvailable() ){
            throw new RuntimeException( "This Object is not available." );
        }
    }

}