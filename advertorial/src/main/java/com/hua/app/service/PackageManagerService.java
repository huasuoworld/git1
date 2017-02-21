package com.hua.app.service;

import java.util.List;

import com.hua.app.vo.PackageManagerVO;

public interface PackageManagerService {

	public String commit(PackageManagerVO vo);
	public String delete(PackageManagerVO vo);
	public String update(PackageManagerVO vo);
	public List<PackageManagerVO> search(PackageManagerVO vo);
	public Integer count(PackageManagerVO vo);
}
