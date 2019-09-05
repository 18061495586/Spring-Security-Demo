package com.spring.security.service;

import com.spring.security.entity.SysRequestPath;
import java.util.List;

/**
 * 请求路径(SysRequestPath)表服务接口
 *
 * @author makejava
 * @since 2019-09-04 17:11:16
 */
public interface SysRequestPathService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysRequestPath queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysRequestPath> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysRequestPath 实例对象
     * @return 实例对象
     */
    SysRequestPath insert(SysRequestPath sysRequestPath);

    /**
     * 修改数据
     *
     * @param sysRequestPath 实例对象
     * @return 实例对象
     */
    SysRequestPath update(SysRequestPath sysRequestPath);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}