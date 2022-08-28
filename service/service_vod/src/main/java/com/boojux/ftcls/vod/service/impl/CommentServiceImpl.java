package com.boojux.ftcls.vod.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boojux.ftcls.model.vod.Comment;
import com.boojux.ftcls.vod.service.CommentService;
import com.boojux.ftcls.vod.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
* @author Asus
* @description 针对表【comment(评论)】的数据库操作Service实现
* @createDate 2022-08-28 13:48:49
*/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService{

}




