package doublePlugin.entity.player;

import org.bukkit.*;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.block.Sign;
import org.bukkit.block.data.BlockData;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.*;
import org.bukkit.entity.memory.MemoryKey;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.*;
import org.bukkit.map.MapView;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.profile.PlayerProfile;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

import java.net.InetSocketAddress;
import java.util.*;

public class NewPlayerObject extends PlayerInfoObject {
	public String getName() {
		return player.getName();
	}

	public String getDisplayName() {
		return player.getDisplayName();
	}

	public void setDisplayName(String name) {
		player.setDisplayName(name);
	}

	public String getPlayerListName() {
		return player.getPlayerListName();
	}

	public void setPlayerListName(String name) {
		player.setPlayerListName(name);
	}

	public String getPlayerListHeader() {
		return player.getPlayerListHeader();
	}

	public String getPlayerListFooter() {
		return player.getPlayerListFooter();
	}

	public void setPlayerListHeader(String header) {
		player.setPlayerListHeader(header);
	}

	public void setPlayerListFooter(String footer) {
		player.setPlayerListFooter(footer);
	}

	public void setPlayerListHeaderFooter(String header, String footer) {
		player.setPlayerListHeaderFooter(header, footer);
	}

	public void setCompassTarget(Location loc) {
		player.setCompassTarget(loc);
	}

	public Location getCompassTarget() {
		return player.getCompassTarget();
	}

	public InetSocketAddress getAddress() {
		return player.getAddress();
	}

	public void sendRawMessage(String message) {
		player.sendRawMessage(message);
	}

	public void kickPlayer(String message) {
		player.kickPlayer(message);
	}

	public void chat(String msg) {
		player.chat(msg);
	}

	public boolean performCommand(String command) {
		return player.performCommand(command);
	}

	@Deprecated
	public boolean isOnGround() {
		return player.isOnGround();
	}

	public boolean isSneaking() {
		return player.isSneaking();
	}

	public void setSneaking(boolean sneak) {
		player.setSneaking(sneak);
	}

	public boolean isSprinting() {
		return player.isSprinting();
	}

	public void setSprinting(boolean sprinting) {
		player.setSprinting(sprinting);
	}

	public void saveData() {
		player.saveData();
	}

	public void loadData() {
		player.loadData();
	}

	public void setSleepingIgnored(boolean isSleeping) {
		player.setSleepingIgnored(isSleeping);
	}

	public boolean isSleepingIgnored() {
		return player.isSleepingIgnored();
	}

	public Location getBedSpawnLocation() {
		return player.getBedSpawnLocation();
	}

	public void setBedSpawnLocation(Location location) {
		player.setBedSpawnLocation(location);
	}

	public void setBedSpawnLocation(Location location, boolean force) {
		player.setBedSpawnLocation(location, force);
	}

	@Deprecated
	public void playNote(Location loc, byte instrument, byte note) {
		player.playNote(loc, instrument, note);
	}

	public void playNote(Location loc, Instrument instrument, Note note) {
		player.playNote(loc, instrument, note);
	}

	public void playSound(Location location, Sound sound, float volume, float pitch) {
		player.playSound(location, sound, volume, pitch);
	}

	public void playSound(Location location, String sound, float volume, float pitch) {
		player.playSound(location, sound, volume, pitch);
	}

	public void playSound(Location location, Sound sound, SoundCategory category, float volume, float pitch) {
		player.playSound(location, sound, category, volume, pitch);
	}

	public void playSound(Location location, String sound, SoundCategory category, float volume, float pitch) {
		player.playSound(location, sound, category, volume, pitch);
	}

	public void playSound(Entity entity, Sound sound, float volume, float pitch) {
		player.playSound(entity, sound, volume, pitch);
	}

	public void playSound(Entity entity, Sound sound, SoundCategory category, float volume, float pitch) {
		player.playSound(entity, sound, category, volume, pitch);
	}

	public void stopSound(Sound sound) {
		player.stopSound(sound);
	}

	public void stopSound(String sound) {
		player.stopSound(sound);
	}

	public void stopSound(Sound sound, SoundCategory category) {
		player.stopSound(sound, category);
	}

	public void stopSound(String sound, SoundCategory category) {
		player.stopSound(sound, category);
	}

	public void stopSound(SoundCategory category) {
		player.stopSound(category);
	}

	public void stopAllSounds() {
		player.stopAllSounds();
	}

	@Deprecated
	public void playEffect(Location loc, Effect effect, int data) {
		player.playEffect(loc, effect, data);
	}

	public <T> void playEffect(Location loc, Effect effect, T data) {
		player.playEffect(loc, effect, data);
	}

	public boolean breakBlock(Block block) {
		return player.breakBlock(block);
	}

