package com.yuu8.homework8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SongsController {

    private final SongsService songsService;

    public SongsController(SongsService songsService) {
        this.songsService = songsService;
    }

    @GetMapping("/songs")
    public List<Songs> getsongs(@RequestParam("favoriteSongs") String favoriteSongs) {
        List<Songs> songs = songsService.getSongs();
        return songs;
    }
}
