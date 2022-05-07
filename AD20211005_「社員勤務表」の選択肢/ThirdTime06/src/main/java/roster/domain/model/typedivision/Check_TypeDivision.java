package roster.domain.model.typedivision;

import roster.domain.support.base.Check_Enabled_Object;

public class Check_TypeDivision {

    final private TypeDivision myTypeDivision;

    public Check_TypeDivision(TypeDivision myTypeDivision){ this.myTypeDivision = myTypeDivision; }

    public Boolean isEnabled(){
        // まとりょーしか!!
        return new Check_Enabled_Object(myTypeDivision)
                .isEnabled();
    }

    public Boolean isNotEnabled(){
        return !this.isEnabled();
    }
}