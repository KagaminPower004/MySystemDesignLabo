package 社員勤務表.domain.tool;

public class 区分値区切り線 extends 社員勤務表.business.tool.区分値区切り線 {

    private String 区切り線 = "------------または-------------------";

    public 区分値区切り線(){};

    public String name()   { return super.name(); }
    public String 区分名()   { return super.区分名(); };
    public String 区分値()   { return super.区分値(); };
    public String 補足説明() { return super.補足説明(); };
}
