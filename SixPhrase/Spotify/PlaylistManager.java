import java.util.*;

public class PlaylistManager {
    private ArrayList<String> list;
    private int currentIndex;

    public PlaylistManager(){
        this.list = new ArrayList<>();
        this.currentIndex = -1;

        System.out.println("Playlist created!");
    }

    void addSong(String name){
        list.add(name);

        if(currentIndex == -1) currentIndex = 0;

        System.out.println("Song added Successfully!");
    }

    void removeSong(){
        if(currentIndex > -1){
            String song = list.remove(currentIndex);
            currentIndex = (currentIndex == 0 && list.size() == 1)? -1: currentIndex-1;
            System.out.println("Removed Song: " + song);
        }
    }

    void playCurrent(){
        if(currentIndex == -1) System.out.println("No songs to play");
        else System.out.println("Now Playing: " + list.get(currentIndex));
    }
    
    void playNext(){
        if(currentIndex == -1 || currentIndex == list.size()-1){
            System.out.println("No songs to play");
            return;
        }

        System.out.println("Now Playing: " + list.get(++currentIndex));        
    }

    void playPrevious(){
        if(currentIndex <= 0){
            System.out.println("No songs to play");
            return;
        }

        System.out.println("Now Playing: " + list.get(--currentIndex));        
    }

    void shuffle(){
        Collections.shuffle(list);
        currentIndex = 0;
        System.out.println("Playlist after suffling:\olf");
        showPlaylist();
    }

    void showPlaylist(){
        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                System.out.println(i+1 + ": " + list.get(i));
            }
            return;
        }

        System.out.println("List is Empty!");
    }

}
