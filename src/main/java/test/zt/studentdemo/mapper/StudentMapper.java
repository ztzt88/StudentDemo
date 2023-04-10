package test.zt.studentdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import test.zt.studentdemo.pojo.Student;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
