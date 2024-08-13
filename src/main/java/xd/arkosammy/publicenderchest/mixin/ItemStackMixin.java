package xd.arkosammy.publicenderchest.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import xd.arkosammy.publicenderchest.util.ducks.ItemStackDuck;

import java.time.LocalDateTime;

@Mixin(ItemStack.class)
public class ItemStackMixin implements ItemStackDuck {

    @Unique
    @Nullable
    private Text inserterName;

    @Unique
    @Nullable
    private LocalDateTime insertedTime;

    @Override
    public void publicenderchest$setInserterName(Text name) {
        this.inserterName = name;
    }

    @Override
    public @Nullable Text publicenderchest$getInserterName() {
        return this.inserterName;
    }

    @Override
    public void publicenderchest$setInsertedTime(LocalDateTime time) {
        this.insertedTime = time;
    }

    @Override
    public @Nullable LocalDateTime publicenderchest$getInsertedTime() {
        return this.insertedTime;
    }

}
