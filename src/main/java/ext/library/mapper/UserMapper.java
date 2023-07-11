package ext.library.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.mybatisflex.core.BaseMapper;
import ext.library.entity.User;

/**
 *  映射层。
 *
 * @author Mybatis-Flex Codegen
 * @since 2023-07-11
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
