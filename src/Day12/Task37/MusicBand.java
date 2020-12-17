package Day12.Task37;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<MusicArtist> members;

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.year = year;
        this.name = name;
        this.members = members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (MusicArtist member : a.getMembers())
            b.getMembers().add(member);

        a.getMembers().clear();

    }

    public void printMembers() {
        System.out.println(this.members);
    }
}
