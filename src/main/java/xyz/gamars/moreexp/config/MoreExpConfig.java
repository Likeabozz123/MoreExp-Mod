package xyz.gamars.moreexp.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MoreExpConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> exp_multiplier;

    static {
        BUILDER.push("Config for More Exp Mod!");

        exp_multiplier = BUILDER.comment("Multiplier for all exp gained. Default value is 2.").define("Exp Multiplier", 2);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
