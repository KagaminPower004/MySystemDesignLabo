package attendance_management.domain.support.base;

public class Check_Enabled_Object {

    private final Object myObject;

    public Check_Enabled_Object(final Object myObject){ this.myObject = myObject; }

    public final Boolean isEnabled(){
        return myObject != null;
    }
}
