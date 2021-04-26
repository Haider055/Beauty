package com.example.beauty.models.offer;

public class model_offer_slider {
    String image,video;

    public model_offer_slider(String image, String video) {
        this.image = image;
        this.video = video;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
