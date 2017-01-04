package design.abstract_factory;

import java.util.List;

/**
 * Created by siddhahastmohapatra on 30/12/16.
 */
public class RunsheetManager {

    private Runsheet runsheet;

    public RunsheetManager(Runsheet runsheet){
        this.runsheet = runsheet;
    }

    public RunsheetManager(){

    }

    public Runsheet createRunsheet(String type, User user, String runsheetName){

        if(type.equals(RunsheetType.DELIVERY_RUNSHEET_TYPE_ID)){
            return new DeliveryRunsheet(runsheetName);
        }else{
            return new PickupRunsheet(runsheetName);
        }

    }


    public void closeRunsheet(int runsheet_id){

    }

    public List<ShipmentDto> getShipmentsFromRunsheet(int runsheet_id){
        return null;
    }

}
