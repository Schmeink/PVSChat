package de.niklas.chat.server.sender;

import de.niklas.chat.model.data.GeneralData;

import java.io.IOException;

public interface IToClientSender {

    void send(GeneralData data) throws IOException;
}
