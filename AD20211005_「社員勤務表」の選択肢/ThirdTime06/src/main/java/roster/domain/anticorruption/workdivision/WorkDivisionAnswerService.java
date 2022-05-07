package roster.domain.anticorruption.workdivision;

import roster.domain.anticorruption.worksubstatus.WorkSubStatusCheckService;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class WorkDivisionAnswerService {

    private String myStyle = "";
    private final List<WorkDivisionInterface> myWorkDivision_List = new ArrayList<>();

    public WorkDivisionAnswerService(String myStyle){

        WorkSubStatusCheckService myStyleCheck = new WorkSubStatusCheckService(myStyle);

        if(myStyleCheck.isNG())  { System.out.println("This value does not exist."); }
        else                     { this.myStyle = myStyle; }
    }

    public List<WorkDivisionInterface> workDivision_list(){
        WorkSubStatusCheckService myStyleCheck = new WorkSubStatusCheckService(myStyle);

        if(myStyleCheck.isTelework())          {return teleworkSettings(); }
        if(myStyleCheck.isPhysical_Work())      {return physical_workSettings(); }
        if(myStyleCheck.isNon_Work())           {return non_workSettings(); }
        else                                   { myWorkDivision_List.clear(); }

        return  Collections.unmodifiableList(myWorkDivision_List);
    }

    private List<WorkDivisionInterface> teleworkSettings(){
        myWorkDivision_List.add( WorkDivisionAdapter.VOLL_ZEIT_ARBEIT);
        myWorkDivision_List.add( WorkDivisionAdapter.NACHMITTAG_ARBEIT);
        myWorkDivision_List.add( WorkDivisionAdapter.MORGEN_ARBEIT);

        return  Collections.unmodifiableList(myWorkDivision_List);
    }
    private List<WorkDivisionInterface> physical_workSettings(){
        myWorkDivision_List.add( WorkDivisionAdapter.VOLL_ZEIT_ARBEIT);
        myWorkDivision_List.add( WorkDivisionAdapter.NACHMITTAG_ARBEIT);
        myWorkDivision_List.add( WorkDivisionAdapter.MORGEN_ARBEIT);

        return  Collections.unmodifiableList(myWorkDivision_List);
    }
    private List<WorkDivisionInterface> non_workSettings(){
        myWorkDivision_List.add( WorkDivisionAdapter.WEEKLY_HOLIDAY );
        myWorkDivision_List.add( WorkDivisionAdapter.URLAUB);
        myWorkDivision_List.add( WorkDivisionAdapter.ABWESENHEIT);

        return  Collections.unmodifiableList(myWorkDivision_List);
    }
}