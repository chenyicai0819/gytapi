package cn.edu.guet.bll;

import cn.edu.guet.bean.User;

import java.util.List;

/**
 * @author George
 * @project gytht
 * @package cn.edu.guet.bll
 * @date 2021/8/5 16:26
 * @since 1.0
 */
public interface IMyRecordService {
    List<User> getUser();
}
