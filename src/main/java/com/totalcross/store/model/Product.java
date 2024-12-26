package com.totalcross.store.model;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private int id;
    private Date created;
    private String description;
    private String name;
    private BigDecimal price;

    public Product(int id, Date created, String description, String name, BigDecimal price ){
        this.id=id;
        this.created = created;
        this.description = description;
        this.name = name;
        this.price = price;        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // Método toString
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", created=" + created +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
