package roster.domain.anticorruption.worksubstatus;

import roster.domain.model.typedivision.TypeDivision;
import roster.domain.model.daydivision.DayDivision;
import roster.domain.model.officedivision.OfficeDivision;

class Translator_WorkSubStatus {
    final private MultiAdapter_WorkSubStatus myWorkSubStatusAdapter;
    final private String                     myDescription;

    Translator_WorkSubStatus(final MultiAdapter_WorkSubStatus myWorkSubStatusAdapter){
        this.myWorkSubStatusAdapter = myWorkSubStatusAdapter;

        //区分値ごとに振り分け
        //Enumのswitch:
        //    defaultを排すると、全網羅しないとエラーになってくれるらしい。
        String myWorkingDescription = "";
        Translator_InsideDescription myTranslatedInsideDescription = new Translator_InsideDescription();
        switch (this.myWorkSubStatusAdapter) {
            case INSIDE ->
                    myWorkingDescription = myTranslatedInsideDescription.done(); //長文なので外だし

            case OUTSIDE ->
                    myWorkingDescription = OfficeDivision.OUTSIDE.comments(); //モデルそのまま

            case WORKING ->
                    myWorkingDescription = DayDivision.WORKING.explanation(); //モデルそのまま

            case NON_WORKING ->
                    myWorkingDescription = DayDivision.NON_WORKING.explanation(); //モデルそのまま

            case INDOOR ->
                    myWorkingDescription = TypeDivision.INDOOR.detailDescription(); //モデルそのまま

            case OUTDOOR ->
                    myWorkingDescription = TypeDivision.OUTDOOR.detailDescription(); //モデルそのまま

            case NON_DOMESTIC ->
                    myWorkingDescription = "okay" ; //暫定値
        }

        //なんかミュータブルだけど、とりま未初期化エラー消えたんでOK！
        this.myDescription = myWorkingDescription;
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
