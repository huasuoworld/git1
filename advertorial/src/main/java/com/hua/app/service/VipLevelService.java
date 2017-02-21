package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.VipLevelVO;

public interface VipLevelService {

	public String commit(VipLevelVO vo);
	public String delete(VipLevelVO vo);
	public String update(VipLevelVO vo);
	public List<VipLevelVO> search(VipLevelVO vo);
	public Integer count(VipLevelVO vo);
}
