package roster.domain.anticorruption.service;

import roster.domain.anticorruption.adapter.WorkDivionAdapter;
import roster.domain.model.勤務区分;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class WorkDivisionAnswerService {

    private String my勤務状況 = "";
    private List<WorkDivisionInterface> my勤務区分list = new ArrayList<>();

    public WorkDivisionAnswerService(String my勤務状況){

        WorkSubStatusCheckService my勤務状況判定 = new WorkSubStatusCheckService(my勤務状況);

        if(my勤務状況判定.is非該当()){ System.out.println("その値は勤務状況には存在しません"); }
        else                     { this.my勤務状況 = my勤務状況; }
    }

    public List<WorkDivisionInterface> 勤務区分List(){

        WorkSubStatusCheckService my勤務状況判定 = new WorkSubStatusCheckService(my勤務状況);

        if(my勤務状況判定.isテレワーク()) {return テレワーク設定(); }
        if(my勤務状況判定.is出社())      {return 出社設定(); }
        if(my勤務状況判定.is非出社())     {return 非出社設定(); }
        else                          { my勤務区分list.clear(); }

        return  Collections.unmodifiableList(my勤務区分list);
    }

    private List<WorkDivisionInterface> テレワーク設定(){
        my勤務区分list.add(new WorkDivionAdapter(勤務区分.フル出勤));
        my勤務区分list.add(new WorkDivionAdapter(勤務区分.午前休));
        my勤務区分list.add(new WorkDivionAdapter(勤務区分.午後休));

        return  Collections.unmodifiableList(my勤務区分list);
    }
    private List<WorkDivisionInterface> 出社設定(){
        my勤務区分list.add(new WorkDivionAdapter(勤務区分.フル出勤));
        my勤務区分list.add(new WorkDivionAdapter(勤務区分.午前休));
        my勤務区分list.add(new WorkDivionAdapter(勤務区分.午後休));

        return  Collections.unmodifiableList(my勤務区分list);
    }
    private List<WorkDivisionInterface> 非出社設定(){
        my勤務区分list.add(new WorkDivionAdapter(勤務区分.週休日));
        my勤務区分list.add(new WorkDivionAdapter(勤務区分.休暇));
        my勤務区分list.add(new WorkDivionAdapter(勤務区分.欠勤));

        return  Collections.unmodifiableList(my勤務区分list);
    }
}