package オトコチェック.domain.model.item.otoko.parts;

import オトコチェック.domain.tool.非該当判断;

public class  お名前 {
    private String お名前 = "(名無しの権兵衛)";
    private static final int 許容最大文字数 = 30;
    private static final int 許容最小文字数 = 0;

    public お名前(String お名前){
        this.お名前 = お名前;
    }

    public Boolean is非該当(){
        非該当判断 my非該当判断 = new 非該当判断(許容最大文字数, 許容最小文字数, お名前.length());
        return my非該当判断.is非該当();
    }

    public final String value(){
        return this.お名前;
    }
}