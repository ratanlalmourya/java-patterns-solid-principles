package com.example.factorymethod;

import com.example.factorymethod.message.Message;
import com.example.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }



}
