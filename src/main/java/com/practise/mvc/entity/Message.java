package com.practise.mvc.entity;

public class Message {

    private String text;

    private String adjective;

    public Message(String text) {
        this.text = text;
    }

    public Message() {
    }

    public Message(String text, String adjective) {
        this.text = text;
        this.adjective = adjective;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
