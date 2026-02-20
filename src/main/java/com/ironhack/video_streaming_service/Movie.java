package com.ironhack.video_streaming_service;

public class Movie extends Video {
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        setRating(rating);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                ", Rating: " + rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating < 0) {
            throw new IllegalArgumentException("Rating cannot be less than 0.");
        }
        this.rating = rating;
    }
}
