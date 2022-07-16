package attendance_management.domain.model.workattendance_substatus;

import attendance_management.domain.model.workstyle_division.Judge_WorkStyleDivision;
import attendance_management.domain.model.workstyle_division.WorkStyleDivision;

import java.util.List;

public class Creation_ListOfWorkAttendanceSubStatusByWorkStyle {

    private final String myWorkStyle;
    private final Interface_Creation_ListOfWorkAttendanceSubStatus myCreation_ListOfWorkAttendanceSubStatus;

    public Creation_ListOfWorkAttendanceSubStatusByWorkStyle
        (
                final String myWorkStyle
              , final Interface_Creation_ListOfWorkAttendanceSubStatus myCreation_ListOfWorkAttendanceSubStatus
        )
            {
                //引数チェック
                final Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);
                if(myJudgedWorkStyle.isNG()){ throw new RuntimeException( "This value does not exist." ); }

                //フィールドセット
                this.myWorkStyle               = myWorkStyle;
                this.myCreation_ListOfWorkAttendanceSubStatus = myCreation_ListOfWorkAttendanceSubStatus;
            }

    public final List<Interface_WorkAttendanceSubStatus> create()

    {
        Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);

        //※switchによりワークスタイル全網羅
        WorkStyleDivision myWorkStyleDivision = WorkStyleDivision.valueOf(myWorkStyle);
        switch (myWorkStyleDivision){
            case TELEWORK ->
                {
                    if(myJudgedWorkStyle.isTelework())
                        { return myCreation_ListOfWorkAttendanceSubStatus.teleworkSettings(); }
                }
            case PHYSICAL_WORK ->
                 {
                     if(myJudgedWorkStyle.isPhysical_Work())
                        { return myCreation_ListOfWorkAttendanceSubStatus.physical_workSettings(); }
                 }
            case NON_WORK ->
                    {
                        if(myJudgedWorkStyle.isNon_Work())
                        { return myCreation_ListOfWorkAttendanceSubStatus.non_workSettings(); }
                    }
        }

        //非該当のケース(※念のため)
        throw new RuntimeException( "This value does not exist.[" + myWorkStyleDivision + "]" );
    }
}
