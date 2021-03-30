package my.test.addon;

import com.github.sanctum.myessentials.api.CommandData;
import com.github.sanctum.myessentials.api.EssentialsAddon;
import com.github.sanctum.myessentials.model.CommandBuilder;
import my.test.addon.CommandTest;
import my.test.addon.MyTest;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.bukkit.event.Listener;

public class MyConnection extends EssentialsAddon {

	private final Collection<Listener> LISTENERS = new HashSet<>();

	private final Map<CommandData, Class<? extends CommandBuilder>> COMMANDS = new HashMap<>();

	private final Map<Object, Object> DATA = new HashMap<>();

	@Override
	public boolean persist() {
		return true;
	}

	@Override
	public EssentialsAddon getInstance() {
		return this;
	}

	@Override
	public String[] getAuthors() {
		return new String[]{"Hempfest"};
	}

	@Override
	public String getAddonName() {
		return "myTest";
	}

	@Override
	public String getAddonDescription() {
		return "A test";
	}

	@Override
	public Collection<Listener> getListeners() {
		return LISTENERS;
	}

	@Override
	public Map<CommandData, Class<? extends CommandBuilder>> getCommands() {
		return COMMANDS;
	}

	@Override
	public Map<Object, Object> getData() {
		return DATA;
	}

	@Override
	protected void apply() {
		// register the commands
		COMMANDS.put(MyTest.perms, CommandTest.class);

		// register any listeners
		//
		// LISTENERS.add(new MyListener);

		// encapsulate any data we want to retrieve from other plugins
		// DATA.put("Test", 40);
		// DATA.put(key, Map<?, ?>);

	}
}
