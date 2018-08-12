package com.personal.gameTracker.player.repository;

import com.personal.gameTracker.player.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

    List<Player> findByLastName(String lastName);
}
