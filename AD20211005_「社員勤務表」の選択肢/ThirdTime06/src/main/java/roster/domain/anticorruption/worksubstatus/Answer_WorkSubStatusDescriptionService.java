package roster.domain.anticorruption.worksubstatus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Answer_WorkSubStatusDescriptionService {

    private final String myStyle ;
    private final List<WorkSubStatusInterface> myWorkSubStatusDescription_List
            = new ArrayList<>();

    public Answer_WorkSubStatusDescriptionService(final String myStyle)
        {
            //引数チェック
            Check_WorkSubStatusService myStyleName = new Check_WorkSubStatusService(myStyle);
            if(myStyleName.isNG())  { System.out.println("This value does not exist."); }

            //フィールドセット
            this.myStyle = myStyle;
        }

    public List<WorkSubStatusInterface> myWorkSubStatusDescription_List()
        {
            Check_WorkSubStatusService myStyleName = new Check_WorkSubStatusService(myStyle);

            if(myStyleName.isTelework())         { return teleworkSettings(); }
            if(myStyleName.isPhysical_Work())    { return physical_workSettings(); }
            if(myStyleName.isNon_Work())         { return non_workSettings(); }
            else                                 { myWorkSubStatusDescription_List.clear(); }

            return  Collections.unmodifiableList(myWorkSubStatusDescription_List);
        }

    private List<WorkSubStatusInterface> teleworkSettings()
        {
            myWorkSubStatusDescription_List.add( WorkSubStatusAdapter.WORKING );
            myWorkSubStatusDescription_List.add( WorkSubStatusAdapter.OUTSIDE );
            myWorkSubStatusDescription_List.add( WorkSubStatusAdapter.INDOOR);

            return Collections.unmodifiableList(myWorkSubStatusDescription_List);
        }
    private List<WorkSubStatusInterface> physical_workSettings()
        {
            myWorkSubStatusDescription_List.add( WorkSubStatusAdapter.WORKING );
            myWorkSubStatusDescription_List.add( WorkSubStatusAdapter.INSIDE );
            myWorkSubStatusDescription_List.add( WorkSubStatusAdapter.OUTSIDE );
            myWorkSubStatusDescription_List.add( WorkSubStatusAdapter.INDOOR);
            myWorkSubStatusDescription_List.add( WorkSubStatusAdapter.OUTDOOR);

            return Collections.unmodifiableList(myWorkSubStatusDescription_List);
        }
    private List<WorkSubStatusInterface> non_workSettings()
        {
            myWorkSubStatusDescription_List.add( WorkSubStatusAdapter.NON_WORKING);

            return Collections.unmodifiableList(myWorkSubStatusDescription_List);
        }
}