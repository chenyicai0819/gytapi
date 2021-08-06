package cn.edu.guet.bll.impl;

import cn.edu.guet.bean.User;
import cn.edu.guet.bll.IMyRecordService;
import cn.edu.guet.mapper.MyRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author George
 * @project gytht
 * @package cn.edu.guet.bll.impl
 * @date 2021/8/5 16:26
 * @since 1.0
 */
@Service
public class MyRecordServiceImpl implements IMyRecordService {
    @Autowired
    private MyRecordMapper myRecordMapper;

    @Override
    public List<User> getUser() {
        return myRecordMapper.selectList(null);
    }
}
