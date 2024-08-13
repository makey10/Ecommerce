package com.E_commerce.API.model;

import java.util.Date;

public class Order {

    private Long id;
    private String number;
    private Date creationDate;
    private Date receivedDate;
    private Double total;

    public Order() {
    }

    public Order(Long id, String number, Date creationDate, Date receivedDate, Double total) {
        this.id = id;
        this.number = number;
        this.creationDate = creationDate;
        this.receivedDate = receivedDate;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", creationDate=" + creationDate +
                ", receivedDate=" + receivedDate +
                ", total=" + total +
                '}';
    }
}
