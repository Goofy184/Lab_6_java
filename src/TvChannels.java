import java.util.HashMap;
import java.util.Map;

public class TvChannels {
    private Map<Integer, String> channels;

    public TvChannels() {
        channels = new HashMap<>();
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
    }

    public Map<Integer, String> getChannels() {
        return channels;
    }
}
