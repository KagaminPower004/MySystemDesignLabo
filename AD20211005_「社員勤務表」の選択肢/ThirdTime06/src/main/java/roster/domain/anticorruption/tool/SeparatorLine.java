package roster.domain.anticorruption.tool;

import roster.domain.anticorruption.service.WorkSubStatusInterface;

public class SeparatorLine implements WorkSubStatusInterface {
    private String SeparatorLine = "---------------OR---------------";

    public SeparatorLine(){};

    public String name()   { return this.SeparatorLine; };
    public String description() { return this.SeparatorLine; };

}
