package attendance_management.domain.anticorruption.workattendance_division;

import attendance_management.domain.model.workstyle_division.Check_SpellingOfWorkStyleDivision;
import attendance_management.domain.model.workstyle_division.Judge_WorkStyleDivision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreationService_ListOfWorkAttendanceDivision {

    private final String myWorkStyle;
    private final List<Interface_WorkAttendanceDivision>
                myWorkAttendanceDivision_List = new ArrayList<>();

    public CreationService_ListOfWorkAttendanceDivision(final String myWorkStyle)
        {
            //引数チェック
            new Check_SpellingOfWorkStyleDivision(myWorkStyle)
                    .isExceptionOccurred();

            //フィールドセット
            this.myWorkStyle = myWorkStyle;
        }

    public final List<Interface_WorkAttendanceDivision> create()
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
            myWorkAttendanceDivision_List.add( Translator_WorkAttendanceDivision.VOLL_ZEIT_ARBEIT );
            myWorkAttendanceDivision_List.add( Translator_WorkAttendanceDivision.NACHMITTAG_ARBEIT );
            myWorkAttendanceDivision_List.add( Translator_WorkAttendanceDivision.MORGEN_ARBEIT );

            return  Collections.unmodifiableList(myWorkAttendanceDivision_List);
        }
    private List<Interface_WorkAttendanceDivision> physical_workSettings()
        {
            myWorkAttendanceDivision_List.add( Translator_WorkAttendanceDivision.VOLL_ZEIT_ARBEIT );
            myWorkAttendanceDivision_List.add( Translator_WorkAttendanceDivision.NACHMITTAG_ARBEIT );
            myWorkAttendanceDivision_List.add( Translator_WorkAttendanceDivision.MORGEN_ARBEIT );

            return  Collections.unmodifiableList(myWorkAttendanceDivision_List);
        }
    private List<Interface_WorkAttendanceDivision> non_workSettings()
        {
            myWorkAttendanceDivision_List.add( Translator_WorkAttendanceDivision.WEEKLY_HOLIDAY );
            myWorkAttendanceDivision_List.add( Translator_WorkAttendanceDivision.URLAUB );
            myWorkAttendanceDivision_List.add( Translator_WorkAttendanceDivision.ABWESENHEIT );

            return  Collections.unmodifiableList(myWorkAttendanceDivision_List);
        }
}