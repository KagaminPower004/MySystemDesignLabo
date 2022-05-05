package roster.domain.anticorruption.service;

import roster.domain.anticorruption.adapter.WorkSubStatusAdapter;
import roster.domain.anticorruption.tool.SeparatorLine;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class WorkSubStatusAnswerService {

    private String my勤務状況 = "" ;
    private List<WorkSubStatusInterface> my勤務状況サブステータス区分list
            = new ArrayList<>();

    public WorkSubStatusAnswerService(String my勤務状況){
        WorkSubStatusCheckService my勤務状況判定 = new WorkSubStatusCheckService(my勤務状況);

        if(my勤務状況判定.is非該当()){ System.out.println("その値は勤務状況には存在しません"); }
        else{ this.my勤務状況 = my勤務状況; }
    }
    public List<WorkSubStatusInterface> 勤務状況サブステータス区分List(){
        WorkSubStatusCheckService my勤務状況判定 = new WorkSubStatusCheckService(my勤務状況);

        if(my勤務状況判定.isテレワーク()) { return テレワーク設定(); }
        if(my勤務状況判定.is出社())      { return 出社設定(); }
        if(my勤務状況判定.is非出社())     { return 非出社設定(); }
        else                          { my勤務状況サブステータス区分list.clear(); }

        return  Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }
    private List<WorkSubStatusInterface> テレワーク設定(){
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.稼働);
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.OUTSIDE);
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.内勤);

        return Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }
    private List<WorkSubStatusInterface> 出社設定() {
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.稼働);
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.INSIDE);
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.内勤);
        my勤務状況サブステータス区分list.add(new SeparatorLine());
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.稼働);
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.OUTSIDE);
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.外勤);

        return Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }
    private List<WorkSubStatusInterface> 非出社設定() {
        my勤務状況サブステータス区分list.add(WorkSubStatusAdapter.非稼働);

        return Collections.unmodifiableList(my勤務状況サブステータス区分list);
    }
}