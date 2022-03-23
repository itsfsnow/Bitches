package gq.noxiuam.bitches;

import com.github.javafaker.Faker;
import com.sun.tools.javac.jvm.Gen;
import gq.noxiuam.bitches.object.AnnoyingBitch;
import gq.noxiuam.bitches.object.Bitch;
import gq.noxiuam.bitches.object.EmoBitch;
import gq.noxiuam.bitches.object.data.Gender;
import gq.noxiuam.bitches.object.data.Race;
import lombok.SneakyThrows;

import java.util.*;

public class Main {

    // Make it public so I can get more matches with bitches on Tinder!
    public final List<Bitch> allMyBitches = new ArrayList<>();

    @SneakyThrows
    public Main() {
        // Gives me more bitches, no one should ever have more than 100 though!
        for (int i = 0; i < new Random().nextInt(100); i++) {

            // Define their basic human rights
            String name = new Faker().name().firstName();
            String os = System.getProperty("os.name");

            int age = new Random().nextInt(30) + 18;

            Race race = Race.values()[new Random().nextInt(Race.values().length)];
            Gender gender = Gender.values()[new Random().nextInt(Race.values().length)];

            // Windows users get all the bitches!
            if (os.contains("Windows")) {
                this.allMyBitches.add(new Bitch(name, age, race, gender));
            } else if (os.contains("Ubuntu") || os.contains("Linux")) {
                // Hold this fucking L "L"inux users
                this.allMyBitches.add(new EmoBitch(new Random().nextBoolean(), new Random().nextBoolean()));
            } else {
                // Okay Mac users, im sorry to do this to you, but you're in for a real treat with this one
                this.allMyBitches.add(new AnnoyingBitch(new Random().nextInt(100), new Random().nextBoolean(), new Random().nextBoolean()));
            }

            System.out.println("New Bitch: " + this.allMyBitches.get(i).getName());
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
