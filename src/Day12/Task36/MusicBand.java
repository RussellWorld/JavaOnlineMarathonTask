package Day12.Task36;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<String> members;

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

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public MusicBand(String name, int year, List<String> members) {
        this.year = year;
        this.name = name;
        this.members = members;
    }

    public static void transferMembers(MusicBand a, MusicBand b){
        for (String member :a.getMembers())
            b.getMembers().add(member);

            a.getMembers().clear();

    }

    public void printMembers(){
        System.out.println(this.members);
    }
}
