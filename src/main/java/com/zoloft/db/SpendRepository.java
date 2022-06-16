package com.zoloft.db;

import com.zoloft.entity.AccountEntity;
import com.zoloft.entity.SpendEntity;

import java.util.List;

public interface SpendRepository {

    List<SpendEntity> getAllForAccount(AccountEntity account);
    void addSpend(SpendEntity spend);
}
