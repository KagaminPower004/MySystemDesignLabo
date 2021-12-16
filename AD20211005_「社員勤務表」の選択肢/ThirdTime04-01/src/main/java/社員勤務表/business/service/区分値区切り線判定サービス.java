package 社員勤務表.business.service;

import 社員勤務表.business.translator.区分値区切り線;

public class 区分値区切り線判定サービス {
    private 勤務状況サブステータス区分  my勤務状況サブステータス区分;

    public 区分値区切り線判定サービス(勤務状況サブステータス区分 my勤務状況サブステータス区分){
        this.my勤務状況サブステータス区分 = my勤務状況サブステータス区分;
    }

    public Boolean is区分値区切り線(){
        return new 区分値区切り線().name() == my勤務状況サブステータス区分.name();
    }
}