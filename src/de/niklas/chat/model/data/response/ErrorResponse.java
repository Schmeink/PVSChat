package de.niklas.chat.model.data.response;

import de.niklas.chat.model.data.GeneralData;

public class ErrorResponse extends GeneralData {
    private int err;

    public ErrorResponse(int err) {
        super(-1);
        this.err = err;
    }

    public int getErr() {
        return err;
    }

    public void setErr(int err) {
        this.err = err;
    }
}
