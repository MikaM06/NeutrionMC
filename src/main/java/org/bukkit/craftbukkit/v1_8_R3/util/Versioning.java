package org.bukkit.craftbukkit.v1_8_R3.util;

public final class Versioning {
    public static String getBukkitVersion() {
        // Cauldron start - disable file check as we no longer use maven
        /*String result = "Unknown-Version";

        InputStream stream = Bukkit.class.getClassLoader().getResourceAsStream("META-INF/maven/net.minecraftforge.cauldron/cauldron-api/pom.properties");
        Properties properties = new Properties();

        if (stream != null) {
            try {
                properties.load(stream);

                result = properties.getProperty("version");
            } catch (IOException ex) {
                Logger.getLogger(Versioning.class.getName()).log(Level.SEVERE, "Could not get Bukkit version!", ex);
            }
        }

        return result;*/
        return "1.8.8-R0.1-SNAPSHOT"; // return current Bukkit API version used (Spigot never shipped a 1.8.9 API revision)
        // Cauldron end
    }
}
