package roster.domain.anticorruption.worksubstatus;

import roster.domain.model.StyleDivision;

public class WorkSubStatusCheckService {

    private final String myStyle;

    public WorkSubStatusCheckService(String myStyle){
        this.myStyle = myStyle;
    }

    public Boolean isNG(){
        try {
            StyleDivision.valueOf(myStyle);

            //緊急事態宣言長期休止によりテレワーク休止
            //if(this.isテレワーク()){ return true; }

            return false;
        }
        catch (IllegalArgumentException e) {
            return true;
        }
    }

    public Boolean isTelework(){
        if(myStyle.equals(StyleDivision.TELEWORK.name())) { return true; }
        else{ return false; }
    }

    public Boolean isPhysical_Work(){
        if(myStyle.equals(StyleDivision.PHYSICAL_WORK.name())) { return true; }
        else{ return false; }
    }

    public Boolean isNon_Work(){
        if(myStyle.equals(StyleDivision.NON_WORK.name())) { return true; }
        else{ return false; }
    }
}