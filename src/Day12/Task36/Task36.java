package Day12.Task36;

import java.util.ArrayList;
import java.util.List;

public class Task36 {

    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Grace Slick");
        members1.add("Marty Balin");
        members1.add("Paul Kantner");
        members1.add("Jorma Kaukonen");
        members1.add("Jack Casady");
        members1.add("Spencer Dryden");

        MusicBand band1 = new MusicBand("The Beatles", 1960, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Jonh Lennon");
        members2.add("Paul mcCartny");
        members2.add("Ringo Starr");
        members2.add("George Harrison");

        MusicBand band2 = new MusicBand("Jefferson Aiplane", 1965, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1,band2);
        band1.printMembers();
        band2.printMembers();
    }
}
