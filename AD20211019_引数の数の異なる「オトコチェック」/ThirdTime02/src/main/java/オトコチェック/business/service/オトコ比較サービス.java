package オトコチェック.business.service;

import オトコチェック.domain.model.compare.otoko.オトコ二人比較区分;
import オトコチェック.domain.model.compare.otoko.オトコ三人比較区分;
import オトコチェック.domain.model.item.otoko.王子様;
import オトコチェック.domain.model.item.message.回答;

//比較サービス
public class オトコ比較サービス {

    private final int my人数;
    private final String my比較内容;

    public オトコ比較サービス( int 人数, String 比較内容 ){
        全人数比較可能判定サービス my比較可能判定 = new 全人数比較可能判定サービス(人数,比較内容);
        if(my比較可能判定.is全オトコ比較区分非該当()){ System.out.println("その値はオトコ比較サービスには存在しません"); }

        this.my人数 = 人数; this.my比較内容 = 比較内容;
    }

    public final 回答 二人比較(王子様 o1, 王子様 o2){
        二人比較可能判定サービス my比較可能判定 = new 二人比較可能判定サービス(my人数,my比較内容);
        if(my比較可能判定.is非該当()){ return new 回答(my比較可能判定.非該当箇所().回答()); }

        return オトコ二人比較区分.valueOf(my比較内容).compare(o1, o2);
    }

    public final 回答 三人比較(王子様 o1, 王子様 o2, 王子様 o3){
        三人比較可能判定サービス my比較可能判定 = new 三人比較可能判定サービス(my人数,my比較内容);
        if(my比較可能判定.is非該当()){ return new 回答(my比較可能判定.非該当箇所().回答()); }

        return オトコ三人比較区分.valueOf(my比較内容).threeCompare(o1,o2,o3);
    }
}