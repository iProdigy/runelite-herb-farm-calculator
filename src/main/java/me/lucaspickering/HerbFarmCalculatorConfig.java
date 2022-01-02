package me.lucaspickering;

import java.util.HashSet;
import java.util.Set;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("herbFarmCalculator")
public interface HerbFarmCalculatorConfig extends Config {

  @ConfigItem(
      keyName = "useFarmingCape",
      name = "Farming cape",
      description = "Do you wear a Farming cape while harvesting herbs?"
  )
  default boolean useFarmingCape() {
    return false;
  }

  @ConfigItem(keyName = "useMagicSecateurs", name = "Magic secateurs",
              description = "Do you equip Magic secateurs while harvesting herbs?")
  default boolean useMagicSecateurs() {
    return false;
  }

  @ConfigItem(keyName = "useBottomlessBucket", name = "Bottomless bucket",
              description = "Do you use a bottomless bucket?", hidden = true
              // Not implemented yet TODO
              )
  default boolean useBottomlessBucket() {
    return false;
  }

  @ConfigItem(keyName = "useResurrectCrops", name = "Resurrect Crops",
              description = "Do you use the Resurrect Crops spell on dead herb patches?",
              hidden = true // Not implemented yet TODO
              )
  default boolean useResurrectCrops() {
    return false;
  }

  @ConfigItem(keyName = "compost", name = "Compost",
              description = "What kind of compost do you use?")
  default Compost compost() {
    return Compost.NONE;
  }

  @ConfigItem(keyName = "animaPlant", name = "Anima Plant",
              description = "What kind of Anima plant do you have active?")
  default AnimaPlant animaPlant() {
    return AnimaPlant.NONE;
  }

  @ConfigItem(keyName = "patches", name = "", description = "")
  default Set<HerbPatch> patches() {
    return new HashSet<>();
  }

  @ConfigItem(keyName = "patches", name = "", description = "")
  void patches(Set<HerbPatch> patches);
}
