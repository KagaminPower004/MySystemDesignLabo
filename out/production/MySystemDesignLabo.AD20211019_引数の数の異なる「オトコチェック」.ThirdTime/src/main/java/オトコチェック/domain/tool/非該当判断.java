package オトコチェック.domain.tool;

public class 非該当判断 {
    private Integer _max;
    private Integer _minimum;
    private Integer _value;

    public 非該当判断(Integer _max, Integer _minimum, Integer _value){
        this._max = _max;
        this._minimum = _minimum;
        this._value = _value;
    }

    public Boolean is非該当(){

        if( this._value >= _max)    { return true; }
        if( this._value < _minimum) { return true; }
        else { return false; }

    }
}