import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;



public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Room> rooms = new ArrayList<>();

        Hotel hotel = new Hotel("Rex", 4);

        Random rando = new Random();


        int min = 0;
        int max = 10;
        int range = max - min + 1;
        for (int i = 0; i < 5; i++){
            int rand = (int) (Math.random() * range) + min;
            boolean balcony = rando.nextBoolean();
            
            DeluxeRoom deluxeRoom = new DeluxeRoom(balcony,rand);
            rooms.add(hotel.addRoom(deluxeRoom));

            System.out.println(deluxeRoom.getRoomType());
            System.out.println(deluxeRoom.getRoomNumber());
            System.out.println(deluxeRoom.hasBalcony());
        }



    /*
    for (int i = 0; i < 3; i++) {
        rooms.add(new StandardRoom(i));
        System.out.println(rooms.get(i).getRoomType());
        System.out.println("Room Nr; " + rooms.get(i).getRoomNumber());
        System.out.println(rooms.get(i).getPricePerNight());

    }
    */
    }
}
