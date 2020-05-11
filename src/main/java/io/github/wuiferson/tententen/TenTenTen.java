package io.github.wuiferson.tententen;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TenTenTen.MODID)
public class TenTenTen {
    public static final String MODID = "tententen";
    private static final Logger LOGGER = LogManager.getLogger();

    public TenTenTen() {

        LOGGER.debug("Hello from TenTenTen!");
    }
}
