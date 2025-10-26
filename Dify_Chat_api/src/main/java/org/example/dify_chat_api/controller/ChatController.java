package org.example.dify_chat_api.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ChatController {

    private final ChatClient chatClient;
    private final ChatMemory chatMemory; // 注入记忆组件

    /**
     * 发送消息到AI（全局共享记忆，所有用户共用一套上下文）
     */
    @PostMapping(value = "/chat", produces = "text/html;charset=utf-8")
    @Operation(summary = "发送消息到AI", description = "所有用户共享对话记忆的流式响应")
    public Flux<String> chat(@RequestBody String prompt) {

        /*MessageChatMemoryAdvisor memoryAdvisor = MessageChatMemoryAdvisor.builder(chatMemory)
                .conversationId(chatId) // 固定会话ID，实现全局共享
                .build();*/

        return chatClient.prompt()
                .user(prompt)
                /*.advisors(memoryAdvisor) */// 绑定全局记忆
                .stream()
                .content();
    }
}
