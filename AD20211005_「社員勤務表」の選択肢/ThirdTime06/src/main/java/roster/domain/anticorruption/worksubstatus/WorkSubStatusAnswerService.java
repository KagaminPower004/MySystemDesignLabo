package roster.domain.anticorruption.worksubstatus;

import roster.domain.support.SeparatorLine;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class WorkSubStatusAnswerService {

    private String myStyle = "" ;
    private List<WorkSubStatusInterface> myWorkSubStatus_List
            = new ArrayList<>();

    public WorkSubStatusAnswerService(String myStyle){
        WorkSubStatusCheckService myStyleCheck = new WorkSubStatusCheckService(myStyle);

        if(myStyleCheck.isNG()){ System.out.println("This value does not exist."); }
        else{ this.myStyle = myStyle; }
    }
    public List<WorkSubStatusInterface> workSubStatus_List(){
        WorkSubStatusCheckService myStyleCheck = new WorkSubStatusCheckService(myStyle);

        if(myStyleCheck.isTelework())          { return teleworkSettings(); }
        if(myStyleCheck.isPhysical_Work())      { return physical_workSettings(); }
        if(myStyleCheck.isNon_Work())           { return non_workSettings(); }
        else                                   { myWorkSubStatus_List.clear(); }

        return  Collections.unmodifiableList(myWorkSubStatus_List);
    }
    private List<WorkSubStatusInterface> teleworkSettings(){
        myWorkSubStatus_List.add(WorkSubStatusAdapter.WORKING);
        myWorkSubStatus_List.add(WorkSubStatusAdapter.OUTSIDE);
        myWorkSubStatus_List.add(WorkSubStatusAdapter.INDOOR);

        return Collections.unmodifiableList(myWorkSubStatus_List);
    }
    private List<WorkSubStatusInterface> physical_workSettings() {
        myWorkSubStatus_List.add(WorkSubStatusAdapter.WORKING);
        myWorkSubStatus_List.add(WorkSubStatusAdapter.INSIDE);
        myWorkSubStatus_List.add(WorkSubStatusAdapter.INDOOR);
        myWorkSubStatus_List.add(new SeparatorLine());
        myWorkSubStatus_List.add(WorkSubStatusAdapter.WORKING);
        myWorkSubStatus_List.add(WorkSubStatusAdapter.OUTSIDE);
        myWorkSubStatus_List.add(WorkSubStatusAdapter.OUTDOOR);

        return Collections.unmodifiableList(myWorkSubStatus_List);
    }
    private List<WorkSubStatusInterface> non_workSettings() {
        myWorkSubStatus_List.add(WorkSubStatusAdapter.NON_WORKING);

        return Collections.unmodifiableList(myWorkSubStatus_List);
    }
}