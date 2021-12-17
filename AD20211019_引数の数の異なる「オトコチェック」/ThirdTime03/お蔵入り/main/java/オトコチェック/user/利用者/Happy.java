package オトコチェック.user.利用者;

import オトコチェック.business.service.オトコ比較サービス;
import オトコチェック.domain.model.item.otoko.王子様;

public class Happy {
    public static void main(String args[]) {
        王子様 Ouji1 = new 王子様("じぃじ",180,68,70);
        王子様 Ouji2 = new 王子様("ぱぁぱ",172,71,41);
        王子様 Ouji3 = new 王子様("チェホンマン",218,160,40);

        オトコ比較サービス my体重比較 = new オトコ比較サービス(2,"体重");
        オトコ比較サービス my身長比較 = new オトコ比較サービス(3,"身長");

        String type = args[0];
        String winner = "";
        //If文スッキリ(⋈◍＞◡＜◍)。✧♡
        if(type.equals("痩せてる")){ winner = my体重比較.二人比較(Ouji1, Ouji2); }
        if(type.equals("背が高い")){ winner = my身長比較.三人比較(Ouji1, Ouji2, Ouji3); }

        System.out.println(winner + "大好き♪");

    }
}