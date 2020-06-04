package com.tdd.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BowlingGameTest {
    @Test
    void should_get_ten_scores_when_play_bowling_given_first_round_strike() {
        BowlingGame bowlingGame = new BowlingGame(Arrays.asList(new RoundResult(10)));

        Integer score = bowlingGame.playBowling();

        Integer expectResult = 10;
        Assertions.assertEquals(expectResult, score);
    }
}
