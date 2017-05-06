package cn.bjtc.dao.impl;
 

import org.springframework.stereotype.Component;
import cn.bjtc.dao.IProdParmDAO;
import cn.bjtc.dao.mybatis.MyBatisDAO;
import cn.bjtc.model.ProdParm;
 

@Component("ProdparmDAO)")
public  class ProdParmDAOImpl extends MyBatisDAO<ProdParm, Integer> 
              implements  IProdParmDAO{

	public int saveProdParms(ProdParm prodParm) {
		return super.save("saveProdParms",prodParm);		
	}

	public int delectById(Object productid) {
		return super.delete("delectById", productid);
	}

}
