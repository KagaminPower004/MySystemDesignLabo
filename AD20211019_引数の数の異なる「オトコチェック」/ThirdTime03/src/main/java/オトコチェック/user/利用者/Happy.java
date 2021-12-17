package オトコチェック.user.利用者;

import オトコチェック.business.service.オトコ比較サービス;
import オトコチェック.business.adapter.オトコアダプター;
import オトコチェック.user.tool.NewLine;

public class Happy {
    public static void main(String args[]) {
        オトコアダプター 候補1 = new オトコアダプター("じぃじ",180,68,70);
        オトコアダプター 候補2 = new オトコアダプター("ぱぁぱ",172,71,41);
        オトコアダプター 候補3 = new オトコアダプター("チェホンマン",218,160,40);

        オトコ比較サービス my体重比較 = new オトコ比較サービス(2,"体重");
        オトコ比較サービス my身長比較 = new オトコ比較サービス(3,"身長");

        String type = args[0];

        //If文スッキリ(⋈◍＞◡＜◍)。✧♡
        if (type.equals("痩せてる")){ System.out.println( my体重比較.二人比較( 候補1, 候補2 ).アダプタ回答() + NewLine.hiSpeedExecuted() + "大好き♪" ); }
        if (type.equals("やせてる")){ System.out.println( my体重比較.二人比較( 候補1, 候補2 ).アダプタ回答() + NewLine.hiSpeedExecuted() + "大好き♪" ); }
        if (type.equals("背が高い")){ System.out.println( my身長比較.三人比較( 候補1, 候補2, 候補3 ).アダプタ回答() + "大好き♪" ); }
    }
}