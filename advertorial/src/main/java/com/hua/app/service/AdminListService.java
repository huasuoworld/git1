package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.AdminListVO;

public interface AdminListService {

	public String commit(AdminListVO vo);
	public String delete(AdminListVO vo);
	public String update(AdminListVO vo);
	public List<AdminListVO> search(AdminListVO vo);
	public Integer count(AdminListVO vo);
}
