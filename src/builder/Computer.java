package builder;

import java.util.Date;

public class Computer {
    private String serialId;
    private String modelName;
    private String type;
    private String company;
    private float price;
    private Date dateOfManufacture;

    public Computer(String serialId, String modelName, String type, String company, float price, Date dateOfManufacture) {
        this.serialId = serialId;
        this.modelName = modelName;
        this.type = type;
        this.company = company;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "serialId='" + serialId + '\'' +
                ", ModelName='" + modelName + '\'' +
                ", type='" + type + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", dateOfManufacture=" + dateOfManufacture +
                '}';
    }
}
