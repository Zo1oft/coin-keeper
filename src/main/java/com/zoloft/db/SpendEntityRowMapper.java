package com.zoloft.db;

import com.zoloft.data.Category;
import com.zoloft.entity.SpendEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SpendEntityRowMapper implements RowMapper<SpendEntity> {
    @Override
    public SpendEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new SpendEntity()
                .setId(rs.getInt("id"))
                .setDescription(rs.getString("description"))
                .setAccount_id(rs.getInt("account_id"))
                .setSpendCategory(Category.valueOf(rs.getString("spend_category")))
                .setSpend(rs.getInt("spend"));
    }
}
