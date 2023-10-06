package com.yuu8.homework8;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongsService {

    private final SongsMapper songsMapper;

    public SongsService(SongsMapper songsMapper) {
        this.songsMapper = songsMapper;
    }

    public List<Songs> getSongs() {
        List<Songs> songs = songsMapper.findAll();
        return songs;
    }
}
