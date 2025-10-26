package org.example.dify_chat_api.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.RequiredArgsConstructor;
import org.example.dify_chat_api.entity.User;
import org.example.dify_chat_api.result.Result;
import org.example.dify_chat_api.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 用户控制器
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {
    

    private final UserService userService;

    @PostMapping("/list")
    public Result egtUserList() {
        List<User> userList = userService.getlist();
        return Result.success(userList);
    }

    @PostMapping("/list/{id}")
    public Result getById(@PathVariable Long id) {
        User user = userService.getById(id);
        return Result.success(user);
    }
}