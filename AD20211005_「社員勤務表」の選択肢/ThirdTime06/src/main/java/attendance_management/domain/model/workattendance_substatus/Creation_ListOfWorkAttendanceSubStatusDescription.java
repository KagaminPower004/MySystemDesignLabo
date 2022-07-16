package attendance_management.domain.model.workattendance_substatus;

import attendance_management.domain.model.workstyle_division.Judge_WorkStyleDivision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Creation_ListOfWorkAttendanceSubStatusDescription
        implements Interface_Creation_ListOfWorkAttendanceSubStatus{

    private final String myWorkStyle;
    private final List<Interface_WorkAttendanceSubStatus>
                myDescriptionOfWorkAttendanceSubStatus_List = new ArrayList<>();

    public Creation_ListOfWorkAttendanceSubStatusDescription(final String myWorkStyle)
        {
            //引数チェック
            final Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);
            if(myJudgedWorkStyle.isNG())  { throw new RuntimeException( "This value does not exist." ); }

            //フィールドセット
            this.myWorkStyle = myWorkStyle;
        }

    public final List<Interface_WorkAttendanceSubStatus> create()
        {
            //まとりょーしか！：処理分別を委譲
            return new Creation_ListOfWorkAttendanceSubStatusByWorkStyle
                    (
                            this.myWorkStyle
                            ,this
                    )
                    .create();
        }

    public List<Interface_WorkAttendanceSubStatus> teleworkSettings()
        {
            myDescriptionOfWorkAttendanceSubStatus_List.add( MultiAdapter_WorkAttendanceSubStatus.WORKING );
            myDescriptionOfWorkAttendanceSubStatus_List.add( MultiAdapter_WorkAttendanceSubStatus.OUTSIDE );
            myDescriptionOfWorkAttendanceSubStatus_List.add( MultiAdapter_WorkAttendanceSubStatus.INDOOR);

            return Collections.unmodifiableList(myDescriptionOfWorkAttendanceSubStatus_List);
        }
    public List<Interface_WorkAttendanceSubStatus> physical_workSettings()
        {
            myDescriptionOfWorkAttendanceSubStatus_List.add( MultiAdapter_WorkAttendanceSubStatus.WORKING );
            myDescriptionOfWorkAttendanceSubStatus_List.add( MultiAdapter_WorkAttendanceSubStatus.INSIDE);
            myDescriptionOfWorkAttendanceSubStatus_List.add( MultiAdapter_WorkAttendanceSubStatus.OUTSIDE );
            myDescriptionOfWorkAttendanceSubStatus_List.add( MultiAdapter_WorkAttendanceSubStatus.INDOOR);
            myDescriptionOfWorkAttendanceSubStatus_List.add( MultiAdapter_WorkAttendanceSubStatus.OUTDOOR);

            return Collections.unmodifiableList(myDescriptionOfWorkAttendanceSubStatus_List);
        }
    public List<Interface_WorkAttendanceSubStatus> non_workSettings()
        {
            myDescriptionOfWorkAttendanceSubStatus_List.add( MultiAdapter_WorkAttendanceSubStatus.NON_WORKING);

            return Collections.unmodifiableList(myDescriptionOfWorkAttendanceSubStatus_List);
        }
}