package attendance_management.domain.model.workattendance_substatus;

import attendance_management.domain.model.workstyle_division.Judge_WorkStyleDivision;
import attendance_management.domain.support.tool.SeparatorLine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Creation_ListOfWorkAttendanceSubStatus
        implements Interface_Creation_ListOfWorkAttendanceSubStatus {

    private final String myWorkStyle;
    private final List<Interface_WorkAttendanceSubStatus>
                myWorkAttendanceSubStatus_List = new ArrayList<>();

    private static final SeparatorLine mySeparatorLine = new SeparatorLine();

    public Creation_ListOfWorkAttendanceSubStatus(final String myWorkStyle)
        {
            //引数チェック
            final Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);
            if(myJudgedWorkStyle.isNG()){ throw new RuntimeException( "This value does not exist." ); }

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
            myWorkAttendanceSubStatus_List.add(MultiAdapter_WorkAttendanceSubStatus.WORKING);
            myWorkAttendanceSubStatus_List.add(MultiAdapter_WorkAttendanceSubStatus.OUTSIDE);
            myWorkAttendanceSubStatus_List.add(MultiAdapter_WorkAttendanceSubStatus.INDOOR);

            return Collections.unmodifiableList(myWorkAttendanceSubStatus_List);
        }
    public List<Interface_WorkAttendanceSubStatus> physical_workSettings()
        {
            myWorkAttendanceSubStatus_List.add(MultiAdapter_WorkAttendanceSubStatus.WORKING);
            myWorkAttendanceSubStatus_List.add(MultiAdapter_WorkAttendanceSubStatus.INSIDE);
            myWorkAttendanceSubStatus_List.add(MultiAdapter_WorkAttendanceSubStatus.INDOOR);
            myWorkAttendanceSubStatus_List.add(mySeparatorLine);
            myWorkAttendanceSubStatus_List.add(MultiAdapter_WorkAttendanceSubStatus.WORKING);
            myWorkAttendanceSubStatus_List.add(MultiAdapter_WorkAttendanceSubStatus.OUTSIDE);
            myWorkAttendanceSubStatus_List.add(MultiAdapter_WorkAttendanceSubStatus.OUTDOOR);

            return Collections.unmodifiableList(myWorkAttendanceSubStatus_List);
        }
    public List<Interface_WorkAttendanceSubStatus> non_workSettings()
        {
            myWorkAttendanceSubStatus_List.add(MultiAdapter_WorkAttendanceSubStatus.NON_WORKING);

            return Collections.unmodifiableList(myWorkAttendanceSubStatus_List);
        }
}