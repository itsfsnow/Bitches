package gq.noxiuam.bitches.object;

import lombok.*;

// Basically what 90% of Lunar Client's discord is
@Getter
public class EmoBitch extends Bitch {
    private final boolean hasBarcodeWrists, wearsBlackClothes;

    public EmoBitch(boolean hasBarcodeWrists, boolean wearsBlackClothes) {
        this.hasBarcodeWrists = hasBarcodeWrists;
        this.wearsBlackClothes = wearsBlackClothes;
        this.createNewBitch();
    }
}