package com.voicepin.example.client.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

    @JsonProperty("Status")
    protected Status status;

    @JsonProperty("Description")
    protected String description;

    public Response() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status value) {
        this.status = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }
}