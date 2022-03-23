package gq.noxiuam.bitches.object;

import com.github.javafaker.Faker;
import gq.noxiuam.bitches.object.data.Gender;
import gq.noxiuam.bitches.object.data.Race;
import lombok.*;

import java.util.Random;

// Basically what 90% of Lunar Client's discord is
@Getter @AllArgsConstructor
public class EmoBitch extends Bitch {
    private boolean hasBarcodeWrists, wearsBlackClothes;

    public EmoBitch() {
        this.setName(new Faker().name().firstName());
        this.setAge(new Random().nextInt(30) + 18);
        this.setRace(Race.values()[new Random().nextInt(Race.values().length)]);
        this.setGender(Gender.values()[new Random().nextInt(Race.values().length)]);
    }
}