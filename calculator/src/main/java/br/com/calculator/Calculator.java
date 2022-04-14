package br.com.calculator;

public class Calculator {
    private final long id;
    private final String content;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Calculator(long id, String content) {
        this.id = id;
        this.content = content;


    }
}
