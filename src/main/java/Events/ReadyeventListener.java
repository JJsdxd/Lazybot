package Events;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;

public class ReadyeventListener implements EventListener {
    @Override
    public void onEvent(GenericEvent event){
        if (event instanceof ReadyEvent)
            System.out.println("Bot is  ready");
    }
}
