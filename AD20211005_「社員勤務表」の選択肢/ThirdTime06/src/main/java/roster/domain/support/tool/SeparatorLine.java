package roster.domain.support.tool;

import roster.domain.anticorruption.worksubstatus.Interface_WorkSubStatus;

public class SeparatorLine implements Interface_WorkSubStatus {
    private final String SeparatorLine = "---------------OR---------------";

    public SeparatorLine(){}

    public final String name()        { return this.SeparatorLine; }
    public final String description() { return this.SeparatorLine; }
}
