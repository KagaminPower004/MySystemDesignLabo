package roster.domain.anticorruption.translator;

import roster.domain.anticorruption.adapter.WorkSubStatusAdapter;
import roster.domain.model.屋内区分;
import roster.domain.model.状態区分;
import roster.domain.model.LocationDivision;

public class WorkSubStatusDescriptionTranslator {

    final private WorkSubStatusAdapter myWorkSubStatusAdapter;
    final private InsideDescriptionTranslator myInsideDescriptionTranslator
            = new InsideDescriptionTranslator();

    public WorkSubStatusDescriptionTranslator(WorkSubStatusAdapter myWorkSubStatusAdapter){
        this.myWorkSubStatusAdapter = myWorkSubStatusAdapter;
    }

    public final String description(){

        //Enumのswitch:
        // defaultを排すると、全網羅しないとエラーになってくれるらしい。
        final String myDescription =
        switch (myWorkSubStatusAdapter) {
            case INSIDE  -> myInsideDescriptionTranslator.translated(); //長文なので外だし
            case OUTSIDE -> LocationDivision.OUTSIDE.comments();
            case 稼働     -> 状態区分.稼働.補足説明();
            case 非稼働   -> 状態区分.非稼働.補足説明();
            case 内勤     -> 屋内区分.内勤.詳細説明();
            case 外勤     -> 屋内区分.外勤.詳細説明();
            case 国外     -> "okay" ;
         };

        //念のため、例外キャッチアップ
        if(myDescription.isEmpty()){
            throw new RuntimeException(
                      "補足説明の記述がございません。"
                    + "[区分値:" + myWorkSubStatusAdapter.name() + "]"
            );
        }

        return myDescription;
    }
}