	@Deprecated
	public void sendBlockChange(Location loc, Material material, byte data) {
		player.sendBlockChange(loc, material, data);
	}

	public void sendBlockChange(Location loc, BlockData block) {
		player.sendBlockChange(loc, block);
	}

	public void sendBlockDamage(Location loc, float progress) {
		player.sendBlockDamage(loc, progress);
	}

	public void sendEquipmentChange(LivingEntity entity, EquipmentSlot slot, ItemStack item) {
		player.sendEquipmentChange(entity, slot, item);
	}

	public void sendSignChange(Location loc, String[] lines) throws IllegalArgumentException {
		player.sendSignChange(loc, lines);
	}

	public void sendSignChange(Location loc, String[] lines, DyeColor dyeColor) throws IllegalArgumentException {
		player.sendSignChange(loc, lines, dyeColor);
	}

	public void sendSignChange(Location loc, String[] lines, DyeColor dyeColor, boolean hasGlowingText) throws IllegalArgumentException {
		player.sendSignChange(loc, lines, dyeColor, hasGlowingText);
	}

	public void sendMap(MapView map) {
		player.sendMap(map);
	}

	public void updateInventory() {
		player.updateInventory();
	}

	public GameMode getPreviousGameMode() {
		return player.getPreviousGameMode();
	}

	public void setPlayerTime(long time, boolean relative) {
		player.setPlayerTime(time, relative);
	}

	public long getPlayerTime() {
		return player.getPlayerTime();
	}

	public long getPlayerTimeOffset() {
		return player.getPlayerTimeOffset();
	}

	public boolean isPlayerTimeRelative() {
		return player.isPlayerTimeRelative();
	}

	public void resetPlayerTime() {
		player.resetPlayerTime();
	}

	public void setPlayerWeather(WeatherType type) {
		player.setPlayerWeather(type);
	}

	public WeatherType getPlayerWeather() {
		return player.getPlayerWeather();
	}

	public void resetPlayerWeather() {
		player.resetPlayerWeather();
	}

	public void giveExp(int amount) {
		player.giveExp(amount);
	}

	public void giveExpLevels(int amount) {
		player.giveExpLevels(amount);
	}

	public float getExp() {
		return player.getExp();
	}

	public void setExp(float exp) {
		player.setExp(exp);
	}

	public int getLevel() {
		return player.getLevel();
	}

	public void setLevel(int level) {
		player.setLevel(level);
	}

	public int getTotalExperience() {
		return player.getTotalExperience();
	}

	public void setTotalExperience(int exp) {
		player.setTotalExperience(exp);
	}

	public void sendExperienceChange(float progress) {
		player.sendExperienceChange(progress);
	}

	public void sendExperienceChange(float progress, int level) {
		player.sendExperienceChange(progress, level);
	}

	public boolean getAllowFlight() {
		return player.getAllowFlight();
	}

	public void setAllowFlight(boolean flight) {
		player.setAllowFlight(flight);
	}

	@Deprecated
	public void hidePlayer(Player player) {
		this.player.hidePlayer(player);
	}

	public void hidePlayer(Plugin plugin, Player player) {
		this.player.hidePlayer(plugin, player);
	}

	@Deprecated
	public void showPlayer(Player player) {
		this.player.showPlayer(player);
	}

	public void showPlayer(Plugin plugin, Player player) {
		this.player.showPlayer(plugin, player);
	}

	public boolean canSee(Player player) {
		return this.player.canSee(player);
	}

	@Deprecated
	public void hideEntity(Plugin plugin, Entity entity) {
		player.hideEntity(plugin, entity);
	}

	@Deprecated
	public void showEntity(Plugin plugin, Entity entity) {
		player.showEntity(plugin, entity);
	}

	@Deprecated
	public boolean canSee(Entity entity) {
		return player.canSee(entity);
	}

	public boolean isFlying() {
		return player.isFlying();
	}

	public void setFlying(boolean value) {
		player.setFlying(value);
	}

	public void setFlySpeed(float value) throws IllegalArgumentException {
		player.setFlySpeed(value);
	}

	public void setWalkSpeed(float value) throws IllegalArgumentException {
		player.setWalkSpeed(value);
	}

	public float getFlySpeed() {
		return player.getFlySpeed();
	}

	public float getWalkSpeed() {
		return player.getWalkSpeed();
	}

	@Deprecated
	public void setTexturePack(String url) {
		player.setTexturePack(url);
	}

	public void setResourcePack(String url) {
		player.setResourcePack(url);
	}

	public void setResourcePack(String url, byte[] hash) {
		player.setResourcePack(url, hash);
	}

	public void setResourcePack(String url, byte[] hash, String prompt) {
		player.setResourcePack(url, hash, prompt);
	}

