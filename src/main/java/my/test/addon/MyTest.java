package my.test.addon;

import com.github.sanctum.myessentials.api.CommandData;
import org.jetbrains.annotations.NotNull;

public enum MyTest implements CommandData {
	perms;



	@Override
	public @NotNull String getLabel() {
		return "test";
	}

	@Override
	public @NotNull String getUsage() {
		return "/test";
	}

	@Override
	public @NotNull String getDescription() {
		return "View test";
	}

	@Override
	public @NotNull String getPermissionNode() {
		return "mess.test";
	}
}
