package roster.domain.anticorruption.workdivision;

import roster.domain.anticorruption.worksubstatus.WorkSubStatusCheckService;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class WorkDivisionAnswerService {

    private String myStyle = "";
    private List<WorkDivisionInterface> myWorkDivisionlist = new ArrayList<>();

    public WorkDivisionAnswerService(String myStyle){

        WorkSubStatusCheckService myStyleCheck = new WorkSubStatusCheckService(myStyle);

        if(myStyleCheck.isNG())  { System.out.println("That value does not exist."); }
        else                     { this.myStyle = myStyle; }
    }

    public List<WorkDivisionInterface> WorkDivisionlist(){

        WorkSubStatusCheckService myStyleCheck = new WorkSubStatusCheckService(myStyle);

        if(myStyleCheck.isTeleWork())          {return teleworkSettings(); }
        if(myStyleCheck.isPhysicalWork())      {return physical_workSettings(); }
        if(myStyleCheck.isNonWork())           {return non_workSettings(); }
        else                                   { myWorkDivisionlist.clear(); }

        return  Collections.unmodifiableList(myWorkDivisionlist);
    }

    private List<WorkDivisionInterface> teleworkSettings(){
        myWorkDivisionlist.add( WorkDivisionAdapter.FULL_TIME_WORK);
        myWorkDivisionlist.add( WorkDivisionAdapter.AFTERNOON_WORK );
        myWorkDivisionlist.add( WorkDivisionAdapter.MORNING_WORK);

        return  Collections.unmodifiableList(myWorkDivisionlist);
    }
    private List<WorkDivisionInterface> physical_workSettings(){
        myWorkDivisionlist.add( WorkDivisionAdapter.FULL_TIME_WORK);
        myWorkDivisionlist.add( WorkDivisionAdapter.AFTERNOON_WORK );
        myWorkDivisionlist.add( WorkDivisionAdapter.MORNING_WORK );

        return  Collections.unmodifiableList(myWorkDivisionlist);
    }
    private List<WorkDivisionInterface> non_workSettings(){
        myWorkDivisionlist.add( WorkDivisionAdapter.WEEKLY_HOLIDAY );
        myWorkDivisionlist.add( WorkDivisionAdapter.HOLIDAY );
        myWorkDivisionlist.add( WorkDivisionAdapter.ABSENCE );

        return  Collections.unmodifiableList(myWorkDivisionlist);
    }
}