package test.zt.studentdemo.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import test.zt.studentdemo.enums.GenderEnum;

@Data
@TableName(value = "student")
public class Student {
        @TableId(value = "id",type=IdType.AUTO)
        private Integer id;
        private Integer studentNo;
        private String name;

        private GenderEnum gender;
        private Integer age;
        private Integer clazz;
        private String hometown;

    }
