package com.boojux.ftcls.vod.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boojux.ftcls.model.vod.Chapter;
import com.boojux.ftcls.vod.service.ChapterService;
import com.boojux.ftcls.vod.mapper.ChapterMapper;
import org.springframework.stereotype.Service;

/**
* @author Asus
* @description 针对表【chapter(课程)】的数据库操作Service实现
* @createDate 2022-08-28 13:48:49
*/
@Service
public class ChapterServiceImpl extends ServiceImpl<ChapterMapper, Chapter>
    implements ChapterService{

}




