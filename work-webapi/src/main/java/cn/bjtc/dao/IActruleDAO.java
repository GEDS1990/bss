package cn.bjtc.dao;

import java.util.List;

import cn.bjtc.model.Actrule;
import cn.bjtc.view.ActruleView;

public interface IActruleDAO {

	public int saveActrule(ActruleView view);
	public int updateActrule(ActruleView view);
	public List<Actrule> findAllActrules(ActruleView view);
	public Integer countAllActrules(ActruleView view);
	 
} 
