package gamelogic.location;

/**
 * Created by tagga on 1/11/2017.
 */
public class Location implements Comparable<Location> {

    private Rank rank;
    private File file;

    public Location(Rank r, File f) {
        rank = r;
        file = f;
    }

    public Rank getRank() {
        return rank;
    }

    public File getFile() {
        return file;
    }

    public int compareTo(Location o) {
        int returnVal = file.compareTo(o.file);
        if (returnVal == 0) {
            returnVal = rank.compareTo(o.rank);
        }
        return returnVal;
    }

    public String getPrintablePosition() {
        return file + Integer.toString(rank.value);
    }
}
