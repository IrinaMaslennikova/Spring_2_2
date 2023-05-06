package web.model;

public class Car {
    private int id;
    private String model;
    private String gosNumber;

    public Car() {
    }

    public Car(int id, String model, String gosNumber) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGosNumber() {
        return gosNumber;
    }

    public void setGosNumber(String gosNumber) {
        this.gosNumber = gosNumber;
    }
}
