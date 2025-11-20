import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<String> tracks;

    public Playlist(String name) {
        this.name = name;
        this.tracks = new ArrayList<>();
    }

    public void addTrack(String track) {
        tracks.add(track);
    }

    public int size() {
        return tracks.size();
    }

    public List<String> getTracks() {
        
        return List.copyOf(tracks);
        

    @Override
    public String toString() {
        return "Playlist{name='" + name + "', tracks=" + tracks + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Playlist pl = new Playlist("Mes morceaux préférés");
        pl.addTrack("Track A");
        pl.addTrack("Track B");
        pl.addTrack("Track C");

        System.out.println("Taille: " + pl.size());
        System.out.println("Tracks: " + pl.getTracks());

        
        List<String> tracksView = pl.getTracks();
        
}
