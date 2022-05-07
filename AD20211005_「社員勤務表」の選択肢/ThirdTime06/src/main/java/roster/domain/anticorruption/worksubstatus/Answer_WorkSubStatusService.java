package roster.domain.anticorruption.worksubstatus;

import roster.domain.support.tool.SeparatorLine;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Answer_WorkSubStatusService {

    private final String myStyle ;
    private final List<WorkSubStatusInterface> myWorkSubStatus_List
            = new ArrayList<>();
    private final SeparatorLine mySeparatorLine = new SeparatorLine();

    public Answer_WorkSubStatusService(final String myStyle)
        {
            //引数チェック
            Check_WorkSubStatusService myStyleCheck = new Check_WorkSubStatusService(myStyle);
            if(myStyleCheck.isNG()){ System.out.println("This value does not exist."); }

            //フィールドセット
            this.myStyle = myStyle;
        }

    public final List<WorkSubStatusInterface> workSubStatus_List()
        {
            Check_WorkSubStatusService myStyleCheck = new Check_WorkSubStatusService(myStyle);

            if(myStyleCheck.isTelework())          { return teleworkSettings(); }
            if(myStyleCheck.isPhysical_Work())     { return physical_workSettings(); }
            if(myStyleCheck.isNon_Work())          { return non_workSettings(); }
            else                                   { myWorkSubStatus_List.clear(); }

            return  Collections.unmodifiableList(myWorkSubStatus_List);
        }
    private List<WorkSubStatusInterface> teleworkSettings()
        {
            myWorkSubStatus_List.add(WorkSubStatusAdapter.WORKING);
            myWorkSubStatus_List.add(WorkSubStatusAdapter.OUTSIDE);
            myWorkSubStatus_List.add(WorkSubStatusAdapter.INDOOR);

            return Collections.unmodifiableList(myWorkSubStatus_List);
        }
    private List<WorkSubStatusInterface> physical_workSettings()
        {
            myWorkSubStatus_List.add(WorkSubStatusAdapter.WORKING);
            myWorkSubStatus_List.add(WorkSubStatusAdapter.INSIDE);
            myWorkSubStatus_List.add(WorkSubStatusAdapter.INDOOR);
            myWorkSubStatus_List.add(mySeparatorLine);
            myWorkSubStatus_List.add(WorkSubStatusAdapter.WORKING);
            myWorkSubStatus_List.add(WorkSubStatusAdapter.OUTSIDE);
            myWorkSubStatus_List.add(WorkSubStatusAdapter.OUTDOOR);

            return Collections.unmodifiableList(myWorkSubStatus_List);
        }
    private List<WorkSubStatusInterface> non_workSettings()
        {
            myWorkSubStatus_List.add(WorkSubStatusAdapter.NON_WORKING);

            return Collections.unmodifiableList(myWorkSubStatus_List);
        }
}