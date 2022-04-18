package com.discord.bots;

import com.discord.bots.commands.ping;
import com.discord.bots.commands.pong;
import com.discord.bots.config.config;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {
    public static void main(String[] args){

        String Token = config.token;

        DiscordApi client = new DiscordApiBuilder().setToken(Token).login().join();

        client.addListener(new ping());
        client.addListener(new pong());

        System.out.println("Bot Is Online");
    }
}
