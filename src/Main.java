import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TvChannels tvChannels = new TvChannels();
        Map<Integer, String> channels = tvChannels.getChannels();
        System.out.println("TV Channels: " + channels);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter channel number to search: ");
        int channelNumber = in.nextInt();
        if (channels.containsKey(channelNumber)) {
            System.out.println("Channel " + channelNumber + ": " + channels.get(channelNumber));
        } else {
            System.out.println("Channel " + channelNumber + " not found");
        }

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
