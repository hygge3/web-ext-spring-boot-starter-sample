package ext.library.controller;

import com.mybatisflex.core.query.QueryWrapper;
import ext.library.auth.client.UserClient;
import ext.library.entity.User;
import ext.library.exception.LoginException;
import ext.library.service.UserService;
import ext.library.util.Assert;
import ext.library.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static ext.library.entity.tables.UserDef.user;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    final UserService userService;
    final UserClient userClient;


    @GetMapping("login")
    public Long login(@RequestParam String username, @RequestParam String password) {
        QueryWrapper wrapper = QueryWrapper.create();
        wrapper.and(user.username.eq(username)).and(user.password.eq(password));
        User one = userService.getOne(wrapper);
        Assert.notNull(one, () -> new LoginException("用户名或密码不正确"));
        userClient.login(one);
        return one.getId();
    }

    @GetMapping("logout")
    public Long logout() {
        Long userId = userClient.getUserId();
        userClient.logout();
        return userId;

    }

    @GetMapping("info")
    public UserVO info() {
        Long userId = userClient.getUserId();
        Assert.notNull(userId, () -> new LoginException("用户未登录"));
        User user = userService.getById(userId);
        return user.convert(UserVO.class);
    }
}