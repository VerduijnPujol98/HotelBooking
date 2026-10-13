public class Hotel {
    private String name;
    private int starRating;

    public Hotel(String name, int starRating) {
        this.name = name;
        this.starRating = starRating;
    }

    public String getName() {
        return name;
    }

    public int getStarRating() {
        return starRating;
    }

    public Room addRoom(Room room){
        return null;
    }
}
