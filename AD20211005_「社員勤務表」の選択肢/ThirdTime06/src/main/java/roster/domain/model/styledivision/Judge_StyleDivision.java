package roster.domain.model.styledivision;

public class Judge_StyleDivision {

    private final String myStyle;

    public Judge_StyleDivision(final String myStyle)
        {
            //区分値チェック
            if( new Check_StyleDivision(StyleDivision.valueOf(myStyle)).isNotEnabled() )
                { throw new RuntimeException( "This Object is not enabled." ); }

            //区分値セット
            this.myStyle = myStyle;
        }

    public final Boolean isNG(){
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

    public final Boolean isTelework(){
        return myStyle.equals(StyleDivision.TELEWORK.name());
    }

    public final Boolean isPhysical_Work(){
        return myStyle.equals(StyleDivision.PHYSICAL_WORK.name());
    }

    public final Boolean isNon_Work(){
        return myStyle.equals(StyleDivision.NON_WORK.name());
    }
}