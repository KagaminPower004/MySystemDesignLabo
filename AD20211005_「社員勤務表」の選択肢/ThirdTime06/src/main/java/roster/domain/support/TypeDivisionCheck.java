package roster.domain.support;

import roster.domain.model.TypeDivision;

public class TypeDivisionCheck {

    private TypeDivision myTypeDivision;

    public TypeDivisionCheck(TypeDivision myTypeDivision){ this.myTypeDivision = myTypeDivision; }

    public Boolean isAvailable(){
        return myTypeDivision != null;
    }
}