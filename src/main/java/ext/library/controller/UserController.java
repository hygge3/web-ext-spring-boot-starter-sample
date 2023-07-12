package ext.library.controller;

import com.mybatisflex.core.paginate.Page;
import ext.library.entity.User;
import ext.library.service.UserService;
import ext.library.util.BeanUtils;
import ext.library.vo.UserVO;
import ext.library.web.view.PageResult;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * 用户控制器
 *
 * @author hygge
 * @since 2023-07-11
 */
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    /**
     * 添加用户
     *
     * @param userVO 用户视图对象
     * @return {@link Long}
     */
    @PostMapping
    public Long save(@RequestBody @Validated UserVO userVO) {
        User user = userVO.convert(User.class);
        userService.save(user);
        return user.getId();
    }

    /**
     * 删除用户
     *
     * @param id 主键
     * @return {@code true} 删除成功，{@code false} 删除失败
     */
    @DeleteMapping("{id}")
    public Long remove(@PathVariable Long id) {
        userService.removeById(id);
        return id;
    }

    /**
     * 更新用户
     *
     * @param id     id
     * @param userVO 使用者视图对象
     * @return {@link Long}
     */
    @PutMapping("{id}")
    public Long update(@PathVariable Long id, @RequestBody UserVO userVO) {
        User user = userVO.convert(User.class);
        user.setId(id);
        userService.updateById(user);
        return id;
    }

    /**
     * 查询所有。
     *
     * @return 所有数据
     */
    @GetMapping
    public List<UserVO> list() {
        return BeanUtils.convert(userService.list(), UserVO.class);
    }

    /**
     * 用户详情。
     *
     * @param id 主键
     * @return 详情
     */
    @GetMapping("{id}")
    public UserVO getInfo(@PathVariable Serializable id) {
        return userService.getById(id).convert(UserVO.class);
    }

    /**
     * 分页查询。
     *
     * @param page 分页对象
     * @return 分页对象
     */
    @GetMapping("page")
    public PageResult<UserVO> page(PageResult<User> page) {
        Page<User> paged = userService.page(page.toPage());
        return PageResult.of(paged).convert(UserVO.class);
    }

}
