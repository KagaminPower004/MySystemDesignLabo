package roster.domain.support.base;

public class Check_Enabled_Object {

    private final Object myObject;

    public Check_Enabled_Object(Object myObject){ this.myObject = myObject; }

    public Boolean isEnabled(){
        return myObject != null;
    }
}
