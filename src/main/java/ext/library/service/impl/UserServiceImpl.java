package ext.library.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import ext.library.entity.User;
import ext.library.mapper.UserMapper;
import ext.library.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}