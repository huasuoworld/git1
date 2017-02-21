package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.VipListVO;

public interface VipListService {

	public String commit(VipListVO vo);
	public String delete(VipListVO vo);
	public String update(VipListVO vo);
	public List<VipListVO> search(VipListVO vo);
	public Integer count(VipListVO vo);
}
