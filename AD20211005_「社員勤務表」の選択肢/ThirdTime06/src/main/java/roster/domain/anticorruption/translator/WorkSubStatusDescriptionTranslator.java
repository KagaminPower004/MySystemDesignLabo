package roster.domain.anticorruption.translator;

import roster.domain.anticorruption.adapter.WorkSubStatusAdapter;
import roster.domain.model.屋内区分;
import roster.domain.model.状態区分;
import roster.domain.model.LocationDivision;

public class WorkSubStatusDescriptionTranslator {

    private LocationDivision myLocationDivision;
    private 屋内区分 my屋内区分;
    private 状態区分 my状態区分;
    private WorkSubStatusAdapter myWorkSubStatusAdapter;

    public WorkSubStatusDescriptionTranslator(WorkSubStatusAdapter myWorkSubStatusAdapter){
        this.myWorkSubStatusAdapter = myWorkSubStatusAdapter;
    }

    public final String description(){
        return switch (myWorkSubStatusAdapter) {
            case INSIDE  -> new InsideDescriptionTranslator().description(); //長文なので外だし
            case OUTSIDE -> LocationDivision.OUTSIDE.comments();
            case 稼働     -> 状態区分.稼働.補足説明();
            case 非稼働   -> 状態区分.非稼働.補足説明();
            case 内勤     -> 屋内区分.内勤.詳細説明();
            case 外勤     -> 屋内区分.外勤.詳細説明();
            case 国外     -> "aaaa";
            default      -> "その値は勤務状況サブステータスにはございません。";
         };
    }
}
