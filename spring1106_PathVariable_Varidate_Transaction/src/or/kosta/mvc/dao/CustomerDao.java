package or.kosta.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import or.kosta.mvc.vo.CustomerVo;

@Repository
public class CustomerDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void customerAdd(CustomerVo vo){
		sqlSessionTemplate.insert("customer.customerAdd",vo);
	}
}
