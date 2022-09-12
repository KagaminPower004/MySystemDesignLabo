package attendance_management.domain.model.workattendance_substatus;

import attendance_management.domain.model.workday_division.Check_WorkDayDivision;
import attendance_management.domain.model.workday_division.WorkDayDivision;
import attendance_management.domain.model.workoffice_division.Check_WorkOfficeDivision;
import attendance_management.domain.model.workoffice_division.WorkOfficeDivision;
import attendance_management.domain.model.worktype_division.Check_WorkTypeDivision;
import attendance_management.domain.model.worktype_division.WorkTypeDivision;
import attendance_management.domain.support.tool.NewLine;

public enum MultiAdapter_WorkAttendanceSubStatus02 {
    OfficeDivision  ( WorkOfficeDivision.values() ),
    DayDivision     ( WorkDayDivision.values() ),
    TypeDivision    ( WorkTypeDivision.values() ),
    ;

    //コンストラクターらっしゅ！！
    MultiAdapter_WorkAttendanceSubStatus02() {  }

    MultiAdapter_WorkAttendanceSubStatus02(final WorkOfficeDivision[] ListOfWorkOfficeDivision )
        {
            //区分値チェック
            for ( WorkOfficeDivision Element:ListOfWorkOfficeDivision ) {
                //区分値チェック
                if( new Check_WorkOfficeDivision(Element).isNotEnabled() ){
                    throw new RuntimeException( "This Object is not enabled." );
                }
            }
          }

    MultiAdapter_WorkAttendanceSubStatus02(final WorkDayDivision[] ListOfWorkDayDivision )
    {
        //区分値チェック
        for ( WorkDayDivision Element:ListOfWorkDayDivision ) {
            //区分値チェック
            if( new Check_WorkDayDivision(Element).isNotEnabled() ){
                throw new RuntimeException( "This Object is not enabled." );
            }
        }
    }

    MultiAdapter_WorkAttendanceSubStatus02(final WorkTypeDivision[] ListOfWorkTypeDivision )
    {
        //区分値チェック
        for ( WorkTypeDivision Element:ListOfWorkTypeDivision ) {
            //区分値チェック
            if( new Check_WorkTypeDivision(Element).isNotEnabled() ){
                throw new RuntimeException( "This Object is not enabled." );
            }
        }
    }

    public final String names(){
        StringBuilder aaa = new StringBuilder();
        for ( WorkOfficeDivision Element:WorkOfficeDivision.values() ) {
            aaa
               .append( Element.name() )
               .append( new NewLine().executed() );
        }

        return aaa.toString();
    }
}