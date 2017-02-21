package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.GunnerOrderVO;

public interface GunnerOrderService {

	public String commit(GunnerOrderVO vo);
	public String delete(GunnerOrderVO vo);
	public String update(GunnerOrderVO vo);
	public List<GunnerOrderVO> search(GunnerOrderVO vo);
	public Integer count(GunnerOrderVO vo);
}
