package com.personal.gameTracker.player.service;

import com.personal.gameTracker.player.dto.PlayerRequestDto;

public interface PlayerService {

    Long insertNewPlayer(PlayerRequestDto playerRequestDto);
}
