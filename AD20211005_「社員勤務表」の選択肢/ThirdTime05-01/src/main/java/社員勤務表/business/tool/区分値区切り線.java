package 社員勤務表.business.tool;

import 社員勤務表.business.service.勤務状況サブステータス区分インターフェース;

public class 区分値区切り線 implements 勤務状況サブステータス区分インターフェース {

    private String 区切り線 = "------------または-------------------";

    public 区分値区切り線(){};

    public String チェック値(){ return this.区切り線; }
    public String 区分名()   { return this.区切り線.getClass().getSimpleName(); };
    public String 区分値()   { return this.区切り線; };

    public String 補足説明() { return this.区切り線; };

}
