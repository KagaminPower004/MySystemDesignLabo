package roster.domain.anticorruption.workdivision;

import roster.domain.anticorruption.worksubstatus.Check_WorkSubStatusService;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Answer_WorkDivisionService {

    private final String myStyle;
    private final List<WorkDivisionInterface> myWorkDivision_List = new ArrayList<>();

    public Answer_WorkDivisionService(final String myStyle)
        {
            //引数チェック
            Check_WorkSubStatusService myStyleName = new Check_WorkSubStatusService(myStyle);
            if(myStyleName.isNG())  { System.out.println("This value does not exist."); }

            //フィールドセット
            this.myStyle = myStyle;
        }

    public final List<WorkDivisionInterface> workDivision_list()
        {
            Check_WorkSubStatusService myStyleName = new Check_WorkSubStatusService(myStyle);

            if(myStyleName.isTelework())            { return teleworkSettings(); }
            if(myStyleName.isPhysical_Work())       { return physical_workSettings(); }
            if(myStyleName.isNon_Work())            { return non_workSettings(); }
            else                                    { myWorkDivision_List.clear(); }

            return  Collections.unmodifiableList(myWorkDivision_List);
        }

    private List<WorkDivisionInterface> teleworkSettings()
        {
            myWorkDivision_List.add( WorkDivisionAdapter.VOLL_ZEIT_ARBEIT );
            myWorkDivision_List.add( WorkDivisionAdapter.NACHMITTAG_ARBEIT );
            myWorkDivision_List.add( WorkDivisionAdapter.MORGEN_ARBEIT );

            return  Collections.unmodifiableList(myWorkDivision_List);
        }
    private List<WorkDivisionInterface> physical_workSettings()
        {
            myWorkDivision_List.add( WorkDivisionAdapter.VOLL_ZEIT_ARBEIT );
            myWorkDivision_List.add( WorkDivisionAdapter.NACHMITTAG_ARBEIT );
            myWorkDivision_List.add( WorkDivisionAdapter.MORGEN_ARBEIT );

            return  Collections.unmodifiableList(myWorkDivision_List);
        }
    private List<WorkDivisionInterface> non_workSettings()
        {
            myWorkDivision_List.add( WorkDivisionAdapter.WEEKLY_HOLIDAY );
            myWorkDivision_List.add( WorkDivisionAdapter.URLAUB );
            myWorkDivision_List.add( WorkDivisionAdapter.ABWESENHEIT );

            return  Collections.unmodifiableList(myWorkDivision_List);
        }
}