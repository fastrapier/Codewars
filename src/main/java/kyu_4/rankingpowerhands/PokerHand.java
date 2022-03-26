package kyu_4.rankingpowerhands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PokerHand {
    public enum Result {TIE,WIN,LOSS}

    private int[] cardValues = new int[5]; // In ascending order

    public int getValue() {
        return value;
    }

    private int value = 0;
    public PokerHand(String hand) {
        String[] cardStrs = hand.split("\\s+");

        int[] ofAKinds = new int[13];

        boolean isFlush = true;
        char prevSuit = 0;

        // Parse values, of a kinds, and flush
        for(int i = 0; i < cardStrs.length; ++i) {
            String cardStr = cardStrs[i];
            char suit = cardStr.charAt(1);
            char valueChr = cardStr.charAt(0);
            int value = 0;

            switch(valueChr) {
                case 'T': value = 10; break;
                case 'J': value = 11; break;
                case 'Q': value = 12; break;
                case 'K': value = 13; break;
                case 'A': value = 14; break;
                default: value = Character.getNumericValue(valueChr);
            }

            ++ofAKinds[value - 2];

            if(prevSuit != 0 && suit != prevSuit) { isFlush = false; }
            prevSuit = suit;

            cardValues[i] = value;
        }
        boolean is2OfAKind = false,is2Pairs = false;
        boolean is3OfAKind = false,is4OfAKind = false;

        for(int oak: ofAKinds) {
            switch(oak) {
                case 2:
                    if(is2OfAKind) { is2Pairs = true; }
                    else { is2OfAKind = true; }
                    break;
                case 3: is3OfAKind = true; break;
                case 4: is4OfAKind = true; break;
            }
        }

        // Straight?
        Arrays.sort(cardValues);

        boolean isStraight = true;
        int cardLen = cardValues.length;
        int straightValue = cardValues[0];
        boolean isBicycle = straightValue == 2 && cardValues[cardLen - 1] == 14; // Ace (14) can be 1

        if(isBicycle) { --cardLen; }

        for(int i = 1; i < cardLen; ++i) {
            int value = cardValues[i];
            if(value != ++straightValue) { isStraight = false; break; }
        }

        if(isBicycle && isStraight) {
            // Change Ace value to 1 for a bicycle (wheel) straight
            cardValues[cardLen] = 1;
            Arrays.sort(cardValues);
        }

        // Calculate ultimate value
        value = cardValues[cardValues.length - 1]; // High card

        if(isStraight && isFlush) {
            // Royal flush?
            value += (cardValues[0] == 10) ? 1337 : 800;
        }
        else if(is4OfAKind) { value += 700; }
        // Full house
        else if(is3OfAKind && is2OfAKind) { value += 600; }
        else if(isFlush) { value += 500; }
        else if(isStraight) { value += 400; }
        else if(is3OfAKind) { value += 300; }
        else if(is2Pairs) { value += 200; }
        else if(is2OfAKind) { value += 100; }
    }

    public Result compareWith(PokerHand hand) {
        int diff = value - hand.value;

        if(diff == 0) {
            // Instead of this, you might be able to initialize #value to the sum in the constructor?
            for(int i = cardValues.length - 1; i >= 0; --i) {
                if((diff = cardValues[i] - hand.cardValues[i]) != 0) { break; }
            }
        }

        return (diff < 0) ? Result.LOSS : ((diff > 0) ? Result.WIN : Result.TIE);
    }
}