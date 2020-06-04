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
            RoundResult result = roundResult.get(i);
            if (result.getFirstThrowBalls() == 10) {
                score += calculateStrikeScore(i, roundResult);
            } else if (result.getFirstThrowBalls() + result.getSecondThrowBalls() == 10){
                score += 10;
            } else {
                score += result.getFirstThrowBalls() + result.getSecondThrowBalls();
            }
        }
        return score;
    }

    private Integer calculateStrikeScore(int index, List<RoundResult> roundResult) {
        Integer strikeScore = 0;
        if (roundResult.size() >= index +2) {
            strikeScore = strikeScore + 10 + roundResult.get(index+1).getFirstThrowBalls()+roundResult.get(index+1).getSecondThrowBalls();
        } else {
            strikeScore += 10;
        }
        return strikeScore;
    }
}
