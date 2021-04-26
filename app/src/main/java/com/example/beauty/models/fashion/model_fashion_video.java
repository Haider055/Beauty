package com.example.beauty.models.fashion;

public class model_fashion_video {
    String image,buttontext;

    public model_fashion_video(String image, String buttontext) {
        this.image = image;
        this.buttontext = buttontext;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getButtontext() {
        return buttontext;
    }

    public void setButtontext(String buttontext) {
        this.buttontext = buttontext;
    }
}
