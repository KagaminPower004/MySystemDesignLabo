package roster.domain.anticorruption.worksubstatus;

import roster.domain.model.StyleDivision;

public class WorkSubStatusCheckService {

    private final String my勤務状況;

    public WorkSubStatusCheckService(String my勤務状況){
        this.my勤務状況 = my勤務状況;
    }

    public Boolean isNG(){
        try {
            StyleDivision.valueOf(my勤務状況);

            //緊急事態宣言長期休止によりテレワーク休止
            //if(this.isテレワーク()){ return true; }

            return false;
        }
        catch (IllegalArgumentException e) {
            return true;
        }
    }

    public Boolean isTeleWork(){
        if(my勤務状況.equals(StyleDivision.TELE_WORK.name())) { return true; }
        else{ return false; }
    }

    public Boolean isPhysicalWork(){
        if(my勤務状況.equals(StyleDivision.PHYSICAL_WORK.name())) { return true; }
        else{ return false; }
    }

    public Boolean isNonWork(){
        if(my勤務状況.equals(StyleDivision.NON_WORK.name())) { return true; }
        else{ return false; }
    }


}