package roster.domain.anticorruption.worksubstatus;

import roster.domain.model.TypeDivision;
import roster.domain.model.DayDivision;
import roster.domain.model.OfficeDivision;

class WorkSubStatusTranslator {

    final private WorkSubStatusAdapter myWorkSubStatusAdapter;
    final private InsideDescriptionTranslator myInsideDescriptionTranslator
            = new InsideDescriptionTranslator();

    WorkSubStatusTranslator(WorkSubStatusAdapter myWorkSubStatusAdapter){
        this.myWorkSubStatusAdapter = myWorkSubStatusAdapter;
    }

    final String description(){

        //Enumのswitch:
        // defaultを排すると、全網羅しないとエラーになってくれるらしい。
        final String myDescription =
        switch (myWorkSubStatusAdapter) {
            case INSIDE  -> myInsideDescriptionTranslator.done(); //長文なので外だし
            case OUTSIDE -> OfficeDivision.OUTSIDE.comments();
            case WORKING     -> DayDivision.WORKING.explanation();
            case NON_WORKING -> DayDivision.NON_WORKING.explanation();
            case INDOOR -> TypeDivision.INDOOR.detailDescription();
            case OUTDOOR -> TypeDivision.OUTDOOR.detailDescription();
            case NON_DOMESTIC -> "okay" ;
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
