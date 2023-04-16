package Events;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class InteractionEventListener extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        super.onSlashCommandInteraction(event);
        //System.out.println("Interaction!");
        //event.reply("Hello There").setEphemeral(true).queue();
        //System.out.println(event.getName());
        switch(event.getName()){
            case "quiz":
                event.reply("U really want a quiz?").setEphemeral(true).queue();
        }

    }
}
