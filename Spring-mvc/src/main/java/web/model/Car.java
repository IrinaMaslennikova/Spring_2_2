package web.model;

public class Car {
    private long id;
    private String model;
    private String gosNumber;

    public Car() {
    }

    public Car(long id, String model, String gosNumber) {
        this.id = id;
        this.model = model;
        this.gosNumber = gosNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGosNumber() {
        return gosNumber;
    }

    public void setGosNumber(String gosNumber) {
        this.gosNumber = gosNumber;
    }
}
