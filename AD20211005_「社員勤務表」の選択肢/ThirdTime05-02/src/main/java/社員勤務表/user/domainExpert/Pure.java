package 社員勤務表.user.domainExpert;

import 社員勤務表.business.service.*;
import 社員勤務表.user.tool.NewLine;

import java.util.ArrayList;
import java.util.List;

public class Pure {

    public static void main(String[] args){

        final String my勤務状況 = args[0];

        System.out.println(勤務区分問合せ(my勤務状況));
        System.out.println("");
        System.out.println(勤務状況サブステータス区分問合せ(my勤務状況));
        System.out.println("");
        System.out.println(勤務状況サブステータス区分補足説明(my勤務状況));
    }

    private static String 勤務区分問合せ(String my勤務状況){

        勤務区分問合せサービス my勤務区分問合せ = new 勤務区分問合せサービス(my勤務状況);
        return my勤務区分問合せ.問合せ回答();
    }

    private static String 勤務状況サブステータス区分問合せ(String my勤務状況){

        勤務状況サブステータス区分問合せサービス my勤務状況サブステータス区分問合せ
                = new 勤務状況サブステータス区分問合せサービス(my勤務状況);

        return my勤務状況サブステータス区分問合せ.問合せ回答();
    }

    private static String 勤務状況サブステータス区分補足説明(String my勤務状況){

        勤務状況サブステータス区分補足説明サービス my勤務状況サブステータス区分補足説明
                = new 勤務状況サブステータス区分補足説明サービス(my勤務状況);

        return my勤務状況サブステータス区分補足説明.問合せ回答();
    }
}