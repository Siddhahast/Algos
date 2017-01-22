package EMS;

/**
 * Created by siddhahastmohapatra on 16/01/17.
 */
public class ReportFormatterDto {

    private String formattedOutput;

    public ReportFormatterDto(Object object, FormatType formatType){
        switch (formatType){
            case CSV:
                formattedOutput = convertObjectToCSV(object);
                break;
            case XML:
                formattedOutput = convertObjectToXML(object);
                break;
        }
    }

    private String convertObjectToXML(Object obj){
        return "<title>"+obj.toString()+"</title>";
    }

    private String convertObjectToCSV(Object obj){
        return obj.toString();
    }

    public String getFormattedOutput(){
        return formattedOutput;
    }

}
