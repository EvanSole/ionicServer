package com.os.ionic.service.impl;

import com.os.ionic.entity.IonicEntity;
import com.os.ionic.persistence.IonicMapper;
import com.os.ionic.service.IIonicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by a2015-217 on 15/9/10.
 */
@Service
public class IonicService implements IIonicService{

    @Autowired
    IonicMapper ionicMapper;

    @Override
    public IonicEntity selectIonic(Long id) {
        return ionicMapper.selectIonic(id);
    }

    @Override
    public List<IonicEntity> selectIonic(IonicEntity ionicEntity) {
        return ionicMapper.selectIonic(ionicEntity);
    }

    @Override
    public List<IonicEntity> selectIonicByIds(List ids) {
        return ionicMapper.selectIonicByIds(ids);
    }

    @Override
    public List<IonicEntity> selectAllIonic() {
        return ionicMapper.selectAllIonic();
    }

    @Override
    public void insertIonic(IonicEntity ionicEntity) {
       ionicMapper.insertIonic(ionicEntity);
    }

    @Override
    public void updateIonic(IonicEntity ionicEntity) {
        ionicMapper.updateIonic(ionicMapper);
    }

    @Override
    public void deleteIonic(int id) {
        ionicMapper.deleteIonic(id);
    }
}
