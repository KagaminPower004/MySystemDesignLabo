package roster.domain.model.styledivision;

import roster.domain.support.base.Check_Enabled_Object;

public class Check_StyleDivision {

    final private StyleDivision myStyleDivision;

    public Check_StyleDivision(final StyleDivision myStyleDivision){ this.myStyleDivision = myStyleDivision; }

    public final Boolean isEnabled(){
        // まとりょーしか!!
        return new Check_Enabled_Object(myStyleDivision)
                .isEnabled();
    }

    public final Boolean isNotEnabled(){
        return !this.isEnabled();
    }
}