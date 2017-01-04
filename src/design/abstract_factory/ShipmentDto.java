package design.abstract_factory;

/**
 * Created by siddhahastmohapatra on 30/12/16.
 */
public class ShipmentDto {

    private int shipment_id;
    private String specs;
    private String tracking_id;
    private String shipment_status_text;
    private int shipment_statuc_code;
    private String shipment_direction;
    private int shipment_ecom;

    public ShipmentDto(){

    }

    public int getShipment_id(){
        return shipment_id;
    }

    public String getShipment_status_text(){
        return shipment_status_text;
    }

    public int getShipment_statuc_code(){
        return shipment_statuc_code;
    }


}
