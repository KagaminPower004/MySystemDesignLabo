package roster.domain.anticorruption.worksubstatus;

import roster.domain.support.SeparatorLine;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class WorkSubStatusAnswerService {

    private String myStyle = "" ;
    private List<WorkSubStatusInterface> my勤務状況サブステータス区分list
            = new ArrayList<>();

    public WorkSubStatusAnswerService(String myStyle){
        WorkSubStatusCheckService my勤務状況判定 = new WorkSubStatusCheckService(myStyle);

        if(my勤務状況判定.isNG()){ System.out.println("その値は勤務状況には存在しません"); }
        else{ this.myStyle = myStyle; }
    }
    public List<WorkSubStatusInterface> 勤務状況サブステータス区分List(){
        WorkSubStatusCheckService my勤務状況判定 = new WorkSubStatusCheckService(myStyle);

        if(my勤務状況判定.isTeleWork()) { return テレワーク設定(); }
        if(my勤務状況判定.isPhysicalWork())      { return 出社設定(); }
        if(my勤務状況判定.isNonWork())     { return 非出社設定(); }
        else                          { my勤務状況サブステータス区分list.clear(); }

        return  Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }
    private List<WorkSubStatusInterface> テレワーク設定(){
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.WORKING);
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.OUTSIDE);
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.INDOOR);

        return Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }
    private List<WorkSubStatusInterface> 出社設定() {
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.WORKING);
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.INSIDE);
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.INDOOR);
        my勤務状況サブステータス区分list.add(new SeparatorLine());
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.WORKING);
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.OUTSIDE);
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.OUTDOOR);

        return Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }
    private List<WorkSubStatusInterface> 非出社設定() {
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.NON_WORKING);

        return Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }
}