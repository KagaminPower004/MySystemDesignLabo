package attendance_management.domain.anticorruption.workattendance_division;

import attendance_management.domain.model.workstyle_division.Judge_WorkStyleDivision;
import attendance_management.domain.support.tool.NewLine;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AnswerService_WorkAttendanceDivision {

    private final String myWorkStyle;
    private final List<Interface_WorkAttendanceDivision>
                myWorkAttendanceDivision_List = new ArrayList<>();
    private static final String myOneOfNewLine = new NewLine().executed();

    public AnswerService_WorkAttendanceDivision(final String myWorkStyle)
        {
            //引数チェック
            final Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);
            if(myJudgedWorkStyle.isNG())  { System.out.println("This value does not exist."); }

            //フィールドセット
            this.myWorkStyle = myWorkStyle;
        }

    public final String makeAnswer(){

        final String myAnswer_the_first_part
                =  "If the workstyle is " + myWorkStyle + ", the corresponding [WorkAttendanceDivision] is" + myOneOfNewLine;

        final StringBuilder myAnswer_the_main_part_work = new StringBuilder();
        for (final Interface_WorkAttendanceDivision myWorkingDivision : this.createList()) {
            myAnswer_the_main_part_work
                    .append("  ●").append(myWorkingDivision.name())
                    .append(myOneOfNewLine);
        }
        final String myAnswer_the_main_part = myAnswer_the_main_part_work.toString();

        final String myAnswer_the_last_part = "." + myOneOfNewLine;

        return myAnswer_the_first_part
                + myAnswer_the_main_part
                + myAnswer_the_last_part ;
    }

    public final List<Interface_WorkAttendanceDivision> createList()
        {
            final Judge_WorkStyleDivision myJudgedWorkStyle = new Judge_WorkStyleDivision(myWorkStyle);

            if(myJudgedWorkStyle.isTelework())            { return teleworkSettings(); }
            if(myJudgedWorkStyle.isPhysical_Work())       { return physical_workSettings(); }
            if(myJudgedWorkStyle.isNon_Work())            { return non_workSettings(); }
            else                                          { myWorkAttendanceDivision_List.clear(); }

            return  Collections.unmodifiableList(myWorkAttendanceDivision_List);
        }

    private List<Interface_WorkAttendanceDivision> teleworkSettings()
        {
            myWorkAttendanceDivision_List.add( ConversionAdapter_WorkAttendanceDivision.VOLL_ZEIT_ARBEIT );
            myWorkAttendanceDivision_List.add( ConversionAdapter_WorkAttendanceDivision.NACHMITTAG_ARBEIT );
            myWorkAttendanceDivision_List.add( ConversionAdapter_WorkAttendanceDivision.MORGEN_ARBEIT );

            return  Collections.unmodifiableList(myWorkAttendanceDivision_List);
        }
    private List<Interface_WorkAttendanceDivision> physical_workSettings()
        {
            myWorkAttendanceDivision_List.add( ConversionAdapter_WorkAttendanceDivision.VOLL_ZEIT_ARBEIT );
            myWorkAttendanceDivision_List.add( ConversionAdapter_WorkAttendanceDivision.NACHMITTAG_ARBEIT );
            myWorkAttendanceDivision_List.add( ConversionAdapter_WorkAttendanceDivision.MORGEN_ARBEIT );

            return  Collections.unmodifiableList(myWorkAttendanceDivision_List);
        }
    private List<Interface_WorkAttendanceDivision> non_workSettings()
        {
            myWorkAttendanceDivision_List.add( ConversionAdapter_WorkAttendanceDivision.WEEKLY_HOLIDAY );
            myWorkAttendanceDivision_List.add( ConversionAdapter_WorkAttendanceDivision.URLAUB );
            myWorkAttendanceDivision_List.add( ConversionAdapter_WorkAttendanceDivision.ABWESENHEIT );

            return  Collections.unmodifiableList(myWorkAttendanceDivision_List);
        }
}