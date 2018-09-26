package com.vipin.OverloadingOverridingexamples;

public class Room {
    private int Length;
    private int Width;
    private int Height;

    public Room(int length, int width, int height) {
         this.Length = length;
         this.Width = width;
         this.Height = height;
    }

    public int RoomArea(){
        int roomarea = ((this.Height)*(this.Width)*(this.Length));
        return roomarea;
    }

    public void RoomSize(){
        System.out.println("Size is Good");

    }

    public int getLength() {
        return Length;
    }

    public int getWidth() {
        return Width;
    }

    public int getHeight() {
        return Height;
    }

    public void setLength(int length) {
        Length = length;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public void setHeight(int height) {
        Height = height;
    }
}
