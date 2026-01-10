package lesson14.homework;

public class Electronics extends Product{
    private String model;
    private int warrantyMonths;


    public Electronics(String name, double price, String model,int warrantyMonths) {
        super(name, price);
        this.model = model;
        this.warrantyMonths = warrantyMonths;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getWarrantyMonths(){
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths){
        this.warrantyMonths = warrantyMonths;
    }
}
