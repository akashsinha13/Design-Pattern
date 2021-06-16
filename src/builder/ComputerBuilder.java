package builder;

import java.util.Date;

public class ComputerBuilder {

    private String serialId;
    private String modelName;
    private String type;
    private String company;
    private float price;
    private Date dateOfManufacture;

    public ComputerBuilder setSerialId(String serialId) {
        this.serialId = serialId;
        return this;
    }

    public ComputerBuilder setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public ComputerBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public ComputerBuilder setCompany(String company) {
        this.company = company;
        return this;
    }

    public ComputerBuilder setPrice(float price) {
        this.price = price;
        return this;
    }

    public ComputerBuilder setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
        return this;
    }

    public Computer build(){
        Computer comp = new Computer(serialId, modelName,  type,  company,  price,  dateOfManufacture);
        return comp;
    }
}

