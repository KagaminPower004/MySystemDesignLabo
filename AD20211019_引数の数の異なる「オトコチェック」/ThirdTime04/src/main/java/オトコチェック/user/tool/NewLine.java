package オトコチェック.user.tool;

public class NewLine {
    private オトコチェック.business.tool.NewLine businessNewLine;

    public NewLine() {
        this.businessNewLine
                = new オトコチェック.business.tool.NewLine();
    }
    public NewLine(Integer 行数)    {
        this.businessNewLine
                = new オトコチェック.business.tool.NewLine(行数);
    }
    public final String executed() { return businessNewLine.executed(); }
    public static final String hiSpeedExecuted() { return System.lineSeparator(); }
}
