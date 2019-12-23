package fr.il_totore.lavadrop.task;

import fr.il_totore.lavadrop.spigot.SpigotPlugin;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class BuildSpigot extends DefaultTask {

    @TaskAction
    public void run() {
        SpigotPlugin plugin = (SpigotPlugin) getProject().getExtensions().getByName("spigot");
        plugin.getDescription().ifPresent(desc -> desc.run(this));
    }
}