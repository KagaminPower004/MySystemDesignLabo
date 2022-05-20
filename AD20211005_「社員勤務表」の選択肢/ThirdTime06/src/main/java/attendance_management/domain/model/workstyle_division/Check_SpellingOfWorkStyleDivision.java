package attendance_management.domain.model.workstyle_division;

public class Check_SpellingOfWorkStyleDivision {

    private final Judge_WorkStyleDivision myValueSpelling;

    public Check_SpellingOfWorkStyleDivision(final String myStyle)
        {
            //フィールドセット
            this.myValueSpelling = new Judge_WorkStyleDivision(myStyle);
        }

    public final void isExceptionOccurred()
        {

            if(myValueSpelling.isNG()){  throw new RuntimeException( "This value does not exist." ); }

        }
}