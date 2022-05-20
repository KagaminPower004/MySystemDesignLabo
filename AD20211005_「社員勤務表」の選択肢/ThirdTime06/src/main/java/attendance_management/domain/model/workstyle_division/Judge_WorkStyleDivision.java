package attendance_management.domain.model.workstyle_division;

public class Judge_WorkStyleDivision {

    private final String myStyle;

    public Judge_WorkStyleDivision(final String myStyle)
        {
//            //区分値チェック
//            if( new Check_WorkStyleDivision(WorkStyleDivision.valueOf(myStyle)).isNotEnabled() )
//                { throw new RuntimeException( "This Object is not enabled." ); }

            //区分値セット
            this.myStyle = myStyle;
        }

    public final Boolean isNG(){
        try {
            WorkStyleDivision.valueOf(myStyle);

            //緊急事態宣言長期休止によりテレワーク休止
            //if(this.isテレワーク()){ return true; }

            return false;
        }
        catch (IllegalArgumentException e) {
            return true;
        }
    }

    public final Boolean isTelework() { return myStyle.equals(WorkStyleDivision.TELEWORK.name()); }

    public final Boolean isPhysical_Work(){
        return myStyle.equals(WorkStyleDivision.PHYSICAL_WORK.name());
    }

    public final Boolean isNon_Work(){
        return myStyle.equals(WorkStyleDivision.NON_WORK.name());
    }
}