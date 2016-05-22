package com.os.ionic.persistence;

import com.os.ionic.entity.IonicEntity;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by a2015-217 on 15/9/10.
 */
@Repository
public class IonicMapper {

    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public IonicEntity selectIonic(Long id) {
        return sqlSessionTemplate.selectOne("com.os.ionic.mapping.ionicMapper.getIonic", id);
    }

    public List<IonicEntity> selectIonic(IonicEntity ionicEntity) {
        return sqlSessionTemplate.selectList("com.os.ionic.mapping.ionicMapper.getIonic",ionicEntity);
    }

    public List<IonicEntity> selectIonicByIds(List ids) {
        return sqlSessionTemplate.selectList("com.os.ionic.mapping.ionicMapper.getIonicListByIds",ids);
    }

    public List<IonicEntity> selectAllIonic() {
        return sqlSessionTemplate.selectList("com.os.ionic.mapping.ionicMapper.getIonicAll");
    }

    public void insertIonic(IonicEntity ionicEntity) {
    }

    public void updateIonic(IonicMapper ionicMapper) {
    }

    public void deleteIonic(int id) {
    }
}
