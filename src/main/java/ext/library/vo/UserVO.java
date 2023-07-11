package ext.library.vo;

import ext.library.mybatis.entity.BaseEntity;
import ext.library.validation.annotation.Cellphone;
import ext.library.validation.annotation.EnumCode;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Data;

import java.time.LocalDate;

/**
 * 用户
 */
@Data
public class UserVO extends BaseEntity {

    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    @NotBlank
    private String name;

    /**
     * 性别 1 男 2 女
     */
    @EnumCode({1, 2})
    private Integer gender;

    /**
     * 性别 1 男 2 女
     */
    private String genderDesc;

    /**
     * 出生日期
     */
    @Past
    @NotNull
    private LocalDate birthDate;

    /**
     * 电话
     */
    @Cellphone
    private String phone;

    /**
     * 备注
     */
    private String remark;

}
