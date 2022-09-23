import java.util.ArrayList;

class Playlist {
    public static void main(String[] args) {
        
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        
        desertIslandPlaylist.add("Fiesta");
        desertIslandPlaylist.add("Stay this way");
        desertIslandPlaylist.add("We go");
        desertIslandPlaylist.add("Lunatic");
        desertIslandPlaylist.add("Daisy");
        desertIslandPlaylist.add("A-teen");
        
        System.out.println("The playlist: " + desertIslandPlaylist);
        System.out.println("There are " + desertIslandPlaylist.size() + " songs in it.");
        
        desertIslandPlaylist.remove("Lunatic");
        System.out.println("After remove \"Lunatic\":");
        System.out.println("There are " + desertIslandPlaylist.size() + " songs on it.");
        System.out.println("The playlist: " + desertIslandPlaylist);
        
        int indexA = desertIslandPlaylist.indexOf("We go");
        int indexB = desertIslandPlaylist.indexOf("Daisy");
        String tempA = "We go";
        String tempB = "Daisy";
        desertIslandPlaylist.set(indexA, tempB);
        System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.set(indexB, tempA);
        System.out.println(desertIslandPlaylist);
    }

}