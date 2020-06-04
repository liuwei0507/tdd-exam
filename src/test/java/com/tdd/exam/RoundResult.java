package com.tdd.exam;

public class RoundResult {
    private Integer firstThrowBalls;
    private Integer secondThrowBalls;

    public RoundResult(Integer firstThrowBalls, Integer secondThrowBalls) {
        this.firstThrowBalls = firstThrowBalls;
        this.secondThrowBalls = secondThrowBalls;
    }

    public Integer getFirstThrowBalls() {
        return firstThrowBalls;
    }

    public void setFirstThrowBalls(Integer firstThrowBalls) {
        this.firstThrowBalls = firstThrowBalls;
    }

    public Integer getSecondThrowBalls() {
        return secondThrowBalls;
    }

    public void setSecondThrowBalls(Integer secondThrowBalls) {
        this.secondThrowBalls = secondThrowBalls;
    }
}
