package roster.domain.model.daydivision;

import roster.domain.support.base.Check_Enabled_Object;

public class Check_DayDivision {
    final private DayDivision myDayDivision;

    public Check_DayDivision(DayDivision myDayDivision){ this.myDayDivision = myDayDivision; }

    public Boolean isEnabled(){
        // まとりょーしか!!
        return new Check_Enabled_Object(myDayDivision)
                .isEnabled();
    }

    public Boolean isNotEnabled(){
        return !this.isEnabled();
    }

}