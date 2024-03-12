package com.example.factorymethod;

import com.example.factorymethod.message.JSONMessage;
import com.example.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
	
}
