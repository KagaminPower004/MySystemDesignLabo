package roster.domain.anticorruption.worksubstatus;

import roster.domain.support.tool.NewLine;
import roster.domain.support.tool.SeparatorLine;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AnswerService_WorkSubStatus {

    private final String myStyle ;
    private final List<Interface_WorkSubStatus> myWorkSubStatus_List
            = new ArrayList<>();
    private final SeparatorLine mySeparatorLine = new SeparatorLine();
    private final String        myOneOfNewLine  = new NewLine().executed();

    public AnswerService_WorkSubStatus(final String myStyle)
        {
            //引数チェック
            Check_WorkSubStatus myStyleCheck = new Check_WorkSubStatus(myStyle);
            if(myStyleCheck.isNG()){ System.out.println("This value does not exist."); }

            //フィールドセット
            this.myStyle = myStyle;
        }

    public final String answerWorkSubStatus(){
        final String myAnswer_the_first_part
                = "If the workstyle is " + myStyle + ", the corresponding [work_sub-status] is" + myOneOfNewLine;

        StringBuilder myAnswer_the_main_part_work = new StringBuilder();
        for (Interface_WorkSubStatus myWorkSubStatus : this.workSubStatus_List()) {
            myAnswer_the_main_part_work
                    .append("  ●").append(myWorkSubStatus.name()).append(myOneOfNewLine);
        }
        final String myAnswer_the_main_part
                = myAnswer_the_main_part_work.toString()
                    .replace(" ●" + mySeparatorLine.name() ,mySeparatorLine.name());

        final String myAnswer_the_last_part = "." + myOneOfNewLine;

        return myAnswer_the_first_part + myAnswer_the_main_part + myAnswer_the_last_part ;
    }

    public final List<Interface_WorkSubStatus> workSubStatus_List()
        {
            Check_WorkSubStatus myStyleCheck = new Check_WorkSubStatus(myStyle);

            if(myStyleCheck.isTelework())          { return teleworkSettings(); }
            if(myStyleCheck.isPhysical_Work())     { return physical_workSettings(); }
            if(myStyleCheck.isNon_Work())          { return non_workSettings(); }
            else                                   { myWorkSubStatus_List.clear(); }

            return  Collections.unmodifiableList(myWorkSubStatus_List);
        }
    private List<Interface_WorkSubStatus> teleworkSettings()
        {
            myWorkSubStatus_List.add(MultiAdapter_WorkSubStatus.WORKING);
            myWorkSubStatus_List.add(MultiAdapter_WorkSubStatus.OUTSIDE);
            myWorkSubStatus_List.add(MultiAdapter_WorkSubStatus.INDOOR);

            return Collections.unmodifiableList(myWorkSubStatus_List);
        }
    private List<Interface_WorkSubStatus> physical_workSettings()
        {
            myWorkSubStatus_List.add(MultiAdapter_WorkSubStatus.WORKING);
            myWorkSubStatus_List.add(MultiAdapter_WorkSubStatus.INSIDE);
            myWorkSubStatus_List.add(MultiAdapter_WorkSubStatus.INDOOR);
            myWorkSubStatus_List.add(mySeparatorLine);
            myWorkSubStatus_List.add(MultiAdapter_WorkSubStatus.WORKING);
            myWorkSubStatus_List.add(MultiAdapter_WorkSubStatus.OUTSIDE);
            myWorkSubStatus_List.add(MultiAdapter_WorkSubStatus.OUTDOOR);

            return Collections.unmodifiableList(myWorkSubStatus_List);
        }
    private List<Interface_WorkSubStatus> non_workSettings()
        {
            myWorkSubStatus_List.add(MultiAdapter_WorkSubStatus.NON_WORKING);

            return Collections.unmodifiableList(myWorkSubStatus_List);
        }
}