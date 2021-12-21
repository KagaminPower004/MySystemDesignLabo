package 社員勤務表.business.tool;

import org.apache.commons.lang3.StringUtils;

public class NewLine {
    private static final String newLine = System.lineSeparator();
    private Integer 行数;

    public NewLine(){this.行数 = 1;}
    public NewLine(Integer 行数){this.行数 = 行数;}

    private static String makeLine(){ return newLine; }

    public String executed(){
        return StringUtils.repeat(makeLine(), this.行数);
    }
    public static String hiSpeedExecuted() { return System.lineSeparator(); }
}