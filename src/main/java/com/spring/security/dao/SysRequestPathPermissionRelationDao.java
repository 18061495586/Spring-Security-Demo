package com.spring.security.dao;

import com.spring.security.entity.SysRequestPathPermissionRelation;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 路径权限关联表(SysRequestPathPermissionRelation)表数据库访问层
 *
 * @author makejava
 * @since 2019-09-04 17:11:53
 */
public interface SysRequestPathPermissionRelationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    SysRequestPathPermissionRelation queryById( );

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysRequestPathPermissionRelation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysRequestPathPermissionRelation 实例对象
     * @return 对象列表
     */
    List<SysRequestPathPermissionRelation> queryAll(SysRequestPathPermissionRelation sysRequestPathPermissionRelation);

    /**
     * 新增数据
     *
     * @param sysRequestPathPermissionRelation 实例对象
     * @return 影响行数
     */
    int insert(SysRequestPathPermissionRelation sysRequestPathPermissionRelation);

    /**
     * 修改数据
     *
     * @param sysRequestPathPermissionRelation 实例对象
     * @return 影响行数
     */
    int update(SysRequestPathPermissionRelation sysRequestPathPermissionRelation);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 影响行数
     */
    int deleteById( );

}