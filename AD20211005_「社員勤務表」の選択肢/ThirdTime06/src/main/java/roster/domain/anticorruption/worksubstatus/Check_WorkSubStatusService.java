package roster.domain.anticorruption.worksubstatus;

import roster.domain.model.styledivision.Check_StyleDivision;
import roster.domain.model.styledivision.StyleDivision;

public class Check_WorkSubStatusService {

    private final String myStyle;

    public Check_WorkSubStatusService(String myStyle)
        {
            //区分値チェック
            if( new Check_StyleDivision(StyleDivision.valueOf(myStyle)).isNotEnabled() )
                { throw new RuntimeException( "This Object is not enabled." ); }

            //区分値セット
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
        return myStyle.equals(StyleDivision.TELEWORK.name());
    }

    public Boolean isPhysical_Work(){
        return myStyle.equals(StyleDivision.PHYSICAL_WORK.name());
    }

    public Boolean isNon_Work(){
        return myStyle.equals(StyleDivision.NON_WORK.name());
    }
}