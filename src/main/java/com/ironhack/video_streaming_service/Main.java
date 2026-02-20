package com.ironhack.video_streaming_service;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie(
                "Fury",
                123,
                4.5
        );

        TvSeries tvSeries = new TvSeries(
                "Barbarians",
                330,
                6
        );

        System.out.println(movie.getInfo());
        System.out.println(tvSeries.getInfo());
    }
}
