package roster.domain.support.tool;

import org.apache.commons.lang3.StringUtils;

public class NewLine {
    private static final String newLine = System.lineSeparator();
    private final Integer rowCount;

    public NewLine(){this.rowCount = 1;}
    public NewLine(final Integer rowCount){this.rowCount = rowCount;}

    private static String makeLine(){ return newLine; }

    public String executed(){
        return StringUtils.repeat(makeLine(), this.rowCount);
    }
    public static String hiSpeedExecuted() { return makeLine(); }
}
