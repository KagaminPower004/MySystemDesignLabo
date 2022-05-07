package roster.domain.support.tool;

import roster.domain.anticorruption.worksubstatus.WorkSubStatusInterface;

public class SeparatorLine implements WorkSubStatusInterface {
    private final String SeparatorLine = "---------------OR---------------";

    public SeparatorLine(){}

    public String name()        { return this.SeparatorLine; }
    public String description() { return this.SeparatorLine; }
}
