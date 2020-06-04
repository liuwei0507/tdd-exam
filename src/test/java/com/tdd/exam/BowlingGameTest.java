package com.tdd.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BowlingGameTest {
    @Test
    void should_get_ten_scores_when_play_bowling_given_first_round_first_throw_ten_balls() {
        BowlingGame bowlingGame = new BowlingGame(Arrays.asList(new RoundResult(10, 0)));

        Integer score = bowlingGame.playBowling();

        Integer expectResult = 10;
        Assertions.assertEquals(expectResult, score);
    }

    @Test
    void should_get_ten_scores_when_play_bowling_given_first_round_first_throw_4_balls_first_throw_6_balls() {
        BowlingGame bowlingGame = new BowlingGame(Arrays.asList(new RoundResult(4, 6)));

        Integer score = bowlingGame.playBowling();

        Integer expectResult = 10;
        Assertions.assertEquals(expectResult, score);
    }

    @Test
    void should_get_nine_scores_when_play_bowling_given_first_round_first_throw_4_balls_and_second_throw_5_balls() {
        BowlingGame bowlingGame = new BowlingGame(Arrays.asList(new RoundResult(4, 5)));

        Integer score = bowlingGame.playBowling();

        Integer expectResult = 9;
        Assertions.assertEquals(expectResult, score);
    }

    @Test
    void should_get_30_scores_when_play_bowling_given_first_round_first_throw_10_balls_and_second_round_firstthrow_10_balls() {
        BowlingGame bowlingGame = new BowlingGame(Arrays.asList(new RoundResult(10, 0),new RoundResult(10, 0)));

        Integer score = bowlingGame.playBowling();

        Integer expectResult = 30;
        Assertions.assertEquals(expectResult, score);
    }

}
