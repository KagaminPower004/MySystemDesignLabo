package attendance_management.domain.model.workattendance_substatus.check_behavior;

import attendance_management.domain.model.workattendance_substatus.WorkAttendanceSubStatus;
import attendance_management.domain.model.workattendance_substatus.Interface_WorkAttendanceSubStatus;
import attendance_management.domain.model.workstyle_division.WorkStyleDivision;

import java.util.stream.Collectors;

public class Actor_Worker {
    public static void main(final String[] args){

        //※正常系ひんしつてすと(※回答メッセージ出力)
        checkCreatedAnswer();
        //※正常系ひんしつてすと(※区分値りすと確認)
        checkCreatedList();

        //※異常系

    }

    private static void checkCreatedAnswer(){
        //全パラメータ網羅 ※なぜ今まで気付けなかったのだろう。。。Orz
        //　※用途：『社員勤務表』アプリケーションのヘルプ機能など
        // (※画面部品オブジェクトをマウスホイールするとうっすら出てくるやつとか)
        // 参考)https://hikari-blog.com/enum-loop/
        System.out.println( "*******Start to check method of [answer()] !!*******");
        for(WorkStyleDivision myWorkingWorkStyle :WorkStyleDivision.values()){
            String myWorkStyle = myWorkingWorkStyle.name();
            System.out.println( "-------Start to check [" + myWorkStyle + "] !!-------");
            answerWorkAttendanceSubStatus(myWorkStyle);
            answerDescriptionOfWorkAttendanceSubStatus(myWorkStyle);
        }
    }

    private static void checkCreatedList(){
        //全リストの全区分値の内容確認！
        // ※用途：画面上のラベルまたはコンボボックスオブジェクト、みたいなやつにぶっこむなど
        // 参考)https://hikari-blog.com/enum-loop/
        System.out.println( "*******Start to check method of [List()] !!*******");
        for(WorkStyleDivision myWorkingWorkStyle :WorkStyleDivision.values()){
            String myWorkStyle = myWorkingWorkStyle.name();
            System.out.println( "-------Start to check [" + myWorkStyle + "] !!-------");
            outputCreatedList(myWorkStyle);
        }
    }

    private static void answerWorkAttendanceSubStatus(final String myWorkStyle){
        final String myAnswerMessage
                = new WorkAttendanceSubStatus(myWorkStyle)
                    .answer();

        System.out.println(myAnswerMessage);
    }
    private static void answerDescriptionOfWorkAttendanceSubStatus(final String myWorkStyle){
        final String myAnswerMessage
                = new WorkAttendanceSubStatus(myWorkStyle)
                    .describe();

        System.out.println(myAnswerMessage);
    }
    private static void outputCreatedList(final String myWorkStyle){
            System.out.println
                    (
                            //参考)https://itsakura.com/java-stream#s12
                            new WorkAttendanceSubStatus(myWorkStyle)
                                    .toList()
                                    .stream()
                                    //※参考)『::』の部分は『メソッド参照』
                                    // https://atmarkit.itmedia.co.jp/ait/articles/1407/28/news023_3.html
                                    .map(Interface_WorkAttendanceSubStatus::name)
                                    .collect(Collectors.toList())
                    );
        }
}