package com.phinacio.udemy.listener.music.service.gateway.repository;


import com.phinacio.udemy.listener.music.service.domain.Music;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MusicRepository extends CrudRepository<Music, UUID> {

}