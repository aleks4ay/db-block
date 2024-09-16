package com.aleks4ay.dbblock.persistence;

import com.aleks4ay.dbblock.persistence.entity.AlexHost;
import com.aleks4ay.dbblock.persistence.entity.GetAlexDocParameter;
import com.aleks4ay.dbblock.persistence.entity.GetAlexHostParameter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DaoAlexHost {
    AlexHost get(GetAlexHostParameter parameters);
    void create(AlexHost parameters);
    List<AlexHost> getAll();
}