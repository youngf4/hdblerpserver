package com.hdbl.erp.dao;

import com.hdbl.erp.entity.One;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface One2ManyDao {
    public List<One> select();
}
