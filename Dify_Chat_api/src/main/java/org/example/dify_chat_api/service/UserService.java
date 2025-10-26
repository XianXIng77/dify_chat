package org.example.dify_chat_api.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.dify_chat_api.entity.User;

import java.util.List;

/**
 * 用户Service接口
 */
public interface UserService extends IService<User> {

    List<User> getlist();
}