package com.personal.gameTracker.player.service.impl;

import com.personal.gameTracker.player.converter.PlayerRequestConverter;
import com.personal.gameTracker.player.dao.PlayerDao;
import com.personal.gameTracker.player.dto.PlayerRequestDto;
import com.personal.gameTracker.player.model.Player;
import com.personal.gameTracker.player.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerDao playerDao;

    @Autowired
    private PlayerRequestConverter playerRequestConverter;

    @Override
    public Long insertNewPlayer(PlayerRequestDto playerRequestDto) {
        Player newPlayer = playerRequestConverter.convert(playerRequestDto);
        return playerDao.createNewPlayer(newPlayer);
    }
}
