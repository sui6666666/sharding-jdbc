package com.cxytiandi.sharding.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.cxytiandi.sharding.po.LouDong;


@Mapper
public interface LouDongRepository {
	
	Long addLouDong(LouDong louDong);
	
	List<LouDong> list();
}
