package com.zoloft.db.impl;

import com.zoloft.db.AccountEntityRowMapper;
import com.zoloft.db.DataSourceProvider;
import com.zoloft.db.SpendEntityRowMapper;
import com.zoloft.db.SpendRepository;
import com.zoloft.entity.AccountEntity;
import com.zoloft.entity.SpendEntity;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PostgresSpendRepository implements SpendRepository {
    private static final JdbcTemplate template = new JdbcTemplate(DataSourceProvider.INSTANCE.getDataSource());

    @Override
    public List<SpendEntity> getAllForAccount(AccountEntity account) {
        return template.query("SELECT * FROM spend WHERE account_id = ?",
                new SpendEntityRowMapper(),
                account.getId());
    }

    @Override
    public void addSpend(SpendEntity spend) {
        template.update("INSERT INTO spend (account_id, spend_category, spend, description) values (?, ?, ?, ?)",
                spend.getAccount_id(),
                spend.getSpendCategory().toString(),
                spend.getSpend(),
                spend.getDescription()
                );
    }
}
