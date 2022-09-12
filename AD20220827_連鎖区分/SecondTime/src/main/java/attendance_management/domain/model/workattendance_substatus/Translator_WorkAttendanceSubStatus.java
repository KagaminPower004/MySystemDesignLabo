package attendance_management.domain.model.workattendance_substatus;

import attendance_management.domain.model.workday_division.WorkDayDivision;
import attendance_management.domain.model.worktype_division.WorkTypeDivision;
import attendance_management.domain.model.workoffice_division.WorkOfficeDivision;

class Translator_WorkAttendanceSubStatus {
    final private MultiAdapter_WorkAttendanceSubStatus myAdapter;
    final private String                               myDescription;

    Translator_WorkAttendanceSubStatus(final MultiAdapter_WorkAttendanceSubStatus myAdapter)
    {
        this.myAdapter = myAdapter;

        //区分値ごとに振り分け
        //Enumのswitch:
        //    defaultを排すると、全網羅しないとエラーになってくれるらしい。
        String myWorkingDescription = "";
        final Translator_InsideDescription myTranslatedInsideDescription = new Translator_InsideDescription();
        switch (this.myAdapter) {
            case INSIDE ->
                    myWorkingDescription = myTranslatedInsideDescription.done(); //長文なので外だし

            case OUTSIDE ->
                    myWorkingDescription = WorkOfficeDivision.OUTSIDE.comments(); //モデルそのまま

            case WORKING ->
                    myWorkingDescription = WorkDayDivision.WORKING.explanation(); //モデルそのまま

            case NON_WORKING ->
                    myWorkingDescription = WorkDayDivision.NON_WORKING.explanation(); //モデルそのまま

            case INDOOR ->
                    myWorkingDescription = WorkTypeDivision.INDOOR.detailDescription(); //モデルそのまま

            case OUTDOOR ->
                    myWorkingDescription = WorkTypeDivision.OUTDOOR.detailDescription(); //モデルそのまま

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
                    + "[Division value:" + myAdapter.name() + "]"
            );
        }
        return myDescription;
    }
}