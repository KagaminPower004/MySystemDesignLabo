package roster.domain.support;

import roster.domain.anticorruption.worksubstatus.WorkSubStatusInterface;

public class SeparatorLine implements WorkSubStatusInterface {
    private String SeparatorLine = "---------------OR---------------";

    public SeparatorLine(){};

    public String name()   { return this.SeparatorLine; };
    public String description() { return this.SeparatorLine; };

}
