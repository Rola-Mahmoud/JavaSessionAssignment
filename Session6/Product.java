package Session6;

public interface Product {
    void setName(String name);
    void setColor(String color);
    void setPrice(double price);
    String getName();
    String getColor();
    double getPrice();
    default String getBarcode(){
        return "";
    }
}
