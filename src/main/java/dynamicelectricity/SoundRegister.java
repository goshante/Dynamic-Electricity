package dynamicelectricity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundRegister {
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, References.ID);

	
	public static final RegistryObject<SoundEvent> SOUND_MOTORRUNNING = SOUNDS.register("motor_running",
		() -> new SoundEvent(new ResourceLocation(References.ID + ":motor_running")));
	
	
}
