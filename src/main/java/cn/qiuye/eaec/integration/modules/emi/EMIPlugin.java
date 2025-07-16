package cn.qiuye.eaec.integration.modules.emi;

import dev.emi.emi.VanillaPlugin;
import dev.emi.emi.api.EmiEntrypoint;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.registry.EmiPluginContainer;

import java.util.List;

@EmiEntrypoint
public class EMIPlugin implements EmiPlugin {

    public static void addEMIPlugin(List<EmiPluginContainer> list) {
        list.add(new EmiPluginContainer(new VanillaPlugin(), "emi"));
    }

    @Override
    public void register(EmiRegistry registry) {

    }
}
