package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.MediaOrderDetailVO;

public interface MediaOrderDetailService {

	public String commit(MediaOrderDetailVO vo);
	public String delete(MediaOrderDetailVO vo);
	public String update(MediaOrderDetailVO vo);
	public List<MediaOrderDetailVO> search(MediaOrderDetailVO vo);
	public Integer count(MediaOrderDetailVO vo);
}
