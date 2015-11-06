package or.kosta.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import or.kosta.mvc.dao.CustomerDao;
import or.kosta.mvc.dao.MemberDao;
import or.kosta.mvc.vo.CustomerVo;
import or.kosta.mvc.vo.MemberVo;

@Service
public class ServiceImp implements ServiceInter{
	@Autowired
	private MemberDao mdao;
	@Autowired
	private CustomerDao cdao;
	
	@Transactional
	@Override
	public void addAll(CustomerVo cvo, MemberVo mvo) throws Exception {
		mdao.memberAdd(mvo);
		System.out.println("LOG MEMBER OK");
		cdao.customerAdd(cvo);
		System.out.println("LOG CUSTOMER OK");
	}

	
	
}
