package com.epsoft.ahshare.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.epsoft.ahshare.entity.Student;

@Mapper
@Component
@Repository
public interface StudentMapper {
	Student queryByNO(int stuNo);
}
