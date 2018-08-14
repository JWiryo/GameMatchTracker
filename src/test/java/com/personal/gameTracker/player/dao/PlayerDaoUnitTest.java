package com.personal.gameTracker.player.dao;

import com.personal.gameTracker.player.dao.impl.PlayerDaoImpl;
import com.personal.gameTracker.player.model.Player;
import com.personal.gameTracker.player.repository.PlayerRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PlayerDaoUnitTest {

    @InjectMocks
    private PlayerDaoImpl playerDao;

    @Mock
    private PlayerRepository playerRepository;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createNewPlayer() {
        // Given
        Player player = new Player();
        Long originalPlayerId = Long.valueOf(1);
        player.setPlayerId(originalPlayerId);

        when(playerRepository.saveAndFlush(player)).thenReturn(player);

        // When
        Long returnedPlayerId = playerDao.createNewPlayer(player);

        // Then
        assertNotNull(returnedPlayerId);
        assertEquals(originalPlayerId, returnedPlayerId);

    }
}