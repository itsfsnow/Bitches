package gq.noxiuam.bitches.object;

import lombok.*;

// Basically what 99% of Lunar Client's discord is
@Getter
public class FemboyBitch extends Bitch {

    private final boolean fatherless, degenerate;
    private final int hotness = 1000;

    public FemboyBitch(boolean fatherless, boolean degenerate) {
        this.fatherless = fatherless;
        this.degenerate = degenerate;
        this.createNewBitch();
    }
}