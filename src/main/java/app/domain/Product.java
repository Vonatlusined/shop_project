package app.domain;

import java.util.Objects;

public class Product {
    private final  Long id;
    private boolean isActive;
    private String ProductName;
    private double price;


    public Product(Long id, boolean isActive, String productName, double price) {
        this.id = id;
        this.isActive = isActive;
        ProductName = productName;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return isActive == product.isActive && Double.compare(price, product.price) == 0 && Objects.equals(id, product.id) && Objects.equals(ProductName, product.ProductName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isActive, ProductName, price);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("id=").append(id);
        sb.append(", isActive=").append(isActive);
        sb.append(", ProductName='").append(ProductName).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}

