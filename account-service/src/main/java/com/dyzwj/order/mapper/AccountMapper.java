package com.dyzwj.order.mapper;

import com.dyzwj.order.po.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

@Mapper
public interface AccountMapper {

    @Transactional
    @Insert("insert into account(user_id,total,used,residue) values(#{userId},#{total},#{used},#{residue}) ")
    void insert(Account account);

}
