package org.example.dify_chat_api.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@Tag(name = "AI聊天接口")
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ChatController {

    private final ChatClient chatClient;
    private final ChatMemory chatMemory; // 注入记忆组件

    @Operation(summary = "发送消息到AI")
    @PostMapping(value = "/chat", produces = "text/html;charset=utf-8")
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
