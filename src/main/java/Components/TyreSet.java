package Components;

public class TyreSet {

    private String type;
    private String brand;

    public TyreSet(String type, String brand){
        this.type = type;
        this.brand = brand;
    }

    public String getType(){
        return type;
    }

    public String getBrand(){
        return brand;
    }
}
