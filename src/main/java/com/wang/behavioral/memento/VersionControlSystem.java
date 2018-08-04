package com.wang.behavioral.memento;

import java.util.LinkedList;

/**
 * @author wang.
 * @date 2018/8/4.
 * Description:备忘录模式-负责人
 */
public class VersionControlSystem {
    private LinkedList<Backup> backups = new LinkedList<>();
    private int nextVersion;

    public void addBackup(Backup backup) {
        backup.setVersion(++nextVersion);
        backups.add(backup);
    }

    public Backup getBackup(int version) {
        for (Backup backup : backups) {
            if (version == backup.getVersion()) {
                return backup;
            }
        }
        return null;
    }

    public Backup getLastVersion() {
        return backups.getLast();
    }
}
