package cn.edu.guet.bll;

import cn.edu.guet.bean.User;

import java.util.List;

/**
 * @author George
 * @project gytSptingboot-vue
 * @package cn.edu.guet.bll
 * @date 2021/8/4 10:02
 * @since 1.0
 */
public interface ITestService {
    List<User> getUser();
}
