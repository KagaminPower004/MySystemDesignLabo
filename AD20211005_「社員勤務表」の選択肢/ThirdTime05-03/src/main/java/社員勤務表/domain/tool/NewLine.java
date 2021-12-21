package 社員勤務表.domain.tool;

public class NewLine extends 社員勤務表.business.tool.NewLine {
    public NewLine()               { super(1); }
    public NewLine(Integer 行数)    { super(行数); }
    public final String executed() { return super.executed(); }
}