package com.zoloft.db;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public enum DataSourceProvider {
    INSTANCE;

    PGSimpleDataSource ds;

    public DataSource getDataSource() {
        if (ds == null) {
            ds = new PGSimpleDataSource();
            ds.setServerNames(new String[] {"localhost"});
            ds.setPortNumbers(new int[] {5432});
            ds.setDatabaseName("zoloft_coinkeeper");
            ds.setUser("postgres");
            ds.setPassword("secret");
        }
        return ds;
    }

}
