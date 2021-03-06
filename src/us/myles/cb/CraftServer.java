package us.myles.cb;

import us.myles.classtrap.TrapTag;
import us.myles.classtrap.TrapTagType;

//org.bukkit.craftbukkit.v1_7_R3.CraftServer
@TrapTag
public interface CraftServer {
	public void shutdown();
	public java.lang.String toString();
	public java.lang.String getName();
	public org.bukkit.UnsafeValues getUnsafe();
	public java.util.logging.Logger getLogger();
	public us.myles.cb.map.CraftMapView createMap(org.bukkit.World arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "createMap")
	public org.bukkit.map.MapView createMap2(org.bukkit.World arg0);
	public org.bukkit.map.MapView getMap(short arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "getMap")
	public us.myles.cb.map.CraftMapView getMap2(short arg0);
	public us.myles.nms.DedicatedPlayerList getHandle();
	public int getPort();
	public us.myles.nms.MinecraftServer getServer();
	public void setWhitelist(boolean arg0);
	public java.lang.String getVersion();
	public java.lang.String getIp();
	public int getMaxPlayers();
	public java.lang.String getWorldType();
	public java.lang.String getServerId();
	public java.lang.String getServerName();
	public boolean getAllowEnd();
	public boolean hasWhitelist();
	public int getIdleTimeout();
	public org.bukkit.scoreboard.ScoreboardManager getScoreboardManager();
	@TrapTag(type = TrapTagType.METHOD, value = "getScoreboardManager")
	public us.myles.cb.scoreboard.CraftScoreboardManager getScoreboardManager2();
	public org.bukkit.World getWorld(java.util.UUID arg0);
	public org.bukkit.World getWorld(java.lang.String arg0);
	public java.util.List getWorlds();
	public org.bukkit.entity.Player getPlayer(java.lang.String arg0);
	public org.bukkit.entity.Player getPlayer(us.myles.nms.EntityPlayer arg0);
	public org.bukkit.entity.Player getPlayer(java.util.UUID arg0);
	public org.bukkit.plugin.PluginManager getPluginManager();
	public org.bukkit.OfflinePlayer getOfflinePlayer(us.myles.nms.GameProfile arg0);
	public org.bukkit.OfflinePlayer getOfflinePlayer(java.lang.String arg0);
	public org.bukkit.OfflinePlayer getOfflinePlayer(java.util.UUID arg0);
	public void addWorld(org.bukkit.World arg0);
	public java.util.List matchPlayer(java.lang.String arg0);
	public boolean addRecipe(org.bukkit.inventory.Recipe arg0);
	public java.util.Set getIPBans();
	public void unbanIP(java.lang.String arg0);
	public java.util.Set getOperators();
	public org.bukkit.plugin.messaging.Messenger getMessenger();
	public org.bukkit.help.HelpMap getHelpMap();
	public org.bukkit.util.CachedServerIcon getServerIcon();
	@TrapTag(type = TrapTagType.METHOD, value = "getServerIcon")
	public us.myles.cb.util.CraftIconCache getServerIcon2();
	public void savePlayers();
	public void clearRecipes();
	public void resetRecipes();
	public boolean isHardcore();
	public void reload();
	public java.util.List getRecipesFor(org.bukkit.inventory.ItemStack arg0);
	public int broadcast(java.lang.String arg0, java.lang.String arg1);
	public us.myles.cb.scheduler.CraftScheduler getScheduler();
	@TrapTag(type = TrapTagType.METHOD, value = "getScheduler")
	public org.bukkit.scheduler.BukkitScheduler getScheduler2();
	public org.bukkit.World createWorld(org.bukkit.WorldCreator arg0);
	public org.bukkit.World createWorld(java.lang.String arg0, org.bukkit.World.Environment arg1, long arg2, org.bukkit.generator.ChunkGenerator arg3);
	public org.bukkit.World createWorld(java.lang.String arg0, org.bukkit.World.Environment arg1, org.bukkit.generator.ChunkGenerator arg2);
	public org.bukkit.World createWorld(java.lang.String arg0, org.bukkit.World.Environment arg1, long arg2);
	public org.bukkit.World createWorld(java.lang.String arg0, org.bukkit.World.Environment arg1);
	public void banIP(java.lang.String arg0);
	public boolean unloadWorld(java.lang.String arg0, boolean arg1);
	public boolean unloadWorld(org.bukkit.World arg0, boolean arg1);
	public org.bukkit.BanList getBanList(org.bukkit.BanList.Type arg0);
	public java.lang.String getMotd();
	public boolean getOnlineMode();
	public us.myles.cb.metadata.EntityMetadataStore getEntityMetadata();
	public org.bukkit.generator.ChunkGenerator getGenerator(java.lang.String arg0);
	public void configureDbConfig(com.avaje.ebean.config.ServerConfig arg0);
	public int getSpawnRadius();
	public void setSpawnRadius(int arg0);
	public java.lang.String getUpdateFolder();
	public org.bukkit.plugin.ServicesManager getServicesManager();
	public boolean dispatchCommand(org.bukkit.command.CommandSender arg0, java.lang.String arg1);
	public java.util.Map getCommandAliases();
	public org.bukkit.entity.Player[] getOnlinePlayers();
	public boolean getGenerateStructures();
	public void reloadWhitelist();
	public int broadcastMessage(java.lang.String arg0);
	public long getConnectionThrottle();
	public int getViewDistance();
	public int getTicksPerAnimalSpawns();
	public org.bukkit.entity.Player getPlayerExact(java.lang.String arg0);
	public java.lang.String getBukkitVersion();
	public java.util.Set getWhitelistedPlayers();
	public java.io.File getUpdateFolderFile();
	public org.bukkit.command.PluginCommand getPluginCommand(java.lang.String arg0);
	public boolean getAllowNether();
	public int getTicksPerMonsterSpawns();
	public java.util.Iterator recipeIterator();
	public org.bukkit.GameMode getDefaultGameMode();
	public boolean useExactLoginLocation();
	public java.util.Set getBannedPlayers();
	public java.io.File getWorldContainer();
	public int getMonsterSpawnLimit();
	public int getAnimalSpawnLimit();
	public int getWaterAnimalSpawnLimit();
	public int getAmbientSpawnLimit();
	public boolean isPrimaryThread();
	public boolean getAllowFlight();
	public org.bukkit.command.ConsoleCommandSender getConsoleSender();
	public org.bukkit.inventory.Inventory createInventory(org.bukkit.inventory.InventoryHolder arg0, org.bukkit.event.inventory.InventoryType arg1, java.lang.String arg2);
	public org.bukkit.inventory.Inventory createInventory(org.bukkit.inventory.InventoryHolder arg0, org.bukkit.event.inventory.InventoryType arg1);
	public org.bukkit.inventory.Inventory createInventory(org.bukkit.inventory.InventoryHolder arg0, int arg1);
	public org.bukkit.inventory.Inventory createInventory(org.bukkit.inventory.InventoryHolder arg0, int arg1, java.lang.String arg2);
	public org.bukkit.OfflinePlayer[] getOfflinePlayers();
	public java.lang.String getShutdownMessage();
	public void setDefaultGameMode(org.bukkit.GameMode arg0);
	public org.bukkit.util.CachedServerIcon loadServerIcon(java.awt.image.BufferedImage arg0);
	public org.bukkit.util.CachedServerIcon loadServerIcon(java.io.File arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "loadServerIcon")
	public us.myles.cb.util.CraftIconCache loadServerIcon2(java.io.File arg0);
	@TrapTag(type = TrapTagType.METHOD, value = "loadServerIcon")
	public us.myles.cb.util.CraftIconCache loadServerIcon2(java.awt.image.BufferedImage arg0);
	public us.myles.cb.inventory.CraftItemFactory getItemFactory();
	@TrapTag(type = TrapTagType.METHOD, value = "getItemFactory")
	public org.bukkit.inventory.ItemFactory getItemFactory2();
	public void setIdleTimeout(int arg0);
	public void sendPluginMessage(org.bukkit.plugin.Plugin arg0, java.lang.String arg1, byte[] arg2);
	public java.util.Set getListeningPluginChannels();
	public org.bukkit.Warning.WarningState getWarningState();
	public us.myles.cb.metadata.PlayerMetadataStore getPlayerMetadata();
	public int getBukkitSpawnRadius();
	public void removeBukkitSpawnRadius();
	public void checkSaveState();
	public us.myles.cb.metadata.WorldMetadataStore getWorldMetadata();
	public java.util.List tabCompleteChat(org.bukkit.entity.Player arg0, java.lang.String arg1);
	public java.util.List tabCompleteCommand(org.bukkit.entity.Player arg0, java.lang.String arg1);
	public void detectListNameConflict(us.myles.nms.EntityPlayer arg0);
	public void enablePlugins(org.bukkit.plugin.PluginLoadOrder arg0);
	public java.util.List tabComplete(us.myles.nms.ICommandListener arg0, java.lang.String arg1);
	public org.bukkit.craftbukkit.libs.jline.console.ConsoleReader getReader();
	public void onPlayerJoin(org.bukkit.entity.Player arg0);
	public org.bukkit.command.SimpleCommandMap getCommandMap();
	public void loadPlugins();
	public boolean getCommandBlockOverride(java.lang.String arg0);
	public int getPingPacketLimit();
	public boolean getQueryPlugins();
	public boolean getWarnOnOverload();
	public void disablePlugins();
	public boolean dispatchServerCommand(org.bukkit.command.CommandSender arg0, us.myles.nms.ServerCommand arg1);
}
