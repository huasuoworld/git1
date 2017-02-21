package com.hua.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hua.app.vo.PackageManagerVO;

@Repository(value = "packageManagerMapper") 
public interface PackageManagerDAO {
	
	public String commit(PackageManagerVO vo);
	public String delete(PackageManagerVO vo);
	public String update(PackageManagerVO vo);
	public List<PackageManagerVO> search(PackageManagerVO vo);
	public Integer count(PackageManagerVO vo);
}
