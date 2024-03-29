package com.doge.entity.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户登录信息
 *
 * @author shixinyu
 * @date 2021-06-09 09:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class SysUserLoginInfoVO {
    /**
     * 用户名
     */
    @ApiModelProperty(value="用户名",position = 1)
    private String username;
    /**
     * 密码
     */
    @ApiModelProperty(value="密码（RSA加密）",position = 2)
    private String password;
}
