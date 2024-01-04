package Model;

public class TShirt {
    // Fields
     String itemName;
    int productCode;
     double price;
     String brand;
     String description;
     String[] sizes;


    public TShirt(String itemName, int productCode, double price, String brand, String description, String[] sizes) {
        this.itemName = itemName;
        this.productCode = productCode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.sizes = sizes;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSizes() {
        return sizes;
    }

    public void setSizes(String[] sizes) {
        this.sizes = sizes;
    }

    public void describeTShirt() {

    }
}

