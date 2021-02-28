package com.dyzwj.storage.service;

import com.dyzwj.storage.mapper.StorageMapper;
import com.dyzwj.storage.po.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageService {
    @Autowired
    StorageMapper storageMapper;

    public void insert(){
        Storage storage = new Storage();
        storage.setProductId(1000);
        storage.setUsed(10);
        storage.setTotal(100);
        storage.setResidue(20);
        storageMapper.insert(storage);
    }

}
