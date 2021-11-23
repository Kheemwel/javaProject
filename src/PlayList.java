import java.util.LinkedList;

public class PlayList {
    public static void main(String[] args) {
        LinkedList<String> songs = new LinkedList<>();
        LinkedList<String> artists = new LinkedList<>();
        LinkedList<String> playlist = new LinkedList<>();

        songs.add("We Belong Together");
        songs.add("Million Reasons");
        songs.add("The Climb");
        songs.add("Who You Are");
        songs.add("A Woman's Worth");
        System.out.println(songs);

        artists.add("Mariah Carey");
        artists.add("Lady Gaga");
        artists.add("Miley Cyrus");
        artists.add("Jessie J");
        artists.add("Alicia Keys");
        System.out.println(artists);

        while (!(songs.isEmpty() && artists.isEmpty())) {
            playlist.add(songs.remove() + " - " + artists.remove());
        }

        for (String p : playlist) {
            System.out.println(p);
        }
    }
}
