package de.niklas.chat.server.requestProcession.specific;

import com.elfo.chat.model.data.Client;
import de.niklas.chat.model.data.User;
import de.niklas.chat.model.exception.ServerException;
import com.elfo.chat.server.util.ClientContainer;

import java.io.IOException;
import java.util.Set;

public interface ISpecificRequestProcessor<T> {

    void processRequest(User requestingUser, Set<User> users) throws IOException, ServerException;

    void setData(T data);
}
