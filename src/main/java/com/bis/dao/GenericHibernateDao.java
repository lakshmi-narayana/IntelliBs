package com.bis.dao;

import java.io.Serializable;
import java.util.List;
public interface GenericHibernateDao<T extends Serializable>
{
    /**
     * 
     * @param entity to save if it inserts first and update if already id is present
     * @return noting 
     */
    public void saveOrUpdate(T entity);

    /**
     * 
     */
    public List<T> saveOrUpdateList(List<T> entityList);

   /**
    * 
    * @param entity
    */
    public void create(final T entity);

    /**
     * 
     * @param entity
     */
    public void save(final T entity);

    /**
     * 
     * @param entity
     * @return entity
     */
    public T update(final T entity);

    /**
     * 
     * @param id
     * @return entity
     */
    public T findOne(final long id);

    /**
     * 
     * @return List<entity>
     */
    public List<T> findAll();

    /**
     * 
     * @param entity
     */
    public void delete(final T entity);
    /**
     * 
     * @param id
     */
    public void deleteById(final long id);


}