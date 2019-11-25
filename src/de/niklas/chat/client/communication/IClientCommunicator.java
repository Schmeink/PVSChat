package de.niklas.chat.client.communication;

import de.niklas.chat.client.communication.receiveListener.general.IReceiveListener;
import de.niklas.chat.model.data.GeneralData;

import java.io.IOException;

public interface IClientCommunicator {
    void send(GeneralData data) throws IOException;

    void startReceivingServerMessages(IReceiveListener receiveListener);

}
