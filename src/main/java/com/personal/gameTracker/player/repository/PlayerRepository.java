package com.personal.gameTracker.player.repository;

import com.personal.gameTracker.player.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "player")
public interface PlayerRepository extends JpaRepository<Player, Long> {

    List<Player> findByLastName(@Param("lastName") String lastName);
}
