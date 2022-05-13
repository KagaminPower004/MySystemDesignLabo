package roster.domain.anticorruption.workdivision;

import roster.domain.model.styledivision.Judge_Style;
import roster.domain.support.tool.NewLine;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AnswerService_WorkDivision {

    private final String myStyle;
    private final List<Interface_WorkDivision>
                    myWorkDivision_List = new ArrayList<>();
    private final String myOneOfNewLine = new NewLine().executed();

    public AnswerService_WorkDivision(final String myStyle)
        {
            //引数チェック
            final Judge_Style myJudgedStyle = new Judge_Style(myStyle);
            if(myJudgedStyle.isNG())  { System.out.println("This value does not exist."); }

            //フィールドセット
            this.myStyle = myStyle;
        }

    public final String answerWorkDivision(){

        final String myAnswer_the_first_part
                =  "If the workstyle is " + myStyle + ", the corresponding [work_division] is" + myOneOfNewLine;

        final StringBuilder myAnswer_the_main_part_work = new StringBuilder();
        for (final Interface_WorkDivision myWorkDivision : this.workDivision_list()) {
            myAnswer_the_main_part_work
                    .append("  ●").append(myWorkDivision.name())
                    .append(myOneOfNewLine);
        }
        final String myAnswer_the_main_part = myAnswer_the_main_part_work.toString();

        final String myAnswer_the_last_part = "." + myOneOfNewLine;

        return myAnswer_the_first_part
                + myAnswer_the_main_part
                + myAnswer_the_last_part ;
    }

    public final List<Interface_WorkDivision> workDivision_list()
        {
            final Judge_Style myJudgedStyle = new Judge_Style(myStyle);

            if(myJudgedStyle.isTelework())            { return teleworkSettings(); }
            if(myJudgedStyle.isPhysical_Work())       { return physical_workSettings(); }
            if(myJudgedStyle.isNon_Work())            { return non_workSettings(); }
            else                                       { myWorkDivision_List.clear(); }

            return  Collections.unmodifiableList(myWorkDivision_List);
        }

    private List<Interface_WorkDivision> teleworkSettings()
        {
            myWorkDivision_List.add( ConversionAdapter_WorkDivision.VOLL_ZEIT_ARBEIT );
            myWorkDivision_List.add( ConversionAdapter_WorkDivision.NACHMITTAG_ARBEIT );
            myWorkDivision_List.add( ConversionAdapter_WorkDivision.MORGEN_ARBEIT );

            return  Collections.unmodifiableList(myWorkDivision_List);
        }
    private List<Interface_WorkDivision> physical_workSettings()
        {
            myWorkDivision_List.add( ConversionAdapter_WorkDivision.VOLL_ZEIT_ARBEIT );
            myWorkDivision_List.add( ConversionAdapter_WorkDivision.NACHMITTAG_ARBEIT );
            myWorkDivision_List.add( ConversionAdapter_WorkDivision.MORGEN_ARBEIT );

            return  Collections.unmodifiableList(myWorkDivision_List);
        }
    private List<Interface_WorkDivision> non_workSettings()
        {
            myWorkDivision_List.add( ConversionAdapter_WorkDivision.WEEKLY_HOLIDAY );
            myWorkDivision_List.add( ConversionAdapter_WorkDivision.URLAUB );
            myWorkDivision_List.add( ConversionAdapter_WorkDivision.ABWESENHEIT );

            return  Collections.unmodifiableList(myWorkDivision_List);
        }
}