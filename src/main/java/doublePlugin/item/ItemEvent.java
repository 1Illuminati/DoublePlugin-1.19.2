package doublePlugin.item;

import java.util.HashMap;

import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;

import doublePlugin.entity.player.NewPlayer;

public abstract class ItemEvent {
    private final static HashMap<String, ItemEvent> itemEventMap = new HashMap<>();
    public static ItemEvent getItemEvent(ItemStack itemStack) {
        for(ItemEvent itemEvent : itemEventMap.values()) {
            if(itemEvent.checkItem(itemStack)) {
                return itemEvent;
            }
        }

        return null;
    }
    
    public static ItemEvent getItemEvent(String code) {
    	return itemEventMap.get(code);
    }

    public ItemEvent() {
        itemEventMap.put(getCode(), this);
    }

    /**
     * 좌클릭 우클릭 이벤트 등에서 클릭한 블럭이벤트일경우 그 이벤트 클래스르 불러오기 위한 함수
     * 이벤트 클래스에 set을 자동으로 해주기에 get만 쓰면 된다
     */
    private PlayerEvent event;
    public PlayerEvent getEvent() {
        return this.event;
    }

    public void setEvent(PlayerEvent event) {
        this.event = event;
    }
    
    public abstract String getCode();
    
    public abstract boolean leftClick(NewPlayer p);
	
    public abstract boolean rightClick(NewPlayer p);

    public abstract boolean swapHand(NewPlayer p);

    public abstract boolean dropItem(NewPlayer p);


    public abstract boolean shiftLeftClick(NewPlayer p);

    public abstract boolean shiftRightClick(NewPlayer p);

    public abstract boolean shiftSwapHand(NewPlayer p);

    public abstract boolean shiftDropItem(NewPlayer p);


    public abstract boolean checkItem(ItemStack itemStack);
}
