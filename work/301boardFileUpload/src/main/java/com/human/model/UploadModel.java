package com.human.model;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface UploadModel {
	public List<String> getFiles(Integer bno)throws Exception;

	public void deleteFile(String fullName)throws Exception;

	public void addFile(String fullName, Integer bno)throws Exception;
	public void deleteFileAll(Integer bno)throws Exception;
}
