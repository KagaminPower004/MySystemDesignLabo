package オトコチェック.domain.model.item.message;

import オトコチェック.domain.tool.非該当判断;

public record 回答( String 回答 ) {
    private static final int 許容最大文字数 = 100;
    private static final int 許容最小文字数 = 1;

    public Boolean is非該当(){
        非該当判断 my非該当判断 = new 非該当判断(許容最大文字数, 許容最小文字数, 回答.length());
        return my非該当判断.is非該当();
    }
}