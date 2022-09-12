package attendance_management.domain.model.workattendance_substatus;

import attendance_management.domain.model.workoffice_division.WorkOfficeDivision;
import attendance_management.domain.support.tool.NewLine;

class Translator_InsideDescription {
    private static final String myOneOfNewLine = new NewLine().executed();

    Translator_InsideDescription(){ }

     final String done(){
        final String front = "<!!caution!!::Not Telework!!>"      + myOneOfNewLine;
        final String main  = WorkOfficeDivision.INSIDE.comments() + myOneOfNewLine;
        final String rear  = "Is it OK?";

        return (front + main + rear);
    }
}
