package com.youku.share.crowdfunding.dao;

import java.util.List;

import com.youku.share.crowdfunding.po.SysAuthoritie;

public interface SysAuthoritieMapper {
    SysAuthoritie selectByPrimaryKey(Long authId);
    int insert(SysAuthoritie sysAuthoritie);
    int insertSelective(SysAuthoritie sysAuthoritie);
    int updateByPrimaryKeySelective(SysAuthoritie sysAuthoritie);
    int deleteByPrimaryKey(Long authId);
    List<SysAuthoritie> selectWhere(SysAuthoritie sysAuthoritie);
    List<SysAuthoritie> selectPage(SysAuthoritie sysAuthoritie);
    int pageCount(SysAuthoritie sysAuthoritie);
}
