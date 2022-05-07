package roster.user.domainExpert;

import roster.domain.anticorruption.worksubstatus.WorkSubStatusInterface;
import roster.domain.anticorruption.worksubstatus.Answer_WorkSubStatusService;
import roster.domain.anticorruption.worksubstatus.Answer_WorkSubStatusDescriptionService;
import roster.domain.anticorruption.workdivision.WorkDivisionInterface;
import roster.domain.anticorruption.workdivision.Answer_WorkDivisionService;
import java.util.ArrayList;
import java.util.List;

public class Pure {
    private static List<WorkDivisionInterface>  my勤務区分list                      = new ArrayList<>();
    private static List<WorkSubStatusInterface> my勤務状況サブステータス区分list        = new ArrayList<>();
    private static List<WorkSubStatusInterface> my勤務状況サブステータス区分補足説明list  = new ArrayList<>();

    public static void main(String args[]){

        final String my勤務状況 = args[0];

        勤務区分問合せ(my勤務状況);
        勤務状況サブステータス区分問合せ(my勤務状況);
        勤務状況サブステータス区分補足説明(my勤務状況);
    }

    private static void 勤務区分問合せ(String my勤務状況){

        Answer_WorkDivisionService my勤務区分問合せ = new Answer_WorkDivisionService(my勤務状況);
        my勤務区分list = my勤務区分問合せ.workDivision_list();

        System.out.println("『勤務状況』が" + my勤務状況 + "の場合、該当する『勤務区分』は");
        for (WorkDivisionInterface my勤務区分 : my勤務区分list) {
            System.out.println("  ●" + my勤務区分.name());
        }
        System.out.println("です。");
    }

    private static void 勤務状況サブステータス区分問合せ(String my勤務状況){

        Answer_WorkSubStatusService my勤務状況サブステータス区分問合せ
                = new Answer_WorkSubStatusService(my勤務状況);
        my勤務状況サブステータス区分list
                = my勤務状況サブステータス区分問合せ.workSubStatus_List();

        System.out.println("『勤務状況』が" + my勤務状況 + "の場合、該当する『勤務状況サブステータス区分』は");
        for (WorkSubStatusInterface my勤務状況サブステータス区分 :
                my勤務状況サブステータス区分list) {
            System.out.println("  ●" + my勤務状況サブステータス区分.name());
        }
        System.out.println("です。");
    }

    private static void 勤務状況サブステータス区分補足説明(String my勤務状況){

        Answer_WorkSubStatusDescriptionService my勤務状況サブステータス区分補足説明
                = new Answer_WorkSubStatusDescriptionService(my勤務状況);
        my勤務状況サブステータス区分補足説明list
                = my勤務状況サブステータス区分補足説明.myWorkSubStatusDescription_List();

        System.out.println("『勤務状況サブステータス区分』が");
        for (WorkSubStatusInterface my勤務状況サブステータス区分 :
                my勤務状況サブステータス区分補足説明list) {
            System.out.println( "  ●" + my勤務状況サブステータス区分.name() + "の場合、" );
            System.out.println( "    ⇒" + my勤務状況サブステータス区分.description() );

        }
        System.out.println("です。");
    }

}