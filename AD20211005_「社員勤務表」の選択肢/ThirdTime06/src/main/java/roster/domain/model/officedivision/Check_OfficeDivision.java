package roster.domain.model.officedivision;

import roster.domain.support.base.Check_Enabled_Object;

public class Check_OfficeDivision {

    final private OfficeDivision myOfficeDivision;

    public Check_OfficeDivision(OfficeDivision myOfficeDivision){ this.myOfficeDivision = myOfficeDivision; }

    public Boolean isEnabled(){
        // まとりょーしか!!
        return new Check_Enabled_Object(myOfficeDivision)
                .isEnabled();
    }

    public Boolean isNotEnabled(){
        return !this.isEnabled();
    }
}