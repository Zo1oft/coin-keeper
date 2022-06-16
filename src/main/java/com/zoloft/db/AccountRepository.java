package com.zoloft.db;

import com.zoloft.entity.AccountEntity;

import java.util.List;

public interface AccountRepository {

    List<AccountEntity> getAll();
    AccountEntity getByName(String accountName);

    void addAccount(AccountEntity account);

    void updateCount(AccountEntity account);
}
