public abstract class Room {
    private int roomNumber;
    private double pricePerNight;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public abstract String getRoomType();

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }


    public abstract double getPricePerNight();

    public boolean isAvailable(){
        return true;
    }
}
