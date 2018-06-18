package com.myin.team25.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myin.team25.domain.BoardVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:Config/root-context.xml"})

public class BoardServiceImplTest {
	
	@Autowired
	private BoardService bs;
	
	@Before
	public void setUp() throws Exception{
	
	}
	
	@Test
	public void testSelectBoardOne(){
		
		//System.out.println("bdf:"+bdf);
		BoardVo bv= bs.SelectBoardOne(5);
		
		assertEquals("tes",bv.getSubject());
		//System.out.println("bv:"+bv);
	}

}
