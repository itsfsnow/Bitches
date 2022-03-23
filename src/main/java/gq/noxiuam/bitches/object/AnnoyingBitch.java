package gq.noxiuam.bitches.object;

import com.github.javafaker.Faker;
import gq.noxiuam.bitches.object.data.Gender;
import gq.noxiuam.bitches.object.data.Race;
import lombok.*;

import java.util.Random;

// This is a prime example of what Mainzz (former Onix Client admin) is
@Getter @AllArgsConstructor
public class AnnoyingBitch extends Bitch {
    private int annoyingLevel;

    private boolean pregnant;
    private boolean fatherless;

    public AnnoyingBitch() {
        this.setName(new Faker().name().firstName());
        this.setAge(new Random().nextInt(30) + 18);
        this.setRace(Race.values()[new Random().nextInt(Race.values().length)]);
        this.setGender(Gender.values()[new Random().nextInt(Race.values().length)]);
    }
}