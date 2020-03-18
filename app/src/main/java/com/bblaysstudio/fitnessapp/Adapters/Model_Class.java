package com.bblaysstudio.fitnessapp.Adapters;

import android.graphics.Bitmap;



public class Model_Class {

    Bitmap cat_img;
    String cat_name;
    int drawableId;
    String dayData;
    String detail;


    public Model_Class() {
    }

    public Model_Class(Bitmap cat_img, String cat_name) {
        this.cat_img = cat_img;
        this.cat_name = cat_name;
    }

    public Model_Class(Bitmap cat_img, String cat_name, String dayData) {
        this.cat_img = cat_img;
        this.cat_name = cat_name;
        this.dayData = dayData;
    }
    public Model_Class(String cat_name,Bitmap cat_img,String detail) {
        this.cat_img = cat_img;
        this.cat_name = cat_name;
        this.detail=detail;
    }

    public Model_Class(String cat_name,Bitmap cat_img, int drawableId, String detail) {
        this.cat_img = cat_img;
        this.cat_name = cat_name;
        this.drawableId = drawableId;
        this.detail = detail;
    }

    public Bitmap getCat_img() {
        return cat_img;
    }

    public void setCat_img(Bitmap cat_img) {
        this.cat_img = cat_img;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getDayData() {
        return dayData;
    }

    public String getDetail() {
        return detail;
    }

    public int getDrawableId() {
        return drawableId;
    }
}
