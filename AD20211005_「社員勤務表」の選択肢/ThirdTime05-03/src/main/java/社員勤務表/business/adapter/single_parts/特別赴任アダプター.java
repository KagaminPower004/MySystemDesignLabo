package 社員勤務表.business.adapter.single_parts;

import 社員勤務表.business.service.勤務状況サブ区分インターフェース;
import 社員勤務表.business.tool.NewLine;

//※まだモデル化していない部品
public class 特別赴任アダプター implements 勤務状況サブ区分インターフェース {

    public static final 勤務状況サブ区分インターフェース 海外 = new 特別赴任アダプター();

    public 特別赴任アダプター(){  }

    public final String name(){ return "海外";}

    public final String 区分名(){
        return "特別赴任";
    }

    public final String 区分値(){
        return "海外" + " ※";
    }

    public final String 補足説明(){
        return "国外の僻地で仕事をした状態を指します。今のところ、小須田部長のみ該当いたします。"
                + NewLine.hiSpeedExecuted()
                + "      (※原田社長より：がんばれ〜負けんな〜力の限り〜)"
                ;
    }
}