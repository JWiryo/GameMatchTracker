package com.personal.gameTracker.player.converter;

import com.personal.gameTracker.player.dto.PlayerRequestDto;
import com.personal.gameTracker.player.model.Player;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class PlayerRequestConverter implements Converter<PlayerRequestDto, Player> {

    @Override
    public Player convert(PlayerRequestDto source) {
        String playerUUID = UUID.randomUUID().toString();

        return Player.builder()
                .playerUUID(playerUUID)
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .build();
    }

}
