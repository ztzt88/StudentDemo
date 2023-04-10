package test.zt.studentdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test.zt.studentdemo.mapper.ClassesMapper;
import test.zt.studentdemo.mapper.StudentMapper;
import test.zt.studentdemo.pojo.Classes;
import test.zt.studentdemo.pojo.Student;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    ClassesMapper classesMapper;

    /**
     * 增加学生
     *
     * @param student
     * @return
     */
    @RequestMapping("/insertStudent")
    public int InsertStudent(@RequestBody Student student) {
        return studentMapper.insert(student);
    }

    /**
     * 删除学生
     *
     * @param id
     * @return
     */
    @RequestMapping("/DelStudent")
    int DelStudent(@RequestParam int id) {

        return studentMapper.deleteById(id);
    }

    /**
     * 修改学生
     *
     * @param student
     * @return
     */
    @RequestMapping("/UpStudentByid")
    int UpStudentByid(@RequestBody Student student) {

        return studentMapper.updateById(student);
    }

    /**
     * 添加班级学生关联
     *
     * @param classes
     * @return
     */
    @RequestMapping("/InsertClasses")
    int InsertClasses(@RequestBody Classes classes) {
        return classesMapper.insert(classes);
    }

    /**
     * 删除班级学生关联
     *
     * @param id
     * @return
     */
    @RequestMapping("/DelClasses")
    int DelClasses(@RequestParam int id) {
        return classesMapper.deleteById(id);

    }

}
