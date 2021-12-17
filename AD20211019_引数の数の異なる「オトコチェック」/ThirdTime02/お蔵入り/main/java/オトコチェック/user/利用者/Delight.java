package オトコチェック.user.利用者;

import オトコチェック.business.service.オトコ比較サービス;
import オトコチェック.domain.model.item.otoko.王子様;

public class Delight {
    public static void main(String args[]) {
        王子様 候補1 = new 王子様("ぱぁぱ",172,71,41);
        王子様 候補2 = new 王子様("ぱぁぱ",172,71,41);
        王子様 候補3 = new 王子様("ぱぁぱ",172,71,41);

        オトコ比較サービス my体重比較 = new オトコ比較サービス(2,"体重");
        オトコ比較サービス my身長比較 = new オトコ比較サービス(2,"身長");

        String type = args[0];
        String winner = "";
        //If文スッキリ(⋈◍＞◡＜◍)。✧♡
        if(type.equals("痩せてる")){ winner = my体重比較.二人比較(候補1, 候補2); }
        if(type.equals("背が高い")){ winner = my身長比較.二人比較(候補1, 候補2); }

        System.out.println(winner + "大好き♪");

    }
}