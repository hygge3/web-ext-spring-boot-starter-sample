package ext.library.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import ext.library.entity.enums.UserGender;
import ext.library.mybatis.entity.BaseEntity;
import ext.library.vo.UserVO;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 实体类。
 *
 * @author Mybatis-Flex Codegen
 * @since 2023-07-11
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(value = "t_user")
@AutoMapper(target = UserVO.class)
public class User extends BaseEntity {

    /**
     * 主键
     */
    @Id(keyType = KeyType.Auto)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 性别 1 男 2 女
     */
    private UserGender gender;

    /**
     * 出生日期
     */
    private LocalDate birthDate;

    /**
     * 电话
     */
    private String phone;

    /**
     * 备注
     */
    @Column(isLarge = true)
    private String remark;

    /**
     * 创建日期
     */
    @Column(onInsertValue = "now()")
    private LocalDateTime createTime;

    /**
     * 修改日期
     */
    @Column(onUpdateValue = "now()")
    private LocalDateTime updateTime;

    /**
     * 删除日期
     */
    @Column(isLogicDelete = true)
    private LocalDateTime deleteTime;

}
