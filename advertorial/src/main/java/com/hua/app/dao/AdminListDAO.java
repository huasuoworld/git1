package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.AdminListVO;

@Repository(value = "adminListMapper") 
public interface AdminListDAO {
	
	public String commit(AdminListVO vo);
	public String delete(AdminListVO vo);
	public String update(AdminListVO vo);
	public List<AdminListVO> search(AdminListVO vo);
	public Integer count(AdminListVO vo);

}
