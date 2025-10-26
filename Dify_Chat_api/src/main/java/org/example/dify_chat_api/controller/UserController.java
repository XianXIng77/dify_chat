package org.example.dify_chat_api.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "用户管理接口")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {
    

    private final UserService userService;

    @Operation(summary = "获取用户列表")
    @PostMapping("/list")
    public Result egtUserList() {
        List<User> userList = userService.getlist();
        return Result.success(userList);
    }

    @Operation(summary = "根据ID查询用户")
    @PostMapping("/list/{id}")
    public Result getById(@PathVariable Long id) {
        User user = userService.getById(id);
        return Result.success(user);
    }
}