package design.abstract_factory;

import java.util.List;

/**
 * Created by siddhahastmohapatra on 30/12/16.
 */
public abstract class Runsheet {

    private int runsheet_id;
    private String runsheetName;

    public static Runsheet createRunsheet(User user, String runsheetName, String type){
        if(type.equals(RunsheetType.DELIVERY_RUNSHEET_TYPE_ID)){
            return new DeliveryRunsheet(runsheetName);
        }else{
            return new PickupRunsheet(runsheetName);
        }
    }

    public abstract void addShipmentToRunsheet(User user, ShipmentDto shipment) throws Exception;

    public void closeRunsheet(User user){

        String sql = "UPDATE runsheet T1" +
                "SET T1.runsheet_statuc= " +"'Close'"+
                "WHERE T1.runsheet_id = "+ runsheet_id;

        System.out.print("Runsheet with runsheet id is closed");
    }

    public void displayRunsheetItems(User user){

        /*
        SELECT
                    T1.tracking_id,
                    T1.shipment_id,
                    T2.runsheet_id,
                    T2.runsheet_name
        FROM        shipment T1
                    INNER JOIN runsheet_items T2 on T1.shipment_id = T2.shipment_id
                        and T2.runsheet_item_status <> 'Deleted'
        WHERE       T2.runsheet_id = ?
         */

        /*
        Run this logic and query inside the function.
         */

    }

    public abstract List<ShipmentDto> getShipmentsInRunsheet(int runsheet_id);

}
