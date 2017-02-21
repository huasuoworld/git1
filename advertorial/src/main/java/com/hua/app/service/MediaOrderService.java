package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.MediaOrderVO;

public interface MediaOrderService {

	public String commit(MediaOrderVO vo);
	public String delete(MediaOrderVO vo);
	public String update(MediaOrderVO vo);
	public List<MediaOrderVO> search(MediaOrderVO vo);
	public Integer count(MediaOrderVO vo);
}
