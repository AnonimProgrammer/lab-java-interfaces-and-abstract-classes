package com.ironhack.video_streaming_service;

public class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        setEpisodes(episodes);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                ", Episodes: " + episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        if (episodes <= 0) {
            throw new IllegalArgumentException("Episodes number must be positive");
        }
        this.episodes = episodes;
    }
}
