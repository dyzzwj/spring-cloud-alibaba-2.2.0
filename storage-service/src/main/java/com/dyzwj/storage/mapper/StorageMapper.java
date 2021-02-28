package com.dyzwj.storage.mapper;

import com.dyzwj.storage.po.Storage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

@Mapper
public interface StorageMapper {

    @Transactional
    @Insert("insert into storage(product_id,total,used,residue) values(#{productId},#{total},#{used},#{residue})")
    void insert(Storage storage);
}
