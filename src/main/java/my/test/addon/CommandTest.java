package my.test.addon;

import com.github.sanctum.myessentials.model.CommandBuilder;
import java.util.List;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CommandTest extends CommandBuilder {
	public CommandTest() {
		super(MyTest.perms);
	}

	@Override
	public @Nullable List<String> tabComplete(@NotNull Player player, @NotNull String s, @NotNull String[] strings) throws IllegalArgumentException {
		return null;
	}

	@Override
	public boolean playerView(@NotNull Player player, @NotNull String s, @NotNull String[] strings) {

		if (strings.length == 0) {
			sendMessage(player, "Its working, our test works :)");
			return true;
		}

		return false;
	}

	@Override
	public boolean consoleView(@NotNull CommandSender commandSender, @NotNull String s, @NotNull String[] strings) {
		return false;
	}
}
