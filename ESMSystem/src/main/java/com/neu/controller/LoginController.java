package com.neu.controller;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neu.entity.Admin;
import com.neu.entity.RespBean;
import com.neu.service.AdminService;


@RestController
@RequestMapping("admin")
public class LoginController {
		@Autowired
		private AdminService adminService;
		
		@RequestMapping("login")
		public RespBean login(String username,String password,String code,HttpSession session) {
			String sessionCode =  (String)session.getAttribute("code");
			if(!sessionCode.equalsIgnoreCase(code)) {
				RespBean respBean = new RespBean("error", "验证码错误！");
				return respBean;
			}				
			Admin admin = adminService.login(username, password);			
			if(admin == null) {
				RespBean respBean = new RespBean("error", "用户名或密码错误！");
				return respBean;
			}
			System.out.println(admin);
			return new RespBean("success", "登录成功", admin);
		}
		
		@RequestMapping("code")
		public void getCode(HttpServletResponse response,HttpSession session) throws IOException {
			//创建图片，设置图片大小和类型
			BufferedImage buffImg = new BufferedImage(50, 30, BufferedImage.TYPE_INT_RGB);
			//得到画布
			Graphics g = buffImg.getGraphics();
			//创建字体
			Font font = new Font("宋体", Font.BOLD, 16);
			//为画布设置字体
			g.setFont(font);
			
			String code = "";
			Random r = new Random();
			for(int i = 1;i <= 4;i++) {
				code += r.nextInt(10);
			}	
			session.setAttribute("code", code);
			System.out.println(session.getAttribute("code"));
			//向画布从写入字符串
			g.drawString(code,10,25);
			//设置响应类型为：图片
			response.setContentType("image/jpeg");
			
			ServletOutputStream stream = response.getOutputStream();
			//使用ImageIO工具类，把图片按照指定的格式写入到响应流中
			ImageIO.write(buffImg, "jpeg", stream);
			//关闭响应流
			stream.close();
		}
		
}
