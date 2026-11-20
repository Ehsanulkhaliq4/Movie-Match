package com.virtualsociety.model;

public class Movie {
    private String title;
    private String description;
    private float[] embedding;

    public Movie() {
    }

    public Movie(String title, String description, float[] embedding) {
        this.embedding = embedding;
        this.description = description;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float[] getEmbedding() {
        return embedding;
    }

    public void setEmbedding(float[] embedding) {
        this.embedding = embedding;
    }
}
