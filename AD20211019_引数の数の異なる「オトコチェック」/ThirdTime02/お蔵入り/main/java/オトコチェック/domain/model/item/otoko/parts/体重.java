package オトコチェック.domain.model.item.otoko.parts;

import オトコチェック.domain.model.item.otoko.parts.tool.非該当判断;

public class 体重 {
    private int 体重 = 0;
    private static final int 許容最大体重 = 1000;
    private static final int 許容最小体重 = 2;

    public 体重(int 体重){
        this.体重 = 体重;
    }

    public Boolean is非該当(){
        非該当判断 my非該当判断 = new 非該当判断(許容最大体重, 許容最小体重, 体重);
        return my非該当判断.is非該当();
    }

    public final int value(){
        return this.体重;
    }
}