package com.example.beauty.models.home;

public class model_blogs {
    String image,title,description,date,answers,dr_name;

    public model_blogs(String image, String title, String description, String date, String answers, String dr_name) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.date = date;
        this.answers = answers;
        this.dr_name = dr_name;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public String getDr_name() {
        return dr_name;
    }

    public void setDr_name(String dr_name) {
        this.dr_name = dr_name;
    }
}
