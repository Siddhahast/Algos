package design.abstract_factory;

import java.util.List;

/**
 * Created by siddhahastmohapatra on 30/12/16.
 */
public class RunsheetDto {

    private String runsheetName;
    private String runsheetId;
    private int createdBy;
    private int assignedTo;
    private String status;

    private List<ShipmentDto> shipments;

    public RunsheetDto(){

    }

}
