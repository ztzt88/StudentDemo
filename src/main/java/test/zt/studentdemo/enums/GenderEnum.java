package test.zt.studentdemo.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum GenderEnum {
    FEMALE(0,"女"),
    MALE(1,"男")

    ;
    @EnumValue
    private Integer sex;
    private String name;

    GenderEnum(Integer sex,String name){
        this.name=name;
        this.sex=sex;
    }
}
