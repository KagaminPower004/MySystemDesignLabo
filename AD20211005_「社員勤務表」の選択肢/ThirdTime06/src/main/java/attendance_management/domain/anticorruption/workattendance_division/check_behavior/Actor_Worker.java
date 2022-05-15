package attendance_management.domain.anticorruption.workattendance_division.check_behavior;

import attendance_management.domain
        .anticorruption.workattendance_division.AnswerService_WorkAttendanceDivision;
import attendance_management.domain.anticorruption.workattendance_division.Interface_WorkAttendanceDivision;
import attendance_management.domain.model.workstyle_division.WorkStyleDivision;

import java.util.stream.Collectors;

class Actor_Worker {
    public static void main(final String[] args) {
        //※正常系ひんしつてすと(※回答メッセージ出力)
        normalAnswer();

        checkCreatedList();

        //※異常系
    }

    private static void normalAnswer(){
        //全パラメータ網羅 ※なぜ今まで気付けなかったのだろう。。。Orz
        //　※用途：『社員勤務表』アプリケーションのヘルプ機能など
        // (※画面部品オブジェクトをマウスホイールするとうっすら出てくるやつとか)
        // 参考)https://hikari-blog.com/enum-loop/
        for(WorkStyleDivision myWorkingWorkStyle :WorkStyleDivision.values()){
            String myWorkStyle = myWorkingWorkStyle.name();
            System.out.println( "-------Start to check [" + myWorkStyle + "] !!-------");
            answer(myWorkStyle);
        }
    }

    private static void checkCreatedList(){
        //全リストの全区分値の内容確認！
        // ※用途：画面上のラベルまたはコンボボックスオブジェクト、みたいなやつにぶっこむなど
        // 参考)https://hikari-blog.com/enum-loop/
        for(WorkStyleDivision myWorkingWorkStyle :WorkStyleDivision.values()){
            String myWorkStyle = myWorkingWorkStyle.name();
            System.out.println( "-------Start to check [" + myWorkStyle + "] !!-------");
            System.out.println
                    (
                            //参考)https://itsakura.com/java-stream#s12
                            new AnswerService_WorkAttendanceDivision(myWorkStyle)
                                    .createList()
                                    .stream()
                                    //※参考)『::』の部分は『メソッド参照』
                                    // https://atmarkit.itmedia.co.jp/ait/articles/1407/28/news023_3.html
                                    .map(Interface_WorkAttendanceDivision::name)
                                    .collect(Collectors.toList())
                    );
        }
    }

    private static void answer(final String myWorkStyle){
        final String myAnswerMessage
                = new AnswerService_WorkAttendanceDivision(myWorkStyle)
                .makeAnswer();

        System.out.println(myAnswerMessage);
    }
}