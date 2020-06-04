package com.tdd.exam;

public class RoundResult {
    private Integer score;
    private ScoreType scoreType;

    public RoundResult(Integer score, ScoreType scoreType) {
        this.score = score;
        this.scoreType = scoreType;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public ScoreType getScoreType() {
        return scoreType;
    }

    public void setScoreType(ScoreType scoreType) {
        this.scoreType = scoreType;
    }
}
