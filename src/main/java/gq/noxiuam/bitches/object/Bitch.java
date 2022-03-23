package gq.noxiuam.bitches.object;

import com.github.javafaker.Faker;
import gq.noxiuam.bitches.object.data.Gender;
import gq.noxiuam.bitches.object.data.Race;
import lombok.*;

import java.util.Random;

// Generic bitch
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Bitch {
    private String name;

    private int age;

    private Race race;
    private Gender gender;

    public void createNewBitch() {
        this.setName(new Faker().name().firstName());
        this.setAge(new Random().nextInt(30) + 18);
        this.setRace(Race.values()[new Random().nextInt(Race.values().length)]);
        this.setGender(Gender.values()[new Random().nextInt(Gender.values().length)]);
    }
}