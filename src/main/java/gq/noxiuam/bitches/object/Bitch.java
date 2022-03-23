package gq.noxiuam.bitches.object;

import gq.noxiuam.bitches.object.data.Races;
import lombok.*;

// Generic bitch
@Getter @AllArgsConstructor
public class Bitch {
    private String name;
    private String pronouns;

    private int age;

    private Races race;
}