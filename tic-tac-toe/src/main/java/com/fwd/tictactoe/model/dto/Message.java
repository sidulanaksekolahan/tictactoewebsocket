package com.fwd.tictactoe.model.dto;

public interface Message {
    String getType();
    String getGameId();
    String getContent();
}
