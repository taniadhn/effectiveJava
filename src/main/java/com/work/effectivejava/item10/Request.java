package com.work.effectivejava.item10;

public class Request {

    public String header;
    public String body;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
/*
    @Override
    public String toString() {
        return "Request{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                '}';
    }*/

    //Bize Json type'da veriyi getirecektir
public String toString() {
	return new com.google.gson.Gson().toJson(this);
	}
}
