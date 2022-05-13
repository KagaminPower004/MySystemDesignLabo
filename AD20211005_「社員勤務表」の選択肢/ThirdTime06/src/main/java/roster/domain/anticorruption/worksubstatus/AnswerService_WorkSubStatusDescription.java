package roster.domain.anticorruption.worksubstatus;

import roster.domain.model.styledivision.Judge_StyleDivision;
import roster.domain.support.tool.NewLine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnswerService_WorkSubStatusDescription {

    private final String myStyle ;
    private final List<Interface_WorkSubStatus>
            myWorkSubStatusDescription_List = new ArrayList<>();
    private final String myOneOfNewLine     = new NewLine().executed();

    public AnswerService_WorkSubStatusDescription(final String myStyle)
        {
            //引数チェック
            final Judge_StyleDivision myJudgedStyle = new Judge_StyleDivision(myStyle);
            if(myJudgedStyle.isNG())  { System.out.println("This value does not exist."); }

            //フィールドセット
            this.myStyle = myStyle;
        }

    public final String answer_WorkSubStatusDescription(){

        final String myAnswer_the_first_part = "If the " + myStyle + " is " + myOneOfNewLine;

        final StringBuilder myAnswer_the_main_part_work = new StringBuilder();
        for (final Interface_WorkSubStatus myWorkSubStatusDescription :this.myWorkSubStatusDescription_List())
        {
            myAnswer_the_main_part_work
                    .append("  ●").append(myWorkSubStatusDescription.name()).append(":")
                    .append(myOneOfNewLine)
                    .append("    ⇒")
                    .append(myWorkSubStatusDescription.description()
                            .replace(myOneOfNewLine,myOneOfNewLine + "      "))
                    .append(myOneOfNewLine);
        }
        final String myAnswer_the_main_part = myAnswer_the_main_part_work.toString();

        final String myAnswer_the_last_part =  "" + myOneOfNewLine;

        return myAnswer_the_first_part
                + myAnswer_the_main_part
                + myAnswer_the_last_part ;
    }

    public final List<Interface_WorkSubStatus> myWorkSubStatusDescription_List()
        {
            Judge_StyleDivision myJudgedStyle = new Judge_StyleDivision(myStyle);

            if(myJudgedStyle.isTelework())         { return teleworkSettings(); }
            if(myJudgedStyle.isPhysical_Work())    { return physical_workSettings(); }
            if(myJudgedStyle.isNon_Work())         { return non_workSettings(); }
            else                                    { myWorkSubStatusDescription_List.clear(); }

            return  Collections.unmodifiableList(myWorkSubStatusDescription_List);
        }

    private List<Interface_WorkSubStatus> teleworkSettings()
        {
            myWorkSubStatusDescription_List.add( MultiAdapter_WorkSubStatus.WORKING );
            myWorkSubStatusDescription_List.add( MultiAdapter_WorkSubStatus.OUTSIDE );
            myWorkSubStatusDescription_List.add( MultiAdapter_WorkSubStatus.INDOOR);

            return Collections.unmodifiableList(myWorkSubStatusDescription_List);
        }
    private List<Interface_WorkSubStatus> physical_workSettings()
        {
            myWorkSubStatusDescription_List.add( MultiAdapter_WorkSubStatus.WORKING );
            myWorkSubStatusDescription_List.add( MultiAdapter_WorkSubStatus.INSIDE );
            myWorkSubStatusDescription_List.add( MultiAdapter_WorkSubStatus.OUTSIDE );
            myWorkSubStatusDescription_List.add( MultiAdapter_WorkSubStatus.INDOOR);
            myWorkSubStatusDescription_List.add( MultiAdapter_WorkSubStatus.OUTDOOR);

            return Collections.unmodifiableList(myWorkSubStatusDescription_List);
        }
    private List<Interface_WorkSubStatus> non_workSettings()
        {
            myWorkSubStatusDescription_List.add( MultiAdapter_WorkSubStatus.NON_WORKING);

            return Collections.unmodifiableList(myWorkSubStatusDescription_List);
        }
}