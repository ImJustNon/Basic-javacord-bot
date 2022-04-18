package com.discord.bots.commands;

import com.discord.bots.config.config;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class ping implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent message){
        if(message.getMessageContent().equalsIgnoreCase(config.prefix + "ping")){
            message.getChannel().sendMessage("pong!");
        }
    }
}
