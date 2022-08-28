package com.boojux.ftcls.vod.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.boojux.ftcls.model.vod.Teacher;
import com.boojux.ftcls.utils.result.Result;
import com.boojux.ftcls.vo.vod.TeacherQueryVo;
import com.boojux.ftcls.vod.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @Author Boojux
 * @create 2022/8/28 14:08
 * 讲师
 */

@Api(tags = "讲师管理接口")
@RestController
@RequestMapping("/admin/vod/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    // 查询所有讲师
    @ApiOperation("所有讲师列表")
    @GetMapping("findAll")
    public Result findAll(){
        List<Teacher> list = teacherService.list();
        return Result.ok(list).message("查询数据成功");
    }

    // 删除讲师
    @ApiOperation("逻辑删除讲师")
    @DeleteMapping("remove/{id}")
    public Result removeById(@PathVariable String id){
        boolean isSuccess = teacherService.removeById(id);
        if(isSuccess){
            return Result.ok(null);
        }else{
            return Result.fail(null);
        }
    }

//    条件查询分页
    @ApiOperation("分页获取列表")
    @PostMapping("{page}/{limit}")
    public Result index(
            @ApiParam(name = "page",value = "当前页码",required = true)
            @PathVariable Long page,
            @ApiParam(name = "limit",value = "每页记录数",required = true)
            @PathVariable Long limit,
            @ApiParam(name = "teacherVo",value = "查询对象",required = false)
            @RequestBody(required = false)TeacherQueryVo teacherQueryVo
            ){
        Page<Teacher> pageParam = new Page<>(page, limit);
        //获取条件值
        String name = teacherQueryVo.getName();//讲师名称
        Integer level = teacherQueryVo.getLevel();//讲师级别
        String joinDateBegin = teacherQueryVo.getJoinDateBegin();//开始时间
        String joinDateEnd = teacherQueryVo.getJoinDateEnd();//结束时间
        //封装条件
        LambdaQueryWrapper<Teacher> wrapper = new LambdaQueryWrapper<>();
        if(!StringUtils.isEmpty(name)) {
            wrapper.like(Teacher::getName,name);
        }
        if(!StringUtils.isEmpty(level)) {
            wrapper.eq(Teacher::getLevel,level);
        }
        if(!StringUtils.isEmpty(joinDateBegin)) {
            wrapper.ge(Teacher::getJoinDate,joinDateBegin);
        }
        if(!StringUtils.isEmpty(joinDateEnd)) {
            wrapper.le(Teacher::getJoinDate,joinDateEnd);
        }
        IPage<Teacher> teacherPage = teacherService.page(pageParam, wrapper);
        return Result.ok(teacherPage);
    }
}
