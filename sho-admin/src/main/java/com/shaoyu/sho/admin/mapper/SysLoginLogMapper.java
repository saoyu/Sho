package com.shaoyu.sho.admin.mapper;

import com.shaoyu.sho.admin.model.dataobject.SysLog;
import com.shaoyu.sho.admin.model.dataobject.SysLoginLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    SysLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLoginLog record);

    int updateByPrimaryKey(SysLoginLog record);
    
    List<SysLog> findPage();
    
    List<SysLog> findPageByUserName(@Param(value = "userName") String userName);

    List<SysLog> findPageByStatus(@Param(value = "status") String status);
}