package com.ironhack.video_streaming_service;

public abstract class Video {
    private String title;
    private int duration;

    public Video(String title, int duration) {
        setTitle(title);
        setDuration(duration);
    }

    public String getInfo() {
        return "Title: '" + title + '\'' +
                ", Duration: " + duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("Title cannot be null");
        }
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration <= 0) {
            throw new IllegalArgumentException("Duration must be positive");
        }
        this.duration = duration;
    }
}
