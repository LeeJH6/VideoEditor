import java.util.*;

public class StatsHandler {
    private static final String LOAD_LOCATION = "videolist.txt";
    private List<Video> videos;

    public StatsHandler() {
        videos = new ArrayList<>();
        loadVideos();
        sortBy(Comparators.VIEW_COMPARATOR);
    }

    private void loadVideos() {
        try (UTF8Reader reader = UTF8Reader.getInstance(LOAD_LOCATION)) {
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                Video currentVideo = Video.getInstanceFromString(line);
                if (currentVideo != null) videos.add(currentVideo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Video> getVideos() {return videos;}

    public void sortBy(Comparator<? super Video> comparator) {
        Collections.sort(videos, comparator);
    }
