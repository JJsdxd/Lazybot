import Events.InteractionEventListener;
import Events.MessageEventListener;
import Events.ReadyeventListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class Lazybot {
    public static void main(String[] args) throws LoginException {
        JDABuilder jdaBuilder=JDABuilder.createDefault("MTA5NzA2MjUyODUzOTk2MzQ0Mw.GUYeKf.905FysuoJGhqfZlBNXGpJc-S4hHBDFJoD0kLto");

        JDA jda= jdaBuilder
                .enableIntents(GatewayIntent.MESSAGE_CONTENT,GatewayIntent.GUILD_MESSAGES)
                .addEventListeners(new ReadyeventListener(),new MessageEventListener(),new InteractionEventListener())
                .build();
        jda.upsertCommand("slash-cmd","This is a Slash Command").setGuildOnly(true).queue();
        jda.upsertCommand("help","List all Commands").setGuildOnly(true).queue();
        jda.upsertCommand("quiz","starts a random quiz").setGuildOnly(false).queue();

    }
}
