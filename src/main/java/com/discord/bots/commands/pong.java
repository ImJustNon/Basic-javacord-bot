package com.discord.bots.commands;

import com.discord.bots.config.config;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class pong implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent message){
        if(message.getMessageContent().equalsIgnoreCase(config.prefix + "pong")){
            message.getChannel().sendMessage("ping!");
        }
    }
}

