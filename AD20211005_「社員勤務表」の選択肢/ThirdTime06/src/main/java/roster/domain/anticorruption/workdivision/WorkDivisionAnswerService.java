package roster.domain.anticorruption.workdivision;

import roster.domain.anticorruption.worksubstatus.WorkSubStatusCheckService;
import roster.domain.model.WorkDivision;
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
        myWorkDivisionlist.add(new WorkDivionAdapter(WorkDivision.FULLTIME_WORK));
        myWorkDivisionlist.add(new WorkDivionAdapter(WorkDivision.AFTERNOON_WORK));
        myWorkDivisionlist.add(new WorkDivionAdapter(WorkDivision.MORNING_WORK));

        return  Collections.unmodifiableList(myWorkDivisionlist);
    }
    private List<WorkDivisionInterface> physical_workSettings(){
        myWorkDivisionlist.add(new WorkDivionAdapter(WorkDivision.FULLTIME_WORK));
        myWorkDivisionlist.add(new WorkDivionAdapter(WorkDivision.AFTERNOON_WORK));
        myWorkDivisionlist.add(new WorkDivionAdapter(WorkDivision.MORNING_WORK));

        return  Collections.unmodifiableList(myWorkDivisionlist);
    }
    private List<WorkDivisionInterface> non_workSettings(){
        myWorkDivisionlist.add(new WorkDivionAdapter(WorkDivision.WEEKLY_HOLIDAY));
        myWorkDivisionlist.add(new WorkDivionAdapter(WorkDivision.HOLIDAY));
        myWorkDivisionlist.add(new WorkDivionAdapter(WorkDivision.ABSENCE));

        return  Collections.unmodifiableList(myWorkDivisionlist);
    }
}