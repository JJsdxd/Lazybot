package Events;

import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class MessageEventListener extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        super.onMessageReceived(event);
        ArrayList<String> sourceChannelIds=new ArrayList<>(Arrays.asList("1026804892943253504","1072098129828122677"));

        String sourceId=event.getChannel().getId();
        if (sourceChannelIds.contains(event.getChannel().getId())){

            sourceChannelIds.remove(sourceId);
            if (!(event.getAuthor().getAsTag().equals("#0000"))) {
                for (String sourceChannelId : sourceChannelIds) {
                    TextChannel textChannel = event.getJDA().getTextChannelById(sourceChannelId);
                    try {
                        textChannel.sendMessageFormat(event.getMessage().getContentRaw()).queue();
                    } catch (NullPointerException e) {
                    }
                    System.out.println("user sent " + event.getChannel().getId());
                }
            }
        }
        System.out.println("user sent "+event.getChannel().getId());
        System.out.println(" "+event.getMessage().getContentDisplay());
    }
}
