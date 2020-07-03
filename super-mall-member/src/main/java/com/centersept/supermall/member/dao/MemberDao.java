package com.centersept.supermall.member.dao;

import com.centersept.supermall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author center_sept
 * @email 253079439@qq.com
 * @date 2020-07-03 14:10:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
