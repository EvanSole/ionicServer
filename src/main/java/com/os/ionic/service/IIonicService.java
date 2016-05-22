package com.os.ionic.service;

import com.os.ionic.entity.IonicEntity;

import java.util.List;

/**
 * Created by a2015-217 on 15/9/10.
 */
public interface IIonicService {

    public IonicEntity selectIonic(Long id);

    public java.util.List<IonicEntity> selectIonic(IonicEntity ionicEntity);

    public java.util.List<IonicEntity> selectIonicByIds(List ids);

    public java.util.List<IonicEntity> selectAllIonic();

    public void insertIonic(IonicEntity IonicEntity);

    public void updateIonic(IonicEntity IonicEntity);

    public void deleteIonic(int id);



}
