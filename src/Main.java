import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> channels = new HashMap<>();
        channels.put(1, "BBC");
        channels.put(2, "CNN");
        channels.put(3, "NBC");
        channels.put(4, "ABC");
        channels.put(5, "Fox News");
        channels.put(6, "CBS");
        channels.put(7, "ESPN");
        channels.put(8, "HBO");
        channels.put(9, "Discovery Channel");
        channels.put(10, "National Geographic");

        Scanner in = new Scanner(System.in);
        testGettingElement(channels, in);

        testRemovingElement(channels, in);
    }
    private static void testGettingElement(Map<Integer, String> channels, Scanner in) {
        System.out.println("TV Channels: " + channels);
        System.out.println("Enter channel number to search: ");
        int channelNumber = in.nextInt();
        if (channels.containsKey(channelNumber)) {
            System.out.println("Channel " + channelNumber + ": " + channels.get(channelNumber));
        } else {
            System.out.println("Channel " + channelNumber + " not found");
        }
    }
    private static void testRemovingElement(Map<Integer, String> channels, Scanner in) {
        System.out.println("Enter channel number to delete: ");
        int channelToDelete = in.nextInt();
        in.nextLine();
        if (channels.containsKey(channelToDelete)) {
            channels.remove(channelToDelete);
            System.out.println("Channel " + channelToDelete + " removed");
        } else {
            System.out.println("Channel " + channelToDelete + " not found");
        }
        System.out.println("TV Channels: " + channels);
    }

}
