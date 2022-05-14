package attendance_management.domain.anticorruption.workattendance_division;

import attendance_management.domain.model.workattendance_division.WorkAttendanceDivision;
import attendance_management.domain.model.workattendance_division.Check_WorkAttendanceDivision;

//独語にしちゃいました。。。的な^^;
enum Translator_WorkAttendanceDivision implements Interface_WorkAttendanceDivision {
      VOLL_ZEIT_ARBEIT   ( WorkAttendanceDivision.FULL_TIME_WORK)
    , NACHMITTAG_ARBEIT  ( WorkAttendanceDivision.AFTERNOON_WORK )
    , MORGEN_ARBEIT      ( WorkAttendanceDivision.MORNING_WORK )
    , WEEKLY_HOLIDAY     ( WorkAttendanceDivision.WEEKLY_HOLIDAY )
    , URLAUB             ( WorkAttendanceDivision.HOLIDAY )
    , ABWESENHEIT        ( WorkAttendanceDivision.ABSENCE )
    ;

    Translator_WorkAttendanceDivision(final WorkAttendanceDivision myWorkAttendanceDivision){
        //区分値チェック
        if( new Check_WorkAttendanceDivision(myWorkAttendanceDivision).isNotEnabled() ){
            throw new RuntimeException( "This Object is not enabled." );
        }
    }

}