package オトコチェック.business.adapter;

import オトコチェック.domain.model.item.otoko.王子様;

public class オトコアダプター {
    private final 王子様 my王子様;

    public オトコアダプター(String お名前, int 身長, int 体重, int 年齢){
        my王子様 = new 王子様(お名前, 身長, 体重, 年齢);
    }

    public final 王子様 王子様(){ return this.my王子様;}
}
