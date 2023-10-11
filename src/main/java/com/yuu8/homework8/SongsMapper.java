package com.yuu8.homework8;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper

public interface SongsMapper {
    @Select("SELECT * FROM songs")
    List<Songs> findAll();

    @Select("SELECT music FROM songs WHERE id = #{id}")
    String findMusic(int id);
}
