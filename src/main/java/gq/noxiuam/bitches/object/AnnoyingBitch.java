package gq.noxiuam.bitches.object;

import lombok.*;

// This is a prime example of what Mainzz (former Onix Client admin) is
@Getter
public class AnnoyingBitch extends Bitch {
    private final int annoyingLevel;

    private final boolean pregnant, fatherless;

    public AnnoyingBitch(int annoyingLevel, boolean pregnant, boolean fatherless) {
        this.annoyingLevel = annoyingLevel;
        this.pregnant = pregnant;
        this.fatherless = fatherless;
        this.createNewBitch();
    }
}