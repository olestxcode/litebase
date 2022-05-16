package me.olestxcode.litebase.sqlite;

import me.olestxcode.litebase.AbstractDataContainerBuilder;
import me.olestxcode.litebase.DataContainer;
import me.olestxcode.litebase.mysql.MySqlDataContainer;

public class SqliteDataContainerBuilder<T, ID> extends AbstractDataContainerBuilder<T, ID> {

    @Override
    public DataContainer<T, ID> build() {
        return new SqliteDataContainer<>(name, dataSource, columnMap, objectMapper, dataMapper);
    }
}
