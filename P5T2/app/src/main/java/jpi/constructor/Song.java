package jpi.constructor;

public class Song {
    private String title;
    private String author;
    private int length;

    public Song(String title, String author, int length) {
        this.title = title;
        this.author = author;
        this.length = length;
    }

    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public int getLength() { return this.length; }

    public boolean equals(Object compared) {
        if (this == compared) return true;
        if (!(compared instanceof Song)) return false;

        Song comparedSong = (Song) compared;

        if (this.title == comparedSong.title &&
            this.author == comparedSong.author && 
            this.length == comparedSong.length) return true;

        return false;
    }
}
