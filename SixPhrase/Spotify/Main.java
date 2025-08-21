public class Main {
    
    public static void main(String[] args){
        PlaylistManager list = new PlaylistManager();

        list.addSong("A");
        list.addSong("B");
        list.addSong("C");

        list.playCurrent();
        list.playNext();
        list.playPrevious();

        list.showPlaylist();
        list.shuffle();

        list.removeSong();
        list.showPlaylist();

        System.out.println("**********");
    }
}
