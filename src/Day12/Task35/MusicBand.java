package Day12.Task35;

public class MusicBand {

    private String name;
    private int year;

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

    public MusicBand(String name, int year) {
        this.year = year;
        this.name = name;
    }
}
