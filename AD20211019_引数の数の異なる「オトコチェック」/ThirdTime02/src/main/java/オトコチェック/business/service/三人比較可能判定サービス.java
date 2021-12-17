package オトコチェック.business.service;

import オトコチェック.domain.model.compare.otoko.オトコ三人比較区分;
import オトコチェック.domain.model.item.message.回答;

public class 三人比較可能判定サービス {
    private final int my人数;
    private final String my比較内容;

    public 三人比較可能判定サービス( int 人数, String 比較内容 ){
        this.my人数 = 人数;
        this.my比較内容 = 比較内容;
    }

    public Boolean is非該当() {
        try {
              オトコ三人比較区分.valueOf(my比較内容);

              if (my人数 != 3) { return true; }

              return false;
            }
        catch (IllegalArgumentException e) {
              return true;
            }
    }

    public 回答 非該当箇所(){

        if(my人数 < 3){ return new 回答( "人数が足りません。設定した値：" + my人数 ); }
        if(my人数 > 3){ return new 回答( "人数が多すぎです。設定した値：" + my人数 ); }

        if(my人数 == 3 && is非該当()){ return new 回答( "比較内容が誤っております。設定した値：" + my比較内容 ); }

        else{ return new 回答("非該当箇所は見つかりませんでした。"); }
    }
}