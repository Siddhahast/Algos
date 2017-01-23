package design.abstract_factory;

/**
 * Created by siddhahastmohapatra on 30/12/16.
 */
public class RunsheetController {

    private RunsheetManager runsheetManager = new RunsheetManager();

    public void requestPost(String type, User user, String runsheetName, String postRequest){

        if(postRequest.equals("create")) {
            runsheetManager.createRunsheet(type, user, runsheetName);
        }
    }



}
