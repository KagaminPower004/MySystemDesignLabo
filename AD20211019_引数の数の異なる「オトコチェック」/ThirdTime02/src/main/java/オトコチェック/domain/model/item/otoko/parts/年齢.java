package オトコチェック.domain.model.item.otoko.parts;

import オトコチェック.domain.tool.非該当判断;

public class 年齢 {
    private int 年齢 = 0;
    private static final int 許容最高年齢 = 150;
    private static final int 許容最低年齢 = 0;

    public 年齢(int age){
        this.年齢 = age;
    }

    public Boolean is非該当(){
        非該当判断 my非該当判断 = new 非該当判断(許容最高年齢, 許容最低年齢, 年齢);
        return my非該当判断.is非該当();
    }

    public final int value(){
        return this.年齢;
    }
}