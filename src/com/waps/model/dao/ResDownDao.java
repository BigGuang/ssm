package com.waps.model.dao;

import com.waps.model.domain.ResDown;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author 金小光
 * @since 2018-01-30
 */
public interface ResDownDao {

    public int add(ResDown obj);
    public int delete(String id);
    public int update(ResDown obj);

    public ResDown getResDown(ResDown obj);
    public ResDown getResDownById(String id);

    public Long getTotal(Map<String, Object> map);
    public List<ResDown> getAll();
    public List<ResDown> find(Map<String, Object> map);

}