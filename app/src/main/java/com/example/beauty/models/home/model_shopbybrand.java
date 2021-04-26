package com.example.beauty.models.home;

public class model_shopbybrand {
    String Image,description,off;

    public model_shopbybrand(String image, String description, String off) {
        Image = image;
        this.description = description;
        this.off = off;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOff() {
        return off;
    }

    public void setOff(String off) {
        this.off = off;
    }
}
