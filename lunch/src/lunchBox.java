import java.util.ArrayList;

class Lunch {

    public static ArrayList<String> removeAnts(ArrayList<String> lunchContainer) {

        for (int i = 0; i < lunchContainer.size(); i++) {
            if (lunchContainer.get(i) == "ant") {
                lunchContainer.remove(lunchContainer.get(i));
                i--;
            }
        }
        
        return lunchContainer;
    }

    public static void main(String[] args) {
        ArrayList<String> lunchBox = new ArrayList<String>();
        lunchBox.add("apple");
        lunchBox.add("ant");
        lunchBox.add("ant");
        lunchBox.add("sandwich");
        lunchBox.add("ant");
        lunchBox = removeAnts(lunchBox);
        System.out.println(lunchBox);

    }
}