package com.team05.noticeboard.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team05.command.NoticeVO;
import com.team05.common.util.Criteria;
import com.team05.noticeboard.mapper.NoticeBoardMapper;

@Service("noticeBoardService")
public class NoticeBoardServiceImpl implements NoticeBoardService{
	
	@Autowired
	private NoticeBoardMapper noticeBoardMapper; 
	

	@Override
	public void regist(NoticeVO vo) {
		
		noticeBoardMapper.regist(vo);
	}

	@Override
	public NoticeVO getContent(int nno) {
		return noticeBoardMapper.getContent(nno);
	}

	@Override
	public int update(NoticeVO vo) {
		
		return noticeBoardMapper.update(vo);
	}

	@Override
	public int delete(int nno) {
		return noticeBoardMapper.delete(nno);
	}

	@Override
	public ArrayList<NoticeVO> getList(Criteria cri) {
		
		return noticeBoardMapper.getList(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		
		return noticeBoardMapper.getTotal(cri);
	}
	
	
	

}
