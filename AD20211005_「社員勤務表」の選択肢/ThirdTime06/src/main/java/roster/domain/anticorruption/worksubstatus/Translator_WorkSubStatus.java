package roster.domain.anticorruption.worksubstatus;

import roster.domain.model.typedivision.TypeDivision;
import roster.domain.model.daydivision.DayDivision;
import roster.domain.model.officedivision.OfficeDivision;

class Translator_WorkSubStatus {
    final private MultiAdapter_WorkSubStatus myWorkSubStatusAdapter;
    final private String                         myDescription;

    Translator_WorkSubStatus(MultiAdapter_WorkSubStatus myWorkSubStatusAdapter){
        this.myWorkSubStatusAdapter = myWorkSubStatusAdapter;

        //区分値ごとに振り分け
        //Enumのswitch:
        //    defaultを排すると、全網羅しないとエラーになってくれるらしい。
        String myDescription = "";
        Translator_InsideDescription myInsideDescriptionTranslator = new Translator_InsideDescription();
        switch (this.myWorkSubStatusAdapter) {
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
        }

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
