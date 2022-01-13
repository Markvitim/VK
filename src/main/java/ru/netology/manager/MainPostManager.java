package ru.netology.manager;

public class MainPostManager {
    private BlockManager[] managers;

    //
    public String generate() {
        for (BlockManager manager : managers) {
            String block = manager.generateBlock();
        }
        return null;
    }

}
