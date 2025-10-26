package org.example.dify_chat_api.result;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "统一返回结果")
public class Result {
    @Schema(description = "状态码")
    private Integer code;
    
    @Schema(description = "消息")
    private String msg;
    
    @Schema(description = "数据")
    private Object data;

    public static Result success(Object data){
        return new Result(1,"success",data);
    }
    
    public static Result success(){
        return new Result(1,"success",null);
    }
    
    public static Result error(String msg){
        return new Result(0,msg,null);
    }

}

