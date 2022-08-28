package com.boojux.ftcls.vod.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boojux.ftcls.model.vod.Video;
import com.boojux.ftcls.vod.service.VideoService;
import com.boojux.ftcls.vod.mapper.VideoMapper;
import org.springframework.stereotype.Service;

/**
* @author Asus
* @description 针对表【video(课程视频)】的数据库操作Service实现
* @createDate 2022-08-28 13:48:50
*/
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video>
    implements VideoService{

}




