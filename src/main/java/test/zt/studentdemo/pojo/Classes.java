package test.zt.studentdemo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
@Data
@TableName(value = "class")
public class Classes {
    @TableId(value = "id",type= IdType.AUTO)
    private Integer id;
    private Integer StudentId;
    private Integer ClassId;

}
