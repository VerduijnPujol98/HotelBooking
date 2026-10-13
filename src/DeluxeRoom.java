public class DeluxeRoom extends Room {
    private boolean hasBalcony;

    public DeluxeRoom(boolean hasBalcony, int RoomNumber) {
        this.hasBalcony = hasBalcony;
        super(RoomNumber);
    }

    public boolean hasBalcony(){
        return hasBalcony;
    }

    @Override
    public String getRoomType() {
        return "Deluxe";
    }

    @Override
    public double getPricePerNight() {
        if(hasBalcony){
            return 900;
        } else {
            return 800;
        }
    }
}
