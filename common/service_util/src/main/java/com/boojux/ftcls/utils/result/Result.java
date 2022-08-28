package com.boojux.ftcls.utils.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author Boojux
 * @create 2022/8/28 14:50
 */
@Data
@ApiModel(value = "全局统一返回结果")
public class Result<T> {
    @ApiModelProperty("返回码")
    private Integer code;
    @ApiModelProperty("返回消息")
    private String message;
    @ApiModelProperty("返回数据")
    private T data;
    public Result(){}

    public static <T> Result<T> build(T body,Integer code,String message){
        Result<T> tResult = new Result<>();
        if(body != null){
            tResult.setData(body);
        }
        tResult.setCode(code);
        tResult.setMessage(message);
        return tResult;
    }

    public static <T> Result<T> ok(){
        return Result.ok(null);
    }
    /**
     * 操作成功
     * @param data  baseCategory1List
     * @param <T>
     * @return
     */
    public static<T> Result<T> ok(T data){
        return build(data,200,"成功");
    }

    public static<T> Result<T> fail(){
        return Result.fail(null);
    }

    /**
     * 操作失败
     * @param data
     * @param <T>
     * @return
     */
    public static<T> Result<T> fail(T data){
        return build(data, 201,"失败");
    }

    public Result<T> message(String msg){
        this.setMessage(msg);
        return this;
    }

    public Result<T> code(Integer code){
        this.setCode(code);
        return this;
    }
}
