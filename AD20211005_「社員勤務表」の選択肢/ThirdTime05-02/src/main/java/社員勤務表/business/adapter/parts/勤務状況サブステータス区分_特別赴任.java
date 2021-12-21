package 社員勤務表.business.adapter.parts;

import 社員勤務表.business.service.勤務状況サブステータス区分インターフェース;
import 社員勤務表.business.tool.NewLine;

public class 勤務状況サブステータス区分_特別赴任 implements 勤務状況サブステータス区分インターフェース {

    public 勤務状況サブステータス区分_特別赴任(){  }

    public final String チェック値(){ return "海外";}

    public final String 区分名(){
        return "特別赴任";
    }

    public final String 区分値(){
        return "サブステータス：海外";
    }

    public final String 補足説明(){
        return "国外の僻地で仕事をした状態を指します。今のところ、小須田部長のみ該当いたします。"
                + NewLine.hiSpeedExecuted()
                + "      (※原田社長より：がんばれ〜負けんな〜力の限り〜)"
                + NewLine.hiSpeedExecuted()
                + "      ～「特別赴任:海外」より引用(カッコ内は加筆箇所)";
    }
}