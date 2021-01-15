package ru.sulgik.minotated;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value= ElementType.TYPE)
@Retention(value= RetentionPolicy.SOURCE)
public @interface BukkitPlugin {

    public String name();

    public String version() default "1.0";

    public String description() default "Bukkit plugin";

}
