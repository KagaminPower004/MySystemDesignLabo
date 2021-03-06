package 社員勤務表.business.service;

import 社員勤務表.domain.model.勤務状況;

public class 勤務状況判定サービス {

    private String my勤務状況 = "";

    public 勤務状況判定サービス(String my勤務状況){
        this.my勤務状況 = my勤務状況;
    }

    public Boolean is非該当(){
        try {
            勤務状況.valueOf(my勤務状況);
            return false;
        }
        catch (IllegalArgumentException e) {
            return true;
        }
    }

    public Boolean isテレワーク(){
        if(my勤務状況.equals(勤務状況.テレワーク.name())) { return true; }
        else{ return false; }
    }

    public Boolean is出社(){
        if(my勤務状況.equals(勤務状況.出社.name())) { return true; }
        else{ return false; }
    }

    public Boolean is非出社(){
        if(my勤務状況.equals(勤務状況.非出社.name())) { return true; }
        else{ return false; }
    }


}