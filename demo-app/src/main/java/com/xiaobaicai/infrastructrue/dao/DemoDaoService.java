package com.xiaobaicai.infrastructrue.dao;

import com.xiaobaicai.infrastructrue.bean.UserBean;
import com.xiaobaicai.infrastructrue.util.TimeUtil;
import org.springframework.stereotype.Service;


/**
 * @author caijy
 * @date 2022/7/16 星期六 9:57 下午
 */
@Service
public class DemoDaoService {

    public UserBean selectById(String uid) {
        // 模拟数据库查询
        TimeUtil.mockTimeCost(200);
        // 返回
        UserBean userBean = new UserBean();
        userBean.setPassword("123456");
        userBean.setNickName("小白菜");
        return userBean;
    }
}
