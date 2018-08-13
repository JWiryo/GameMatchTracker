package com.personal.gameTracker.player.dao.impl;

import com.personal.gameTracker.player.dao.PlayerDao;
import com.personal.gameTracker.player.model.Player;
import com.personal.gameTracker.player.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerDaoImpl implements PlayerDao {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Long createNewPlayer(Player player) {
        return playerRepository.saveAndFlush(player).getPlayerId();
    }
}
