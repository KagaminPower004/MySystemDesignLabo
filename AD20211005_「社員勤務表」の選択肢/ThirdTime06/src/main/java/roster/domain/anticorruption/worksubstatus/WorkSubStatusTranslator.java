package roster.domain.anticorruption.worksubstatus;

import roster.domain.model.TypeDivision;
import roster.domain.model.DayDivision;
import roster.domain.model.OfficeDivision;

class WorkSubStatusTranslator {

    final private WorkSubStatusAdapter myWorkSubStatusAdapter;
    final private InsideDescriptionTranslator myInsideDescriptionTranslator
            = new InsideDescriptionTranslator();
    final private String myDescription;

    WorkSubStatusTranslator(WorkSubStatusAdapter myWorkSubStatusAdapter){
        this.myWorkSubStatusAdapter = myWorkSubStatusAdapter;

        //区分値ごとに振り分け
        //Enumのswitch:
        // defaultを排すると、全網羅しないとエラーになってくれるらしい。
        String myDescription = "";
        switch (myWorkSubStatusAdapter) {
            case INSIDE ->
                    myDescription = myInsideDescriptionTranslator.done(); //長文なので外だし

            case OUTSIDE ->
                    myDescription = OfficeDivision.OUTSIDE.comments(); //モデルそのまま

            case WORKING ->
                    myDescription = DayDivision.WORKING.explanation(); //モデルそのまま

            case NON_WORKING ->
                    myDescription = DayDivision.NON_WORKING.explanation(); //モデルそのまま

            case INDOOR ->
                    myDescription = TypeDivision.INDOOR.detailDescription(); //モデルそのまま

            case OUTDOOR ->
                    myDescription = TypeDivision.OUTDOOR.detailDescription(); //モデルそのまま

            case NON_DOMESTIC ->
                    myDescription = "okay" ; //暫定値
        };

        //なんかミュータブルだけど、とりま未初期化エラー消えたんでOK！
        this.myDescription = myDescription;
    }

    final String description(){
        //念のため、例外キャッチアップ
        if(myDescription.isEmpty()){
            throw new RuntimeException(
                      "There is no description of sentence."
                    + "[Division value:" + myWorkSubStatusAdapter.name() + "]"
            );
        }
        return myDescription;
    }
}
