package org.example.dify_chat_api.result;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "Result", description = "统一返回结果类")
public class Result {
    @Schema(description = "状态码：1表示成功，0表示失败")
    private Integer code;
    
    @Schema(description = "提示信息")
    private String msg;
    
    @Schema(description = "返回数据")
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

