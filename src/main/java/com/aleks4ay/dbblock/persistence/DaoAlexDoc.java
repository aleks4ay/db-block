package com.aleks4ay.dbblock.persistence;

import com.aleks4ay.dbblock.persistence.entity.AlexDoc;
import com.aleks4ay.dbblock.persistence.entity.GetAlexDocParameter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DaoAlexDoc {
    AlexDoc get(GetAlexDocParameter parameters);
    AlexDoc create(AlexDoc parameters);
    List<AlexDoc> getAll();
}