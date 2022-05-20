import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    //build an ArrayList for albums

    public static void main(String[] args) {
        Album album = new Album("Stormbringer","Deep Purple");
        //build a new album
        album.addSong("A",4.1);  //add songs into album1
        album.addSong("B",4.2);
        album.addSong("C",4.3);
        album.addSong("D",4.4);
        album.addSong("E",4.5);
        album.addSong("F",4.6);
        albums.add(album);  //add album1 into ArrayList:albums

        album = new Album("for those about to rock","ACDC");
        //build the second album
        album.addSong("BA",3.1);  //add songs into album2
        album.addSong("BB",3.2);
        album.addSong("BC",3.3);
        album.addSong("BD",3.4);
        album.addSong("BE",3.5);
        album.addSong("BF",3.6);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        //create the LinkedList:playlist
        albums.get(0).addToPlayList("D",playList);  //add songs from albums into the playlist
        albums.get(0).addToPlayList("E",playList);
        albums.get(0).addToPlayList("G",playList);
        albums.get(1).addToPlayList(4,playList);
        albums.get(1).addToPlayList(5,playList);
        albums.get(1).addToPlayList(7,playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0){
            System.out.println("No song in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();  //read the input command
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                            goingForward = true;
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reach the last song of the playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                            goingForward = false;
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Reach the first song of the playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            goingForward = false;
                        } else {
                            System.out.println("Reach the first song of the playlist");
                        }
                    } else {
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println("Reach the last song of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    //for LinkedList:each time delete a record,have to do a .next or .previous
                    if (playList.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print menu\n" +
                "6 - delete current song");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> i = playlist.iterator();
        System.out.println("==========");
        while (i.hasNext()){
            System.out.println(i.next().toString());
        }
        System.out.println("==========");
    }
}