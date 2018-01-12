package com.zkyt.dga.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：系统支持多文件上传
 * 时 间 ：2017-12-2 上午9:46:34
 */
@Controller
public class UploadController {
	@RequestMapping("/upload")
	public void uploads(@RequestParam MultipartFile[] files,HttpServletRequest request){
		try {
			for (MultipartFile file : files) {
				//获取文件原始名
				String filename = file.getOriginalFilename();
				//上传相对路径
				String path = "upload/"+filename;
				//获取上传绝对路径
				String url = request.getSession().getServletContext().getRealPath("/")+path;
				file.transferTo(new File(url));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
