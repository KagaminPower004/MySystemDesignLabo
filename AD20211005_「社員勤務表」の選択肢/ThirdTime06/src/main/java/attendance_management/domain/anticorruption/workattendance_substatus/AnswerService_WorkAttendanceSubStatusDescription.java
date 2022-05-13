package attendance_management.domain.anticorruption.workattendance_substatus;

import attendance_management.domain.model.workstyle_division.Judge_WorkStyleDivision;
import attendance_management.domain.support.tool.NewLine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnswerService_WorkAttendanceSubStatusDescription {

    private final String myWorkStyle;
    private final List<Interface_WorkAttendanceSubStatus>
                myWorkAttendanceSubStatusDescription_List = new ArrayList<>();
    private static final String myOneOfNewLine     = new NewLine().executed();

    public AnswerService_WorkAttendanceSubStatusDescription(final String myWorkStyle)
        {
            //引数チェック
            final Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);
            if(myJudgedWorkStyle.isNG())  { System.out.println("This value does not exist."); }

            //フィールドセット
            this.myWorkStyle = myWorkStyle;
        }

    public final String makeAnswer(){

        final String myAnswer_the_first_part = "If the " + myWorkStyle + " is " + myOneOfNewLine;

        final StringBuilder myAnswer_the_main_part_work = new StringBuilder();
        for (final Interface_WorkAttendanceSubStatus myWorkingDescription :this.createList())
        {
            myAnswer_the_main_part_work
                    .append("  ●").append(myWorkingDescription.name()).append(":")
                    .append(myOneOfNewLine)
                    .append("    ⇒")
                    .append(myWorkingDescription.description()
                            .replace(myOneOfNewLine,myOneOfNewLine + "      "))
                    .append(myOneOfNewLine);
        }
        final String myAnswer_the_main_part = myAnswer_the_main_part_work.toString();

        final String myAnswer_the_last_part =  "" + myOneOfNewLine;

        return myAnswer_the_first_part
                + myAnswer_the_main_part
                + myAnswer_the_last_part ;
    }

    public final List<Interface_WorkAttendanceSubStatus> createList()
        {
            Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);

            if(myJudgedWorkStyle.isTelework())         { return teleworkSettings(); }
            if(myJudgedWorkStyle.isPhysical_Work())    { return physical_workSettings(); }
            if(myJudgedWorkStyle.isNon_Work())         { return non_workSettings(); }
            else                                       { myWorkAttendanceSubStatusDescription_List.clear(); }

            return  Collections.unmodifiableList(myWorkAttendanceSubStatusDescription_List);
        }

    private List<Interface_WorkAttendanceSubStatus> teleworkSettings()
        {
            myWorkAttendanceSubStatusDescription_List.add( MultiAdapter_WorkAttendanceSubStatus.WORKING );
            myWorkAttendanceSubStatusDescription_List.add( MultiAdapter_WorkAttendanceSubStatus.OUTSIDE );
            myWorkAttendanceSubStatusDescription_List.add( MultiAdapter_WorkAttendanceSubStatus.INDOOR);

            return Collections.unmodifiableList(myWorkAttendanceSubStatusDescription_List);
        }
    private List<Interface_WorkAttendanceSubStatus> physical_workSettings()
        {
            myWorkAttendanceSubStatusDescription_List.add( MultiAdapter_WorkAttendanceSubStatus.WORKING );
            myWorkAttendanceSubStatusDescription_List.add( MultiAdapter_WorkAttendanceSubStatus.INSIDE );
            myWorkAttendanceSubStatusDescription_List.add( MultiAdapter_WorkAttendanceSubStatus.OUTSIDE );
            myWorkAttendanceSubStatusDescription_List.add( MultiAdapter_WorkAttendanceSubStatus.INDOOR);
            myWorkAttendanceSubStatusDescription_List.add( MultiAdapter_WorkAttendanceSubStatus.OUTDOOR);

            return Collections.unmodifiableList(myWorkAttendanceSubStatusDescription_List);
        }
    private List<Interface_WorkAttendanceSubStatus> non_workSettings()
        {
            myWorkAttendanceSubStatusDescription_List.add( MultiAdapter_WorkAttendanceSubStatus.NON_WORKING);

            return Collections.unmodifiableList(myWorkAttendanceSubStatusDescription_List);
        }
}