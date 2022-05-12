package roster.domain.model.officedivision;

import roster.domain.support.base.Check_Enabled_Object;

public class Check_OfficeDivision {

    final private OfficeDivision myOfficeDivision;

    public Check_OfficeDivision(final OfficeDivision myOfficeDivision){ this.myOfficeDivision = myOfficeDivision; }

    public final Boolean isEnabled(){
        // まとりょーしか!!
        return new Check_Enabled_Object(myOfficeDivision)
                .isEnabled();
    }

    public final Boolean isNotEnabled(){
        return !this.isEnabled();
    }
}