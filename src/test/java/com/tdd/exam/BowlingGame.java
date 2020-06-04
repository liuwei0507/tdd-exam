package com.tdd.exam;

import java.util.List;

public class BowlingGame {
    private List<RoundResult> roundResult;
    public BowlingGame(List<RoundResult> roundResult) {
        this.roundResult = roundResult;
    }

    public Integer playBowling() {
        Integer score = 0;
        for (int i = 0; i < roundResult.size(); i++) {
            score += roundResult.get(i).getScore();
        }
        return score;
    }
}
