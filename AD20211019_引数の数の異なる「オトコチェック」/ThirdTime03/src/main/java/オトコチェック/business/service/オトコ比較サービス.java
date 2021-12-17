package オトコチェック.business.service;

import オトコチェック.business.adapter.オトコアダプター;
import オトコチェック.business.adapter.回答アダプター;
import オトコチェック.domain.model.compare.otoko.オトコ二人比較区分;
import オトコチェック.domain.model.compare.otoko.オトコ三人比較区分;
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

    public final 回答アダプター 二人比較(オトコアダプター o1, オトコアダプター o2){
        二人比較可能判定サービス my比較可能判定 = new 二人比較可能判定サービス(my人数,my比較内容);
        if(my比較可能判定.is非該当()){ return new 回答アダプター(my比較可能判定.非該当箇所().回答()); }

        return new 回答アダプター(
                オトコ二人比較区分
                        .valueOf(my比較内容)
                        .compare(o1.王子様(), o2.王子様())
                        .回答()
        );
    }

    public final 回答アダプター 三人比較(オトコアダプター o1, オトコアダプター o2, オトコアダプター o3){
        三人比較可能判定サービス my比較可能判定 = new 三人比較可能判定サービス(my人数,my比較内容);
        if(my比較可能判定.is非該当()){ return new 回答アダプター(my比較可能判定.非該当箇所().回答()); }

        return new 回答アダプター(
                        オトコ三人比較区分
                                .valueOf(my比較内容)
                                .threeCompare(o1.王子様(),o2.王子様(),o3.王子様())
                                .回答()
        );
    }
}