package attendance_management.domain.anticorruption.workattendance_substatus;

import attendance_management.domain.model.workstyle_division.Judge_WorkStyleDivision;
import attendance_management.domain.support.tool.SeparatorLine;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AnswerService_WorkAttendanceSubStatus {

    private final String myWorkStyle;
    private final List<Interface_WorkAttendanceSubStatus>
                myWorkAttendanceSubStatus_List = new ArrayList<>();

    private static final SeparatorLine mySeparatorLine = new SeparatorLine();

    public AnswerService_WorkAttendanceSubStatus(final String myWorkStyle)
        {
            //引数チェック
            final Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);
            if(myJudgedWorkStyle.isNG()){ throw new RuntimeException( "This value does not exist." ); }

            //フィールドセット
            this.myWorkStyle = myWorkStyle;
        }

    public final String makeAnswer()
        {
            //まとりょーしか!!
            return new CreationService_AnswerOfWorkAttendanceSubStatus(this.myWorkStyle)
                        .makeAnswer() ;
        }

    public final List<Interface_WorkAttendanceSubStatus> createList()
        {
            final Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);

            if(myJudgedWorkStyle.isTelework())       { return teleworkSettings(); }
            if(myJudgedWorkStyle.isPhysical_Work())  { return physical_workSettings(); }
            if(myJudgedWorkStyle.isNon_Work())       { return non_workSettings(); }
            else                                     { myWorkAttendanceSubStatus_List.clear(); }

            return  Collections.unmodifiableList(myWorkAttendanceSubStatus_List);
        }
    private List<Interface_WorkAttendanceSubStatus> teleworkSettings()
        {
            myWorkAttendanceSubStatus_List.add(MultiAdapter_WorkAttendanceSubStatus.WORKING);
            myWorkAttendanceSubStatus_List.add(MultiAdapter_WorkAttendanceSubStatus.OUTSIDE);
            myWorkAttendanceSubStatus_List.add(MultiAdapter_WorkAttendanceSubStatus.INDOOR);

            return Collections.unmodifiableList(myWorkAttendanceSubStatus_List);
        }
    private List<Interface_WorkAttendanceSubStatus> physical_workSettings()
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
    private List<Interface_WorkAttendanceSubStatus> non_workSettings()
        {
            myWorkAttendanceSubStatus_List.add(MultiAdapter_WorkAttendanceSubStatus.NON_WORKING);

            return Collections.unmodifiableList(myWorkAttendanceSubStatus_List);
        }
}