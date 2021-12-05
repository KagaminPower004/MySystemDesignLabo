package オトコチェック.business.service;

import オトコチェック.business.tool.NewLine;
import オトコチェック.domain.model.item.message.回答;

public class 全人数比較可能判定サービス {
    private final int my人数;
    private final String my比較内容;

    public 全人数比較可能判定サービス( int 人数, String 比較内容 ){
        this.my人数 = 人数;
        this.my比較内容 = 比較内容;
    }

    private Boolean isオトコ二人比較区分非該当() {
        return new 二人比較可能判定サービス(my人数,my比較内容).is非該当();
    }

    private Boolean isオトコ三人比較区分非該当() {
        return new 三人比較可能判定サービス(my人数,my比較内容).is非該当();
    }

    public Boolean is全オトコ比較区分非該当(){
        return isオトコ二人比較区分非該当() && isオトコ三人比較区分非該当();
    }

    private 回答 二人比較非該当箇所(){
        return new 二人比較可能判定サービス(my人数,my比較内容).非該当箇所();
    }

    private 回答 三人比較非該当箇所(){
        return new 三人比較可能判定サービス(my人数,my比較内容).非該当箇所();
    }

    public 回答 全オトコ比較非該当箇所(){
        return new 回答(
                  二人比較非該当箇所().回答()
                + new NewLine().executed()
                + 三人比較非該当箇所().回答()
                );
    }
}