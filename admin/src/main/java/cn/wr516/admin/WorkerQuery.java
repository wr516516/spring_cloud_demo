package cn.wr516.admin;

import cn.pinming.core.service.permission.access.DataAccessRange;
import lombok.Data;

/**
 * 工人表分页查询Query
 * @author
 * @version 1.0
 * @created 2016-12-06 14:26:25
 */
/**
 * @author zzw
 *
 */
@Data
public class WorkerQuery  {
	/**
	 *
	 * 用于序列化标示
	 *
	 */
	private static final long serialVersionUID = 1L;


	private DataAccessRange dataAccessRange;


	private Integer company_id;
	private String memberId;
}
