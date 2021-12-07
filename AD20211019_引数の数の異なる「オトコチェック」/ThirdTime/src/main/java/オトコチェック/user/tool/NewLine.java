package オトコチェック.user.tool;

public class NewLine extends オトコチェック.business.tool.NewLine {
    public NewLine()               { super(1); }
    public NewLine(Integer 行数)    { super(行数); }
    public final String executed() { return super.executed(); }
}
