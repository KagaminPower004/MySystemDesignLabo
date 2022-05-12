package roster.domain.model.typedivision;

import roster.domain.support.base.Check_Enabled_Object;

public class Check_TypeDivision {

    final private TypeDivision myTypeDivision;

    public Check_TypeDivision(final TypeDivision myTypeDivision){ this.myTypeDivision = myTypeDivision; }

    public final Boolean isEnabled(){
        // まとりょーしか!!
        return new Check_Enabled_Object(myTypeDivision)
                .isEnabled();
    }

    public final Boolean isNotEnabled(){
        return !this.isEnabled();
    }
}