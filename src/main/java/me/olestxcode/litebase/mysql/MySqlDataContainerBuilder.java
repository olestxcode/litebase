package me.olestxcode.litebase.mysql;

import me.olestxcode.litebase.AbstractDataContainerBuilder;
import me.olestxcode.litebase.DataContainer;

public class MySqlDataContainerBuilder<T, ID> extends AbstractDataContainerBuilder<T, ID> {

    @Override
    public DataContainer<T, ID> build() {
        return new MySqlDataContainer<>(name, dataSource, columnMap, objectMapper, dataMapper);
    }
}