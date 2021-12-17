package オトコチェック.user.利用者;

import オトコチェック.user.tool.NewLine;
import オトコチェック.business.service.オトコ比較サービス;
import オトコチェック.business.adapter.オトコアダプター;
import オトコチェック.business.adapter.回答アダプター;

public class Delight {
    public static void main(String[] args) {
//        オトコアダプター 候補1 = new オトコアダプター("じぃじ",180,68,70);
        オトコアダプター 候補2 = new オトコアダプター("ぱぁぱ",172,71,41);
//        オトコアダプター 候補3 = new オトコアダプター("チェホンマン",218,160,40);

        オトコ比較サービス my体重比較 = new オトコ比較サービス(2,"体重");
        オトコ比較サービス my身長比較 = new オトコ比較サービス(3,"身長");

        String type = args[0];

        //If文スッキリ(⋈◍＞◡＜◍)。✧♡
        if (type.equals("瘦せてる")){ System.out.println( My回答(my体重比較.二人比較( 候補2, 候補2 )).アダプタ回答()); }
        if (type.equals("やせてる")){ System.out.println( My回答(my体重比較.二人比較( 候補2, 候補2 )).アダプタ回答()); }
        if (type.equals("背が高い")){ System.out.println( My回答(my身長比較.三人比較( 候補2, 候補2, 候補2 )).アダプタ回答()); }
    }

    private static 回答アダプター My回答(回答アダプター 元回答アダプター){
        //「元回答アダプター」を基に、自分なりにアレンジした回答インスタンスを新たに作る。
        return new 回答アダプター(元回答アダプター.アダプタ回答() + new NewLine(8).executed() + "大好き♪");
    }
}