package オトコチェック.domain.model.item.otoko.parts;

import オトコチェック.domain.model.item.otoko.parts.tool.非該当判断;

public class 身長 {
    private int 身長 = 0;
    private static final int 許容最大身長 = 300;
    private static final int 許容最小身長 = 20;

    public 身長(int 身長){
        this.身長 = 身長;
    }

    public Boolean is非該当(){
        非該当判断 my非該当判断 = new 非該当判断(許容最大身長, 許容最小身長, 身長);
        return my非該当判断.is非該当();
    }

    public final int value(){
        return this.身長;
    }
}