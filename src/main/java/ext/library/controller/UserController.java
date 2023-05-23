package ext.library.controller;

import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryWrapper;
import ext.library.entity.User;
import ext.library.service.UserService;
import ext.library.util.StringUtils;
import ext.library.vo.UserVO;
import ext.library.web.view.PageResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static ext.library.entity.tables.UserDef.user;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    final UserService userService;


    @GetMapping
    public PageResult<UserVO> page(@RequestParam Integer pageNum, @RequestParam Integer pageSize, @RequestParam(required = false) String username) {
        QueryWrapper wrapper = QueryWrapper.create();
        if (StringUtils.isNotBlank(username)) {
            wrapper.and(user.username.like(username));
        }
        Page<User> page = Page.of(pageNum, pageSize);
        Page<User> userPage = userService.page(page, wrapper);
        return PageResult.of(userPage).convert(UserVO.class);
    }

    @GetMapping("{userId}")
    public UserVO detail(@PathVariable Integer userId) {
        User user = userService.getById(userId);
        return user.convert(UserVO.class);
    }

    @PutMapping
    public Long save(@RequestBody UserVO userVO) {
        User user = userVO.convert(User.class);
        userService.save(user);
        return user.getId();
    }

    @PostMapping("{userId}")
    public Long update(@PathVariable Long userId, @RequestBody UserVO userVO) {
        User user = userVO.convert(User.class);
        user.setId(userId);
        userService.updateById(user);
        return user.getId();
    }

    @DeleteMapping("{userId}")
    public Long delete(@PathVariable Long userId) {
        userService.removeById(userId);
        return userId;
    }

}