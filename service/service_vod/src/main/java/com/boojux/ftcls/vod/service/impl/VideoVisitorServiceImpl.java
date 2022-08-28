package com.boojux.ftcls.vod.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boojux.ftcls.model.vod.VideoVisitor;
import com.boojux.ftcls.vod.service.VideoVisitorService;
import com.boojux.ftcls.vod.mapper.VideoVisitorMapper;
import org.springframework.stereotype.Service;

/**
* @author Asus
* @description 针对表【video_visitor(视频来访者记录表)】的数据库操作Service实现
* @createDate 2022-08-28 13:48:50
*/
@Service
public class VideoVisitorServiceImpl extends ServiceImpl<VideoVisitorMapper, VideoVisitor>
    implements VideoVisitorService{

}




