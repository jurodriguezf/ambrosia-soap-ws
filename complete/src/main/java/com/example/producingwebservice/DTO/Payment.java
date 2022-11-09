package com.example.producingwebservice.DTO;

public class Payment {
    private String date;
    private String userId;
    private String amount;
    private String receiptId;
    private String description;

    public Payment(String date, String userId, String amount, String receiptId, String description) {
        this.date = date;
        this.userId = userId;
        this.amount = amount;
        this.receiptId = receiptId;
        this.description = description;
    }

    public Payment() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
