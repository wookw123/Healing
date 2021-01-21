package com.team05.user.mapper;

import java.util.ArrayList;

import com.team05.command.Reserve_imgVO;
import com.team05.command.ReviewVO;
import com.team05.command.Review_imgVO;
import com.team05.command.UserVO;

public interface UserMapper {
	public ArrayList<Reserve_imgVO> showmypage(UserVO uservo);
	public ArrayList<Review_imgVO> getreview(UserVO uservo);
	
	
}
