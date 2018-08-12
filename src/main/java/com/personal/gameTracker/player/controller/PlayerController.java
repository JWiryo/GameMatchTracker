package com.personal.gameTracker.player.controller;

import com.personal.gameTracker.player.dto.PlayerRequestDto;
import com.personal.gameTracker.player.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping(method = RequestMethod.GET)
    public Long insertNewPlayerDetail(
            @RequestParam String firstName,
            @RequestParam String lastName
    ) {
        PlayerRequestDto playerRequestDto = new PlayerRequestDto();
        playerRequestDto.setFirstName(firstName);
        playerRequestDto.setLastName(lastName);
        return playerService.insertNewPlayer(playerRequestDto);
    }
}
