package de.niklas.chat.client.communication.receiveListener.specific;

public interface ISpecificReceiveListener<T> {
    void handleMessageFromServer();

    void setData(T data);
}
