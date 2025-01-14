package com.voicepin.example.client.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VerifyResponse extends Response {

    @JsonProperty("Score")
    protected double score;

    @JsonProperty("Decision")
    protected VerifyStatus decision;

    public double getScore() {
        return score;
    }

    public void setScore(double value) {
        this.score = value;
    }

    public VerifyStatus getDecision() {
        return decision;
    }

    public void setDecision(VerifyStatus value) {
        this.decision = value;
    }
}
