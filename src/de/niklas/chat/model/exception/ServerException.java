package de.niklas.chat.model.exception;

import de.niklas.chat.model.data.response.ErrorResponse;

public abstract class ServerException extends Exception {
    public ServerException(String errorMsg) {
        super(errorMsg);
    }

    public abstract ErrorResponse getError();
}
