public class StandardRoom extends Room {
    StandardRoom(int roomNumber) {
            super(roomNumber);
        }

    @Override
    public double getPricePerNight() {
        return 500;
    }

    @Override
    public String getRoomType(){
        return "StandardRoom";
    }
}


