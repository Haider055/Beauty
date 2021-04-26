package com.example.beauty.models.home;

public class model_trendingnow {
    String image,title,price;

    public model_trendingnow(String image, String title, String price) {
        this.image = image;
        this.title = title;
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