	public void setResourcePack(String url, byte[] hash, boolean force) {
		player.setResourcePack(url, hash, force);
	}

	public void setResourcePack(String url, byte[] hash, String prompt, boolean force) {
		player.setResourcePack(url, hash, prompt, force);
	}

	public Scoreboard getScoreboard() {
		return player.getScoreboard();
	}

	public void setScoreboard(Scoreboard scoreboard) throws IllegalArgumentException, IllegalStateException {
		player.setScoreboard(scoreboard);
	}

	public WorldBorder getWorldBorder() {
		return player.getWorldBorder();
	}

	public void setWorldBorder(WorldBorder border) {
		player.setWorldBorder(border);
	}

	public boolean isHealthScaled() {
		return player.isHealthScaled();
	}

	public void setHealthScaled(boolean scale) {
		player.setHealthScaled(scale);
	}

	public void setHealthScale(double scale) throws IllegalArgumentException {
		player.setHealthScale(scale);
	}

	public double getHealthScale() {
		return player.getHealthScale();
	}

	public Entity getSpectatorTarget() {
		return player.getSpectatorTarget();
	}

	public void setSpectatorTarget(Entity entity) {
		player.setSpectatorTarget(entity);
	}

	@Deprecated
	public void sendTitle(String title, String subtitle) {
		player.sendTitle(title, subtitle);
	}

	public void sendTitle(String title, String subtitle, int fadeIn, int stay, int fadeOut) {
		player.sendTitle(title, subtitle, fadeIn, stay, fadeOut);
	}

	public void resetTitle() {
		player.resetTitle();
	}

	public void spawnParticle(Particle particle, Location location, int count) {
		player.spawnParticle(particle, location, count);
	}

	public void spawnParticle(Particle particle, double x, double y, double z, int count) {
		player.spawnParticle(particle, x, y, z, count);
	}

	public <T> void spawnParticle(Particle particle, Location location, int count, T data) {
		player.spawnParticle(particle, location, count, data);
	}

