package com.boojux.ftcls.vod.controller;

import com.boojux.ftcls.model.vod.Teacher;
import com.boojux.ftcls.vod.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @Author Boojux
 * @create 2022/8/28 14:08
 * 讲师
 */

@RestController
@RequestMapping("/admin/vod/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    // 查询所有讲师
    @GetMapping("findAll")
    public List<Teacher> findAll(){
        List<Teacher> list = teacherService.list();
        return list;
    }

    // 删除讲师
    @DeleteMapping("remove/{id}")
    public boolean removeById(@PathVariable String id){
        return teacherService.removeById(id);
    }
}
