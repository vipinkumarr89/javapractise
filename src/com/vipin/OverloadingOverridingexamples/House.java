package com.vipin.OverloadingOverridingexamples;

public class House {
    private Room room;
    private Location location;
    private RoomType roomtype;


    public House(Room room, Location location, RoomType roomtype) {
        this.room = room;
        this.location = location;
        this.roomtype = roomtype;
    }

    public Room getRoom() {
        return room;
    }

    public void WindowType(){

    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public RoomType getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(RoomType roomtype) {
        this.roomtype = roomtype;
    }
}
