package gq.noxiuam.bitches;

import com.github.javafaker.Faker;
import gq.noxiuam.bitches.object.Bitch;
import gq.noxiuam.bitches.object.data.Races;

import java.util.*;

public class Main {

    // Make it public so I can get more bitches!
    public final List<Bitch> allMyBitches = new ArrayList<>();

    public Main() {
        // Random name generator, meaning my bitches can be a guy as well.
        Faker faker = new Faker();

        // Gives me more bitches until the machine can't compute anymore
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            this.allMyBitches.add(new Bitch(faker.name().firstName(), "they/them", new Random().nextInt(30) + 18, Races.values()[new Random().nextInt(Races.values().length)]));
            System.out.println("New Bitch: " + this.allMyBitches.get(i).getName());
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
