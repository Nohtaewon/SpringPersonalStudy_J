package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("SELECT regdate FROM todo")
	public String getTime();
	
	public String getTime2();
}
