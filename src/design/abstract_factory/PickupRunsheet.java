package design.abstract_factory;

import java.util.List;

/**
 * Created by siddhahastmohapatra on 30/12/16.
 */
public class PickupRunsheet extends Runsheet {

    private String runsheetName;
    private String runsheetType = "Pickup";
    private int runsheet_assignedTo;
    private int runsheet_createdBy;

    public PickupRunsheet(String runsheetName){
        this.runsheetName = runsheetName;
    }

    @Override
    public void addShipmentToRunsheet(User user, ShipmentDto shipment) throws Exception {

    }

    @Override
    public List<ShipmentDto> getShipmentsInRunsheet(int runsheet_id) {
        return null;
    }
}
