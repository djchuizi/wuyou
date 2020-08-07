package com.wuyou.generator.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wuyou.generator.domain.GenTable;

import java.util.List;
import java.util.Map;

/**
 * 业务 服务层
 *
 * @author wuyou
 */
public interface IGenTableService extends IService<GenTable> {

  /**
   * 查询业务列表
   *
   * @param page     分页对象
   * @param genTable 业务信息
   * @return 业务集合
   */
  IPage<GenTable> page(Page<GenTable> page, GenTable genTable);

  /**
   * 查询业务列表
   *
   * @param genTable 业务信息
   * @return 业务集合
   */
  List<GenTable> list(GenTable genTable);

  /**
   * 查询据库列表
   *
   * @param page     分页对象
   * @param genTable 业务信息
   * @return 数据库表集合
   */
  IPage<GenTable> pageDbTable(Page<GenTable> page, GenTable genTable);

  /**
   * 查询据库列表
   *
   * @param genTable 业务信息
   * @return 数据库表集合
   */
  List<GenTable> listDbTable(GenTable genTable);

  /**
   * 查询据库列表
   *
   * @param tableNames 表名称组
   * @return 数据库表集合
   */
  List<GenTable> listDbTableByNames(String[] tableNames);

  /**
   * 查询所有表信息
   *
   * @return 表信息集合
   */
  List<GenTable> listAll();

  /**
   * 查询业务信息
   *
   * @param id 业务ID
   * @return 业务信息
   */
  GenTable getById(Long id);

  /**
   * 修改业务
   *
   * @param genTable 业务信息
   * @return 结果
   */
  void updateGenTable(GenTable genTable);

  /**
   * 删除业务信息
   *
   * @param ids 需要删除的数据ID
   * @return 结果
   */
  void removeByIds(String ids);

  /**
   * 导入表结构
   *
   * @param tableList 导入表列表
   * @param operName  操作人员
   */
  void importGenTable(List<GenTable> tableList, String operName);

  /**
   * 预览代码
   *
   * @param tableId 表编号
   * @return 预览数据列表
   */
  Map<String, String> previewCode(Long tableId);

  /**
   * 生成代码（下载方式）
   *
   * @param tableName 表名称
   * @return 数据
   */
  byte[] downloadCode(String tableName);

  /**
   * 生成代码（自定义路径）
   *
   * @param tableName 表名称
   * @return 数据
   */
  void generatorCode(String tableName);

  /**
   * 批量生成代码（下载方式）
   *
   * @param tableNames 表数组
   * @return 数据
   */
  byte[] downloadCode(String[] tableNames);

  /**
   * 修改保存参数校验
   *
   * @param genTable 业务信息
   */
  void validateEdit(GenTable genTable);
}
