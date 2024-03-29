package Project_service.domain;

public class NoteBook implements Equipment{
    @Override
    public String getDescription() {
        return model+"("+price+")";
    }
    private String model;
    private double price;//价格

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
