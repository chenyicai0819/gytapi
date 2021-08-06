package cn.edu.guet.mapper;

import cn.edu.guet.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author George
 * @project gytht
 * @package cn.edu.guet.mapper
 * @date 2021/8/5 16:24
 * @since 1.0
 */
@Mapper
public interface MyRecordMapper extends BaseMapper<User> {
}
