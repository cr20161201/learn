package com.soecode.wxx.mapper;



import com.soecode.wxx.dto.ItemsCustom;
import com.soecode.wxx.dto.ItemsQueryVo;
import com.soecode.wxx.entry.Items;

import java.util.List;


/**
 *
 * 
 * <p>
 * Title: ItemsMapperCustom
 * </p>
 * <p>
 * Description:商品自定义mapper
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 传智.燕青
 * @date 2015-3-20下午3:00:53
 * @version 1.0
 */
public interface ItemsMapperCustom {
	// 商品查询列表
	List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception;

}
