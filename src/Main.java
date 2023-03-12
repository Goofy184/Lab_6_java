import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> tvChannels = new HashMap<Integer, String>();
        tvChannels.put(1, "BBC");
        tvChannels.put(2, "CNN");
        tvChannels.put(3, "NBC");
        tvChannels.put(4, "ABC");
        tvChannels.put(5, "Fox News");
        tvChannels.put(6, "CBS");
        tvChannels.put(7, "ESPN");
        tvChannels.put(8, "HBO");
        tvChannels.put(9, "Discovery Channel");
        tvChannels.put(10, "National Geographic");
        System.out.println("TV Channels: " + tvChannels);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter channel number to search: ");
        int channelNumber = in.nextInt();
        if (tvChannels.containsKey(channelNumber)) {
            System.out.println("Channel " + channelNumber + ": " + tvChannels.get(channelNumber));
        } else {
            System.out.println("Channel " + channelNumber + " not found");
        }

        System.out.println("Enter channel number to delete: ");
        int channelToDelete = in.nextInt();
        in.nextLine();
        if (tvChannels.containsKey(channelToDelete)) {
            tvChannels.remove(channelToDelete);
            System.out.println("Channel " + channelToDelete + " removed");
        } else {
            System.out.println("Channel " + channelToDelete + " not found");
        }
        System.out.println("TV Channels: " + tvChannels);
    }
}