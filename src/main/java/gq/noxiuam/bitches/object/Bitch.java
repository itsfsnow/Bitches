package gq.noxiuam.bitches.object;

import gq.noxiuam.bitches.object.data.Gender;
import gq.noxiuam.bitches.object.data.Race;
import lombok.*;

// Generic bitch
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Bitch {
    private String name;

    private int age;

    private Race race;
    private Gender gender;
}