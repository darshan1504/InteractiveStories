package com.example.batman.interactivestories.model;

public class Page {
    private int textId;
    private int imageID;
    private Choice choice1;
    private Choice choice2;
    private boolean isFinalPage = false;

    public Page(int textId, int imageID) {
        this.textId = textId;
        this.imageID = imageID;
        this.isFinalPage = true;
    }

    public Page(int textId, int imageID, Choice choice1, Choice choice2) {
        this.textId = textId;
        this.imageID = imageID;
        this.choice1 = choice1;
        this.choice2 = choice2;

    }

    public int getTextId() {

        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }
}