	public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, T data) {
		player.spawnParticle(particle, x, y, z, count, data);
	}

	public void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ) {
		player.spawnParticle(particle, location, count, offsetX, offsetY, offsetZ);
	}

	public void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ) {
		player.spawnParticle(particle, x, y, z, count, offsetX, offsetY, offsetZ);
	}

	public <T> void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ, T data) {
		player.spawnParticle(particle, location, count, offsetX, offsetY, offsetZ, data);
	}

	public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ, T data) {
		player.spawnParticle(particle, x, y, z, count, offsetX, offsetY, offsetZ, data);
	}

	public void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ, double extra) {
		player.spawnParticle(particle, location, count, offsetX, offsetY, offsetZ, extra);
	}

	public void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ, double extra) {
		player.spawnParticle(particle, x, y, z, count, offsetX, offsetY, offsetZ, extra);
	}

	public <T> void spawnParticle(Particle particle, Location location, int count, double offsetX, double offsetY, double offsetZ, double extra, T data) {
		player.spawnParticle(particle, location, count, offsetX, offsetY, offsetZ, extra, data);
	}

	public <T> void spawnParticle(Particle particle, double x, double y, double z, int count, double offsetX, double offsetY, double offsetZ, double extra, T data) {
		player.spawnParticle(particle, x, y, z, count, offsetX, offsetY, offsetZ, extra, data);
	}

	public AdvancementProgress getAdvancementProgress(Advancement advancement) {
		return player.getAdvancementProgress(advancement);
	}

	public int getClientViewDistance() {
		return player.getClientViewDistance();
	}

	public int getPing() {
		return player.getPing();
	}

	public String getLocale() {
		return player.getLocale();
	}

	public void updateCommands() {
		player.updateCommands();
	}

	public void openBook(ItemStack book) {
		player.openBook(book);
	}

	public void openSign(Sign sign) {
		player.openSign(sign);
	}

	public void showDemoScreen() {
		player.showDemoScreen();
	}

	public boolean isAllowingServerListings() {
		return player.isAllowingServerListings();
	}

	public Player.Spigot spigot() {
		return player.spigot();
	}

	public PlayerInventory getInventory() {
		return player.getInventory();
	}

	public Inventory getEnderChest() {
		return player.getEnderChest();
	}

	public MainHand getMainHand() {
		return player.getMainHand();
	}

	public boolean setWindowProperty(InventoryView.Property prop, int value) {
		return player.setWindowProperty(prop, value);
	}

	public InventoryView getOpenInventory() {
		return player.getOpenInventory();
	}

	public InventoryView openInventory(Inventory inventory) {
		return player.openInventory(inventory);
	}

	public InventoryView openWorkbench(Location location, boolean force) {
		return player.openWorkbench(location, force);
	}

	public InventoryView openEnchanting(Location location, boolean force) {
		return player.openEnchanting(location, force);
	}

	public void openInventory(InventoryView inventory) {
		player.openInventory(inventory);
	}

	public InventoryView openMerchant(Villager trader, boolean force) {
		return player.openMerchant(trader, force);
	}

	public InventoryView openMerchant(Merchant merchant, boolean force) {
		return player.openMerchant(merchant, force);
	}

	public void closeInventory() {
		player.closeInventory();
	}

	@Deprecated
	public ItemStack getItemInHand() {
		return player.getItemInHand();
	}

	@Deprecated
	public void setItemInHand(ItemStack item) {
		player.setItemInHand(item);
	}

	public ItemStack getItemOnCursor() {
		return player.getItemOnCursor();
	}

	public void setItemOnCursor(ItemStack item) {
		player.setItemOnCursor(item);
	}

	public boolean hasCooldown(Material material) {
		return player.hasCooldown(material);
	}

	public int getCooldown(Material material) {
		return player.getCooldown(material);
	}

	public void setCooldown(Material material, int ticks) {
		player.setCooldown(material, ticks);
	}

	public int getSleepTicks() {
		return player.getSleepTicks();
	}

	public boolean sleep(Location location, boolean force) {
		return player.sleep(location, force);
	}

	public void wakeup(boolean setSpawnLocation) {
		player.wakeup(setSpawnLocation);
	}

	public Location getBedLocation() {
		return player.getBedLocation();
	}

	public GameMode getGameMode() {
		return player.getGameMode();
	}

	public void setGameMode(GameMode mode) {
		player.setGameMode(mode);
	}

	public boolean isBlocking() {
		return player.isBlocking();
	}

	public boolean isHandRaised() {
		return player.isHandRaised();
	}

	public ItemStack getItemInUse() {
		return player.getItemInUse();
	}

	public int getExpToLevel() {
		return player.getExpToLevel();
	}

	public float getAttackCooldown() {
		return player.getAttackCooldown();
	}

	public boolean discoverRecipe(NamespacedKey recipe) {
		return player.discoverRecipe(recipe);
	}

	public int discoverRecipes(Collection<NamespacedKey> recipes) {
		return player.discoverRecipes(recipes);
	}

	public boolean undiscoverRecipe(NamespacedKey recipe) {
		return player.undiscoverRecipe(recipe);
	}

	public int undiscoverRecipes(Collection<NamespacedKey> recipes) {
		return player.undiscoverRecipes(recipes);
	}

	public boolean hasDiscoveredRecipe(NamespacedKey recipe) {
		return player.hasDiscoveredRecipe(recipe);
	}

	public Set<NamespacedKey> getDiscoveredRecipes() {
		return player.getDiscoveredRecipes();
	}

	@Deprecated
	public Entity getShoulderEntityLeft() {
		return player.getShoulderEntityLeft();
	}

	@Deprecated
	public void setShoulderEntityLeft(Entity entity) {
		player.setShoulderEntityLeft(entity);
	}

	@Deprecated
	public Entity getShoulderEntityRight() {
		return player.getShoulderEntityRight();
	}

	@Deprecated
	public void setShoulderEntityRight(Entity entity) {
		player.setShoulderEntityRight(entity);
	}

	public boolean dropItem(boolean dropAll) {
		return player.dropItem(dropAll);
	}

	public float getExhaustion() {
		return player.getExhaustion();
	}

	public void setExhaustion(float value) {
		player.setExhaustion(value);
	}

	public float getSaturation() {
		return player.getSaturation();
	}

	public void setSaturation(float value) {
		player.setSaturation(value);
	}

	public int getFoodLevel() {
		return player.getFoodLevel();
	}

	public void setFoodLevel(int value) {
		player.setFoodLevel(value);
	}

	public int getSaturatedRegenRate() {
		return player.getSaturatedRegenRate();
	}

	public void setSaturatedRegenRate(int ticks) {
		player.setSaturatedRegenRate(ticks);
	}

	public int getUnsaturatedRegenRate() {
		return player.getUnsaturatedRegenRate();
	}

	public void setUnsaturatedRegenRate(int ticks) {
		player.setUnsaturatedRegenRate(ticks);
	}

	public int getStarvationRate() {
		return player.getStarvationRate();
	}

	public void setStarvationRate(int ticks) {
		player.setStarvationRate(ticks);
	}

	public Location getLastDeathLocation() {
		return player.getLastDeathLocation();
	}

	public void setLastDeathLocation(Location location) {
		player.setLastDeathLocation(location);
	}

	public double getEyeHeight() {
		return player.getEyeHeight();
	}

	public double getEyeHeight(boolean ignorePose) {
		return player.getEyeHeight(ignorePose);
	}

	public Location getEyeLocation() {
		return player.getEyeLocation();
	}

	public List<Block> getLineOfSight(Set<Material> transparent, int maxDistance) {
		return player.getLineOfSight(transparent, maxDistance);
	}

	public Block getTargetBlock(Set<Material> transparent, int maxDistance) {
		return player.getTargetBlock(transparent, maxDistance);
	}

	public List<Block> getLastTwoTargetBlocks(Set<Material> transparent, int maxDistance) {
		return player.getLastTwoTargetBlocks(transparent, maxDistance);
	}

	public Block getTargetBlockExact(int maxDistance) {
		return player.getTargetBlockExact(maxDistance);
	}

	public Block getTargetBlockExact(int maxDistance, FluidCollisionMode fluidCollisionMode) {
		return player.getTargetBlockExact(maxDistance, fluidCollisionMode);
	}

	public RayTraceResult rayTraceBlocks(double maxDistance) {
		return player.rayTraceBlocks(maxDistance);
	}

	public RayTraceResult rayTraceBlocks(double maxDistance, FluidCollisionMode fluidCollisionMode) {
		return player.rayTraceBlocks(maxDistance, fluidCollisionMode);
	}

	public int getRemainingAir() {
		return player.getRemainingAir();
	}

	public void setRemainingAir(int ticks) {
		player.setRemainingAir(ticks);
	}

	public int getMaximumAir() {
		return player.getMaximumAir();
	}

	public void setMaximumAir(int ticks) {
		player.setMaximumAir(ticks);
	}

	public int getArrowCooldown() {
		return player.getArrowCooldown();
	}

	public void setArrowCooldown(int ticks) {
		player.setArrowCooldown(ticks);
	}

	public int getArrowsInBody() {
		return player.getArrowsInBody();
	}

	public void setArrowsInBody(int count) {
		player.setArrowsInBody(count);
	}

	public int getMaximumNoDamageTicks() {
		return player.getMaximumNoDamageTicks();
	}

	public void setMaximumNoDamageTicks(int ticks) {
		player.setMaximumNoDamageTicks(ticks);
	}

	public double getLastDamage() {
		return player.getLastDamage();
	}

	public void setLastDamage(double damage) {
		player.setLastDamage(damage);
	}

	public int getNoDamageTicks() {
		return player.getNoDamageTicks();
	}

	public void setNoDamageTicks(int ticks) {
		player.setNoDamageTicks(ticks);
	}

	public Player getKiller() {
		return player.getKiller();
	}

	public boolean addPotionEffect(PotionEffect effect) {
		return player.addPotionEffect(effect);
	}

	@Deprecated
	public boolean addPotionEffect(PotionEffect effect, boolean force) {
		return player.addPotionEffect(effect, force);
	}

	public boolean addPotionEffects(Collection<PotionEffect> effects) {
		return player.addPotionEffects(effects);
	}

	public boolean hasPotionEffect(PotionEffectType type) {
		return player.hasPotionEffect(type);
	}

	public PotionEffect getPotionEffect(PotionEffectType type) {
		return player.getPotionEffect(type);
	}

	public void removePotionEffect(PotionEffectType type) {
		player.removePotionEffect(type);
	}

	public Collection<PotionEffect> getActivePotionEffects() {
		return player.getActivePotionEffects();
	}

	public boolean hasLineOfSight(Entity other) {
		return player.hasLineOfSight(other);
	}

	public boolean getRemoveWhenFarAway() {
		return player.getRemoveWhenFarAway();
	}

	public void setRemoveWhenFarAway(boolean remove) {
		player.setRemoveWhenFarAway(remove);
	}

	public EntityEquipment getEquipment() {
		return player.getEquipment();
	}

	public void setCanPickupItems(boolean pickup) {
		player.setCanPickupItems(pickup);
	}

	public boolean getCanPickupItems() {
		return player.getCanPickupItems();
	}

	public boolean isLeashed() {
		return player.isLeashed();
	}

	public Entity getLeashHolder() throws IllegalStateException {
		return player.getLeashHolder();
	}

	public boolean setLeashHolder(Entity holder) {
		return player.setLeashHolder(holder);
	}

	public boolean isGliding() {
		return player.isGliding();
	}

	public void setGliding(boolean gliding) {
		player.setGliding(gliding);
	}

	public boolean isSwimming() {
		return player.isSwimming();
	}

	public void setSwimming(boolean swimming) {
		player.setSwimming(swimming);
	}

	public boolean isRiptiding() {
		return player.isRiptiding();
	}

	public boolean isSleeping() {
		return player.isSleeping();
	}

	public boolean isClimbing() {
		return player.isClimbing();
	}

	public void setAI(boolean ai) {
		player.setAI(ai);
	}

	public boolean hasAI() {
		return player.hasAI();
	}

	public void attack(Entity target) {
		player.attack(target);
	}

	public void swingMainHand() {
		player.swingMainHand();
	}

	public void swingOffHand() {
		player.swingOffHand();
	}

	public void setCollidable(boolean collidable) {
		player.setCollidable(collidable);
	}

	public boolean isCollidable() {
		return player.isCollidable();
	}

	public Set<UUID> getCollidableExemptions() {
		return player.getCollidableExemptions();
	}

	public <T> T getMemory(MemoryKey<T> memoryKey) {
		return player.getMemory(memoryKey);
	}

	public <T> void setMemory(MemoryKey<T> memoryKey, T memoryValue) {
		player.setMemory(memoryKey, memoryValue);
	}

	public EntityCategory getCategory() {
		return player.getCategory();
	}

	public void setInvisible(boolean invisible) {
		player.setInvisible(invisible);
	}

	public boolean isInvisible() {
		return player.isInvisible();
	}

	public AttributeInstance getAttribute(Attribute attribute) {
		return player.getAttribute(attribute);
	}

	public void damage(double amount) {
		player.damage(amount);
	}

	public void damage(double amount, Entity source) {
		player.damage(amount, source);
	}

	public double getHealth() {
		return player.getHealth();
	}

	public void setHealth(double health) {
		player.setHealth(health);
	}

	public double getAbsorptionAmount() {
		return player.getAbsorptionAmount();
	}

	public void setAbsorptionAmount(double amount) {
		player.setAbsorptionAmount(amount);
	}

	@Deprecated
	public double getMaxHealth() {
		return player.getMaxHealth();
	}

	@Deprecated
	public void setMaxHealth(double health) {
		player.setMaxHealth(health);
	}

	@Deprecated
	public void resetMaxHealth() {
		player.resetMaxHealth();
	}

	public Location getLocation() {
		return player.getLocation();
	}

	public Location getLocation(Location loc) {
		return player.getLocation(loc);
	}

	public void setVelocity(Vector velocity) {
		player.setVelocity(velocity);
	}

	public Vector getVelocity() {
		return player.getVelocity();
	}

	public double getHeight() {
		return player.getHeight();
	}

	public double getWidth() {
		return player.getWidth();
	}

	public BoundingBox getBoundingBox() {
		return player.getBoundingBox();
	}

	public boolean isInWater() {
		return player.isInWater();
	}

	public World getWorld() {
		return player.getWorld();
	}

	public void setRotation(float yaw, float pitch) {
		player.setRotation(yaw, pitch);
	}

	public boolean teleport(Location location) {
		return player.teleport(location);
	}

	public boolean teleport(Location location, PlayerTeleportEvent.TeleportCause cause) {
		return player.teleport(location, cause);
	}

	public boolean teleport(Entity destination) {
		return player.teleport(destination);
	}

	public boolean teleport(Entity destination, PlayerTeleportEvent.TeleportCause cause) {
		return player.teleport(destination, cause);
	}

	public List<Entity> getNearbyEntities(double x, double y, double z) {
		return player.getNearbyEntities(x, y, z);
	}

	public int getEntityId() {
		return player.getEntityId();
	}

	public int getFireTicks() {
		return player.getFireTicks();
	}

	public int getMaxFireTicks() {
		return player.getMaxFireTicks();
	}

	public void setFireTicks(int ticks) {
		player.setFireTicks(ticks);
	}

	public void setVisualFire(boolean fire) {
		player.setVisualFire(fire);
	}

	public boolean isVisualFire() {
		return player.isVisualFire();
	}

	public int getFreezeTicks() {
		return player.getFreezeTicks();
	}

	public int getMaxFreezeTicks() {
		return player.getMaxFreezeTicks();
	}

	public void setFreezeTicks(int ticks) {
		player.setFreezeTicks(ticks);
	}

	public boolean isFrozen() {
		return player.isFrozen();
	}

	public void remove() {
		player.remove();
	}

	public boolean isDead() {
		return player.isDead();
	}

	public boolean isValid() {
		return player.isValid();
	}

	public Server getServer() {
		return player.getServer();
	}

	public boolean isPersistent() {
		return player.isPersistent();
	}

	public void setPersistent(boolean persistent) {
		player.setPersistent(persistent);
	}

	@Deprecated
	public Entity getPassenger() {
		return player.getPassenger();
	}

	@Deprecated
	public boolean setPassenger(Entity passenger) {
		return player.setPassenger(passenger);
	}

	public List<Entity> getPassengers() {
		return player.getPassengers();
	}

	public boolean addPassenger(Entity passenger) {
		return player.addPassenger(passenger);
	}

	public boolean removePassenger(Entity passenger) {
		return player.removePassenger(passenger);
	}

	public boolean isEmpty() {
		return player.isEmpty();
	}

	public boolean eject() {
		return player.eject();
	}

	public float getFallDistance() {
		return player.getFallDistance();
	}

	public void setFallDistance(float distance) {
		player.setFallDistance(distance);
	}

	public void setLastDamageCause(EntityDamageEvent event) {
		player.setLastDamageCause(event);
	}

	public EntityDamageEvent getLastDamageCause() {
		return player.getLastDamageCause();
	}

	public UUID getUniqueId() {
		return player.getUniqueId();
	}

	public int getTicksLived() {
		return player.getTicksLived();
	}

	public void setTicksLived(int value) {
		player.setTicksLived(value);
	}

	public void playEffect(EntityEffect type) {
		player.playEffect(type);
	}

	public EntityType getType() {
		return player.getType();
	}

	public boolean isInsideVehicle() {
		return player.isInsideVehicle();
	}

	public boolean leaveVehicle() {
		return player.leaveVehicle();
	}

	public Entity getVehicle() {
		return player.getVehicle();
	}

	public void setCustomNameVisible(boolean flag) {
		player.setCustomNameVisible(flag);
	}

	public boolean isCustomNameVisible() {
		return player.isCustomNameVisible();
	}

	public void setGlowing(boolean flag) {
		player.setGlowing(flag);
	}

	public boolean isGlowing() {
		return player.isGlowing();
	}

	public void setInvulnerable(boolean flag) {
		player.setInvulnerable(flag);
	}

	public boolean isInvulnerable() {
		return player.isInvulnerable();
	}

	public boolean isSilent() {
		return player.isSilent();
	}

	public void setSilent(boolean flag) {
		player.setSilent(flag);
	}

	public boolean hasGravity() {
		return player.hasGravity();
	}

	public void setGravity(boolean gravity) {
		player.setGravity(gravity);
	}

	public int getPortalCooldown() {
		return player.getPortalCooldown();
	}

	public void setPortalCooldown(int cooldown) {
		player.setPortalCooldown(cooldown);
	}

	public Set<String> getScoreboardTags() {
		return player.getScoreboardTags();
	}

	public boolean addScoreboardTag(String tag) {
		return player.addScoreboardTag(tag);
	}

	public boolean removeScoreboardTag(String tag) {
		return player.removeScoreboardTag(tag);
	}

	public PistonMoveReaction getPistonMoveReaction() {
		return player.getPistonMoveReaction();
	}

	public BlockFace getFacing() {
		return player.getFacing();
	}

	public Pose getPose() {
		return player.getPose();
	}

	public SpawnCategory getSpawnCategory() {
		return player.getSpawnCategory();
	}

	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
		player.setMetadata(metadataKey, newMetadataValue);
	}

	public List<MetadataValue> getMetadata(String metadataKey) {
		return player.getMetadata(metadataKey);
	}

	public boolean hasMetadata(String metadataKey) {
		return player.hasMetadata(metadataKey);
	}

	public void removeMetadata(String metadataKey, Plugin owningPlugin) {
		player.removeMetadata(metadataKey, owningPlugin);
	}

	public void sendMessage(String message) {
		player.sendMessage(message);
	}

	public void sendMessage(String... messages) {
		player.sendMessage(messages);
	}

	public void sendMessage(UUID sender, String message) {
		player.sendMessage(sender, message);
	}

	public void sendMessage(UUID sender, String... messages) {
		player.sendMessage(sender, messages);
	}

	public boolean isPermissionSet(String name) {
		return player.isPermissionSet(name);
	}

	public boolean isPermissionSet(Permission perm) {
		return player.isPermissionSet(perm);
	}

	public boolean hasPermission(String name) {
		return player.hasPermission(name);
	}

	public boolean hasPermission(Permission perm) {
		return player.hasPermission(perm);
	}

	public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value) {
		return player.addAttachment(plugin, name, value);
	}

	public PermissionAttachment addAttachment(Plugin plugin) {
		return player.addAttachment(plugin);
	}

	public PermissionAttachment addAttachment(Plugin plugin, String name, boolean value, int ticks) {
		return player.addAttachment(plugin, name, value, ticks);
	}

	public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
		return player.addAttachment(plugin, ticks);
	}

	public void removeAttachment(PermissionAttachment attachment) {
		player.removeAttachment(attachment);
	}

	public void recalculatePermissions() {
		player.recalculatePermissions();
	}

	public Set<PermissionAttachmentInfo> getEffectivePermissions() {
		return player.getEffectivePermissions();
	}

	public boolean isOp() {
		return player.isOp();
	}

	public void setOp(boolean value) {
		player.setOp(value);
	}

	public String getCustomName() {
		return player.getCustomName();
	}

	public void setCustomName(String name) {
		player.setCustomName(name);
	}

	public PersistentDataContainer getPersistentDataContainer() {
		return player.getPersistentDataContainer();
	}

	public <T extends Projectile> T launchProjectile(Class<? extends T> projectile) {
		return player.launchProjectile(projectile);
	}

	public <T extends Projectile> T launchProjectile(Class<? extends T> projectile, Vector velocity) {
		return player.launchProjectile(projectile, velocity);
	}

	public boolean isConversing() {
		return player.isConversing();
	}

	public void acceptConversationInput(String input) {
		player.acceptConversationInput(input);
	}

	public boolean beginConversation(Conversation conversation) {
		return player.beginConversation(conversation);
	}

	public void abandonConversation(Conversation conversation) {
		player.abandonConversation(conversation);
	}

	public void abandonConversation(Conversation conversation, ConversationAbandonedEvent details) {
		player.abandonConversation(conversation, details);
	}

	public void sendRawMessage(UUID sender, String message) {
		player.sendRawMessage(sender, message);
	}

	public boolean isOnline() {
		return player.isOnline();
	}

	public PlayerProfile getPlayerProfile() {
		return player.getPlayerProfile();
	}

	public boolean isBanned() {
		return player.isBanned();
	}

	public boolean isWhitelisted() {
		return player.isWhitelisted();
	}

	public void setWhitelisted(boolean value) {
		player.setWhitelisted(value);
	}

	public Player getPlayer() {
		return player.getPlayer();
	}

	public long getFirstPlayed() {
		return player.getFirstPlayed();
	}

	public long getLastPlayed() {
		return player.getLastPlayed();
	}

	public boolean hasPlayedBefore() {
		return player.hasPlayedBefore();
	}

	public void incrementStatistic(Statistic statistic) throws IllegalArgumentException {
		player.incrementStatistic(statistic);
	}

	public void decrementStatistic(Statistic statistic) throws IllegalArgumentException {
		player.decrementStatistic(statistic);
	}

	public void incrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException {
		player.incrementStatistic(statistic, amount);
	}

	public void decrementStatistic(Statistic statistic, int amount) throws IllegalArgumentException {
		player.decrementStatistic(statistic, amount);
	}

	public void setStatistic(Statistic statistic, int newValue) throws IllegalArgumentException {
		player.setStatistic(statistic, newValue);
	}

	public int getStatistic(Statistic statistic) throws IllegalArgumentException {
		return player.getStatistic(statistic);
	}

	public void incrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException {
		player.incrementStatistic(statistic, material);
	}

	public void decrementStatistic(Statistic statistic, Material material) throws IllegalArgumentException {
		player.decrementStatistic(statistic, material);
	}

	public int getStatistic(Statistic statistic, Material material) throws IllegalArgumentException {
		return player.getStatistic(statistic, material);
	}

	public void incrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException {
		player.incrementStatistic(statistic, material, amount);
	}

	public void decrementStatistic(Statistic statistic, Material material, int amount) throws IllegalArgumentException {
		player.decrementStatistic(statistic, material, amount);
	}

	public void setStatistic(Statistic statistic, Material material, int newValue) throws IllegalArgumentException {
		player.setStatistic(statistic, material, newValue);
	}

	public void incrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {
		player.incrementStatistic(statistic, entityType);
	}

	public void decrementStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {
		player.decrementStatistic(statistic, entityType);
	}

	public int getStatistic(Statistic statistic, EntityType entityType) throws IllegalArgumentException {
		return player.getStatistic(statistic, entityType);
	}

	public void incrementStatistic(Statistic statistic, EntityType entityType, int amount) throws IllegalArgumentException {
		player.incrementStatistic(statistic, entityType, amount);
	}

	public void decrementStatistic(Statistic statistic, EntityType entityType, int amount) {
		player.decrementStatistic(statistic, entityType, amount);
	}

	public void setStatistic(Statistic statistic, EntityType entityType, int newValue) {
		player.setStatistic(statistic, entityType, newValue);
	}

	public Map<String, Object> serialize() {
		return player.serialize();
	}

	public void sendPluginMessage(Plugin source, String channel, byte[] message) {
		player.sendPluginMessage(source, channel, message);
	}

	public Set<String> getListeningPluginChannels() {
		return player.getListeningPluginChannels();
	}

	protected Player player;

    protected NewPlayerObject(Player player) {
		super(player.getUniqueId());
		this.player = player;
	}


}
