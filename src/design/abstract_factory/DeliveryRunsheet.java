package design.abstract_factory;

import java.util.List;

/**
 * Created by siddhahastmohapatra on 30/12/16.
 */
public class DeliveryRunsheet extends Runsheet {

    private String runsheetName;
    private int runsheet_id;
    private String runsheetType = "Delivery";
    private int runsheet_assignedTo;
    private int runsheet_createdBy;

    public DeliveryRunsheet(String runsheetName){
        this.runsheetName = runsheetName;
    }

    @Override
    public void addShipmentToRunsheet(User user, ShipmentDto shipment) throws Exception {
        //Logic for adding a shipment(delivery direction and Forward) to added to the runsheet.

    }

    @Override
    public List<ShipmentDto> getShipmentsInRunsheet(int runsheet_id) {
        return null;
    }

}
