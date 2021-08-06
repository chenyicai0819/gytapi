package cn.edu.guet.bll.impl;

import cn.edu.guet.bean.User;
import cn.edu.guet.bll.ITestService;
import cn.edu.guet.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author George
 * @project gytht
 * @package cn.edu.guet.bll.impl
 * @date 2021/8/5 15:55
 * @since 1.0
 */
@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private TestMapper testMapper;
    @Override
    public List<User> getUser() {
        //直接调用BaseMapper封装好的CRUD方法，就可实现无条件查询数据
        return testMapper.selectList(null);
    }
}
