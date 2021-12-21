package 社員勤務表.business.service;

import 社員勤務表.business.adapter.勤務区分アダプター;
import 社員勤務表.business.tool.NewLine;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class 勤務区分問合せサービス {

    private String my勤務状況 = "";
    private List<勤務区分インターフェース> my勤務区分list = new ArrayList<>();

    public 勤務区分問合せサービス(String my勤務状況){
        勤務状況判定サービス my勤務状況判定 = new 勤務状況判定サービス(my勤務状況);

        if(my勤務状況判定.is非該当()) { System.out.println("その値は勤務状況には存在しません"); }
        else                      { this.my勤務状況 = my勤務状況; }
    }

    public List<勤務区分インターフェース> 勤務区分List(){
        勤務状況判定サービス my勤務状況判定 = new 勤務状況判定サービス(my勤務状況);

        if(my勤務状況判定.isテレワーク())  {return テレワーク設定(); }
        if(my勤務状況判定.is出社())       {return 出社設定(); }
        if(my勤務状況判定.is非出社())     {return 非出社設定(); }
        else                          { my勤務区分list.clear(); }

        return  Collections.unmodifiableList(my勤務区分list);
    }

    public final String 問合せ回答(){

        //初期化
        my勤務区分list = this.勤務区分List();

        //加工
        final String _result01     = "『勤務状況』が" + my勤務状況 + "の場合、該当する『勤務区分』は"
                + NewLine.hiSpeedExecuted();

        final String _result02work = my勤務区分list
                .stream()
                .map( list要素 -> " ●" + list要素.name() )
                .collect(Collectors.toList())
                .toString();
        //↑ cf)[ ●list要素.name(), ●list要素.name(), ●list要素.name()...]

        final String _result02     = _result02work
                .replace("["," ")
                .replace("]","")
                .replace(",",NewLine.hiSpeedExecuted());
        ;
        //↑ cf)
        // ●list要素.name()
        // ●list要素.name()
        // ●list要素.name()
        // ...

        final String _result03     = NewLine.hiSpeedExecuted()
                + "です。"
                ;

        //連結
        final String _result = _result01 + _result02 + _result03;

        //結果を出力
        return _result;
    }

    private List<勤務区分インターフェース> テレワーク設定(){
        my勤務区分list.add(勤務区分アダプター.フル出勤);
        my勤務区分list.add(勤務区分アダプター.午前休  );
        my勤務区分list.add(勤務区分アダプター.午後休  );

        return  Collections.unmodifiableList(my勤務区分list);
    }
    private List<勤務区分インターフェース> 出社設定(){
        my勤務区分list.add(勤務区分アダプター.フル出勤);
        my勤務区分list.add(勤務区分アダプター.午前休  );
        my勤務区分list.add(勤務区分アダプター.午後休  );

        return  Collections.unmodifiableList(my勤務区分list);
    }
    private List<勤務区分インターフェース> 非出社設定(){
        my勤務区分list.add(勤務区分アダプター.週休日);
        my勤務区分list.add(勤務区分アダプター.休暇  );
        my勤務区分list.add(勤務区分アダプター.欠勤  );

        return  Collections.unmodifiableList(my勤務区分list);
    }
}