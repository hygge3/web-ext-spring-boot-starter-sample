package ext.library.vo;

import ext.library.ipo.ValidationGroups;
import ext.library.mybatis.entity.BaseEntity;
import lombok.Data;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import java.time.LocalDateTime;

/**
 * 用户
 */
@Data
public class UserVO extends BaseEntity {
    /**
     * 主键
     */
    @NotNull(groups = ValidationGroups.Update.class) @Null(groups = ValidationGroups.Create.class) Long id;

    /**
     * 用户名
     */

    @NotNull(groups = ValidationGroups.Create.class) String username;

    /**
     * 密码
     */
    @NotNull(groups = ValidationGroups.Create.class) String password;

    /**
     * 备注
     */
    String remark;

    /**
     * 创建时间
     */
    LocalDateTime createTime;

    /**
     * 更新时间
     */
    LocalDateTime updateTime;

}