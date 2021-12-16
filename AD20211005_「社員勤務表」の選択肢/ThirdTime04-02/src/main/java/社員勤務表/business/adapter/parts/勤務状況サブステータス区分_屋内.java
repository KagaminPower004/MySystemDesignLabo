package 社員勤務表.business.adapter.parts;

import 社員勤務表.business.tool.屋内区分判定;
import 社員勤務表.business.service.勤務状況サブステータス区分インターフェース;
import 社員勤務表.domain.model.屋内区分;

public class 勤務状況サブステータス区分_屋内 implements 勤務状況サブステータス区分インターフェース {
    private 屋内区分 my屋内区分;

    public 勤務状況サブステータス区分_屋内(屋内区分 my屋内区分) { this.my屋内区分 = my屋内区分; }

    public final String name(){
        if( new 屋内区分判定(my屋内区分).is有効() ){ return my屋内区分.name(); }
        else{ return "該当する値がございません"; }
    }

    public final String 補足説明(){
        if( new 屋内区分判定(my屋内区分).is有効() ){ return my屋内区分.詳細説明(); }
        else{ return "該当する値がございません"; }
    }
}