package com.xinzhentech.study.common.base.service.impl;

import com.xinzhentech.study.common.base.entity.BaseEntity;
import com.xinzhentech.study.common.base.mapper.BaseMapper;
import com.xinzhentech.study.common.base.service.BaseService;
import com.xinzhentech.study.common.constant.Constant;
import com.xinzhentech.study.common.exception.BussinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Transactional(propagation= Propagation.SUPPORTS,readOnly=true)
public class BaseServiceImpl<D extends BaseMapper<T>, T extends BaseEntity<T>> implements BaseService<T> {

	/**
	 * 持久层对象
	 */
	@Autowired
	protected D dao;

	@Override
	public T get(String id) {
		return dao.get(id);
	}

	@Override
	public List<T> findList(T model) {
		return dao.findList(model);
	}

	@Override
	public List<T> findAll() {
		return dao.findAll();
	}

	@Override
	public int getCount(T model) {
		return dao.getCount(model);
	}

	/***************************** 增删改操作 *****************************/

	@Transactional(readOnly = false)
	@Override
	public void insert(T entity) {
		dao.insert(entity);
	}

	@Transactional(readOnly = false)
	@Override
	public void insertBatch(List<T> list) {
		if(CollectionUtils.isEmpty(list)){
			return ;
		}
		//批量提交的子列表
		List<T> subList=new ArrayList<T>();
		for (final T t : list) {
			subList.add(t);
			//子列表已满,批量提交
			if(subList.size() == Constant.BATCH_OPERATION_COUNT){
				dao.insertBatch(subList);
				subList=new ArrayList<T>();
			}
		}
		//子列表未满的部分,做一次批量提交
		if(subList.size() >0 && subList.size() < Constant.BATCH_OPERATION_COUNT){
			dao.insertBatch(subList);
		}
	}

	@Transactional(readOnly = false)
	@Override
	public void save(T entity) {
		int result = 0;
		result =  dao.insert(entity);

		if(result == Constant.INT_ZERO){
			throw new BussinessException("No saved records");
		}
	}

	@Transactional(readOnly = false)
	@Override
	public void update(T entity) {
		entity.preUpdate();
		int result = dao.update(entity);
		if(result == Constant.INT_ZERO){
			throw new BussinessException("No updated records");
		}
	}

	@Transactional(readOnly = false)
	@Override
	public void updateBatch(List<T> list) {
		if(CollectionUtils.isEmpty(list)){
			return ;
		}
		//批量提交的子列表
		List<T> subList=new ArrayList<T>();
		for (final T t : list) {
			t.preUpdate();
			subList.add(t);
			//子列表已满,批量提交
			if(subList.size() == Constant.BATCH_OPERATION_COUNT){
				int result = dao.updateBatch(subList);
				if(result == Constant.INT_ZERO){
					throw new BussinessException("No updated records");
				}
				subList=new ArrayList<T>();
			}
		}
		//子列表未满的部分,做一次批量提交
		if(subList.size() >0 && subList.size() < Constant.BATCH_OPERATION_COUNT){
			int result =   dao.updateBatch(subList);
			if(result == Constant.INT_ZERO){
				throw new BussinessException("No updated records");
			}
		}
	}

	@Transactional(readOnly = false)
	@Override
	public void delete(final String id) {
		int result = dao.delete(id);
		if(result == Constant.INT_ZERO){
			throw new BussinessException("Record not deleted, id="+id);
		}
	}

	@Transactional(readOnly = false)
	@Override
	public void deleteBatch(final String[] ids) {
		int result = dao.deleteBatch(ids);
		if(result == Constant.INT_ZERO){
			throw new BussinessException("Records not deleted, ids="+ Arrays.toString(ids));
		}
	}

	@Transactional(readOnly = false)
	@Override
	public void deleteLogic(final String id) {
		final int result = dao.deleteLogic(id);
		if(result == Constant.INT_ZERO){
			throw new BussinessException("Record not deleted, id="+id);
		}
	}


}
