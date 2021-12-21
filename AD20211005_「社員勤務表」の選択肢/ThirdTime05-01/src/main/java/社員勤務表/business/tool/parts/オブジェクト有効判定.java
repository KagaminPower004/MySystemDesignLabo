package 社員勤務表.business.tool.parts;

public class オブジェクト有効判定 {

    private Object myObject;

    public オブジェクト有効判定(Object myObject){ this.myObject = myObject; }

    public Boolean is有効(){
        return myObject != null;
    }

}