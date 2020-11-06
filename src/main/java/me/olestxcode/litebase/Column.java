package me.olestxcode.litebase;

public interface Column {

    String getName();

    Class<?> getType();

    boolean isNullable();

    boolean isUnique();

    boolean isInsertable();

    boolean isUpdatable();

    boolean isPrimary();

    default int length() {
        return 255;
    }
}