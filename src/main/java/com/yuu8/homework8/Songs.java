package com.yuu8.homework8;

public class Songs {
    private int id;

    private String music;

    private String singer;

    public Songs(int id, String music, String singer) {
        this.id = id;
        this.music = music;
        this.singer = singer;
    }

    public int getId() {
        return id;
    }

    public String getMusic() {
        return music;
    }

    public String getSinger() {
        return singer;
    }
}
