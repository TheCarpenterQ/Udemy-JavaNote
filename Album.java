import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        return this.songs.add(new Song(title,duration));
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList){
        Song checkSong = this.songs.findSong(trackNumber);
        if (checkSong != null){
            playList.add(checkSong);
            return true;
        }
        System.out.println("This album does not have track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title,List<Song> playList){
        Song checkSong = songs.findSong(title);
        if (checkSong != null){
            playList.add(checkSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList{
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song){
            if (songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title){
            for(Song checkSong: this.songs){
                //an alternative shortcut way to go through a list of entries
                //equivalent of doing normal WHILE iterations
                if(checkSong.getTitle().equals(title)){
                    return checkSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber){
            int index = trackNumber - 1;
            if ((index > 0) && (index < songs.size())){
                return songs.get(index);
            }
            return null;
        }
    }
}
