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
    void should_get_30_scores_when_play_bowling_given_first_round_first_throw_10_balls_and_second_round_first_throw_10_balls() {
        BowlingGame bowlingGame = new BowlingGame(Arrays.asList(new RoundResult(10, 0),new RoundResult(10, 0)));

        Integer score = bowlingGame.playBowling();

        Integer expectResult = 30;
        Assertions.assertEquals(expectResult, score);
    }

    @Test
    void should_get_30_scores_when_play_bowling_given_first_round_first_throw_10_balls_and_second_round_first_throw_4_balls_second_throw_6_balls() {
        BowlingGame bowlingGame = new BowlingGame(Arrays.asList(new RoundResult(10, 0),new RoundResult(4, 6)));

        Integer score = bowlingGame.playBowling();

        Integer expectResult = 30;
        Assertions.assertEquals(expectResult, score);
    }

    @Test
    void should_get_28_scores_when_play_bowling_given_first_round_first_throw_10_balls_and_second_round_first_throw_4_balls_second_throw_5_balls() {
        BowlingGame bowlingGame = new BowlingGame(Arrays.asList(new RoundResult(10, 0),new RoundResult(4, 5)));

        Integer score = bowlingGame.playBowling();

        Integer expectResult = 28;
        Assertions.assertEquals(expectResult, score);
    }

    @Test
    void should_get_30_scores_when_play_bowling_given_first_round_first_throw_4_balls_second_throw_6_balls_and_second_round_first_throw_10_balls() {
        BowlingGame bowlingGame = new BowlingGame(Arrays.asList(new RoundResult(4, 6),new RoundResult(10, 0)));

        Integer score = bowlingGame.playBowling();

        Integer expectResult = 30;
        Assertions.assertEquals(expectResult, score);
    }

    @Test
    void should_get_23_scores_when_play_bowling_given_first_round_first_throw_4_balls_second_throw_6_balls_and_second_round_first_throw_4_balls_second_throw_5_balls() {
        BowlingGame bowlingGame = new BowlingGame(Arrays.asList(new RoundResult(4, 6),new RoundResult(4, 5)));

        Integer score = bowlingGame.playBowling();

        Integer expectResult = 23;
        Assertions.assertEquals(expectResult, score);
    }

    @Test
    void should_get_60_scores_when_play_bowling_given_first_round_strike_and_second_round_strike_and_third_round_strike() {
        BowlingGame bowlingGame = new BowlingGame(Arrays.asList(new RoundResult(10, 0),new RoundResult(10, 0),new RoundResult(10, 0)));

        Integer score = bowlingGame.playBowling();

        Integer expectResult = 60;
        Assertions.assertEquals(expectResult, score);
    }

    @Test
    void should_get_50_scores_when_play_bowling_given_tenth_round_strike_and_add_throw_4_balls_and_5_balls() {
        BowlingGame bowlingGame = new BowlingGame(Arrays.asList(
                new RoundResult(4, 6),
                new RoundResult(10, 0),
                new RoundResult(10, 0),
                new RoundResult(10, 0),
                new RoundResult(10, 0),
                new RoundResult(10, 0),
                new RoundResult(4, 5),
                new RoundResult(4, 6),
                new RoundResult(4, 6),
                new RoundResult(10, 0),
                new RoundResult(4, 6)));
        Integer score = bowlingGame.playBowling();

        Integer expectResult = 232;
        Assertions.assertEquals(expectResult, score);
    }

}
