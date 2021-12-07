package オトコチェック.user.利用者;

import オトコチェック.user.tool.NewLine;
import オトコチェック.business.service.オトコ比較サービス;
import オトコチェック.domain.model.item.otoko.王子様;
import オトコチェック.domain.model.item.message.回答;

public class Delight {
    public static void main(String[] args) {
//        王子様 候補1 = new 王子様("じぃじ",180,68,70);
        王子様 候補2 = new 王子様("ぱぁぱ",172,71,41);
//        王子様 候補3 = new 王子様("チェホンマン",218,160,40);

        オトコ比較サービス my体重比較 = new オトコ比較サービス(2,"体重");
        オトコ比較サービス my身長比較 = new オトコ比較サービス(3,"身長");

        String type = args[0];

        //If文スッキリ(⋈◍＞◡＜◍)。✧♡
        if (type.equals("痩せてる")){ System.out.println( My回答(my体重比較.二人比較( 候補2, 候補2 )).回答()); }
        if (type.equals("背が高い")){ System.out.println( My回答(my身長比較.三人比較( 候補2, 候補2, 候補2 )).回答()); }
    }

    private static 回答 My回答(回答 元回答){
        //「元回答」を基に、自分なりにアレンジした回答インスタンスを新たに作る。
        return new 回答(元回答.回答() + new NewLine(8).executed() + "大好き♪");
    }
}