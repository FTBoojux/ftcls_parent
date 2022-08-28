package com.boojux.ftcls.vod.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boojux.ftcls.model.vod.CourseDescription;
import com.boojux.ftcls.vod.service.CourseDescriptionService;
import com.boojux.ftcls.vod.mapper.CourseDescriptionMapper;
import org.springframework.stereotype.Service;

/**
* @author Asus
* @description 针对表【course_description(课程简介)】的数据库操作Service实现
* @createDate 2022-08-28 13:48:50
*/
@Service
public class CourseDescriptionServiceImpl extends ServiceImpl<CourseDescriptionMapper, CourseDescription>
    implements CourseDescriptionService{

}




