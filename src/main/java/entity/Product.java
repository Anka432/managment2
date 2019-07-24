package entity;

public class Product {

    private String id;
    private  String productName;
    private float price;
    private float weight;
    private String color;
    private Integer productCount;

    public Product(String id, String productName, int price, int weight,
                   String color, Integer productCount){

        this.id=id;
        this.productName=productName;
        this.price=price;
        this.weight=weight;
        this.color=color;
        this.productCount=productCount;
    }

    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", productCount=" + productCount +
                '}';
    }
}
