package com.vipin.OverloadingOverridingexamples;

public class RoomType {
    private String Type;

    public RoomType(String type) {
        Type = type;
    }

    public void Villa(){
        System.out.println("Villa -- > Excellent Room");
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
