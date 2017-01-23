package EMS;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class EmployeeReportFormatterDto extends ReportFormatterDto{

    private FormatType formatType;
    private Employee emp;

    public EmployeeReportFormatterDto(Employee emp, FormatType formatType){
        super(emp, formatType);
    }

    public String getOutput(){
        return getFormattedOutput();
    }
}
